package com.kiyak.eindopdracht_backend_kiyak;


import com.kiyak.eindopdracht_backend_kiyak.payload.request.SignupRequest;
import com.kiyak.eindopdracht_backend_kiyak.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * In deze klasse voegen we drie gebruikers met één rol toe en eentje met allen:
 * admin, admin@admin.nl, 123456, ROL: admin
 * mod, mod@mod.nl, 123456, ROL: mod
 * user, user@user.nl, 123456, ROL: user
 * superuser, super@user.nl, 123456, ROLLEN: Admin, mod, user
 *
 * UITLEG COMPONENT ANNOTATIE
 * http://zetcode.com/springboot/component/
 */
@Component
public class DatabaseFiller implements CommandLineRunner {

    private final AuthorizationService authorizationService;


    @Autowired
    public DatabaseFiller(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @Override
    public void run(String... args) {

        Set<String> rollen = new HashSet<>();
        rollen.add("admin");

        SignupRequest admin = new SignupRequest();
        admin.setUsername("diablo");
        admin.setEmail("diablo@hexagon.nl");
        admin.setPassword("hexagon");
        admin.setRole(rollen);
        authorizationService.registerUser(admin);

        SignupRequest user = new SignupRequest();
        user.setUsername("user");
        user.setEmail("user@live.nl");
        user.setPassword("user123");
        rollen.add("user");
        user.setRole(rollen);
        authorizationService.registerUser(user);

        SignupRequest superuser = new SignupRequest();
        superuser.setUsername("superuser");
        superuser.setEmail("super@user.nl");
        superuser.setPassword("123456");
        rollen.add("admin");
        superuser.setRole(rollen);
        authorizationService.registerUser(superuser);

    }
}
