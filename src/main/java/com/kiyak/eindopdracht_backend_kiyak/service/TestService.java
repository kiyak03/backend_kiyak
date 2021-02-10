package com.kiyak.eindopdracht_backend_kiyak.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String generatePublicContent() {
        return "Public Content.";
    }

   @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String generateUserContent() {
        return "User Content.";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public String generateAdminContent() {
        return "Admin Board.";
    }

}
