package com.kiyak.eindopdracht_backend_kiyak.service;


import com.kiyak.eindopdracht_backend_kiyak.domain.DemoFiles;
import com.kiyak.eindopdracht_backend_kiyak.repository.DemoFilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileStorageService {


    @Autowired
    private DemoFilesRepository demoFilesRepository;

    public DemoFiles store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        DemoFiles DemoFiles = new DemoFiles(fileName, file.getContentType(), file.getBytes());

        return demoFilesRepository.save(DemoFiles);
    }

    public DemoFiles getFile(String id) {
        return demoFilesRepository.findById(id).get();
    }

    public Stream<DemoFiles> getAllFiles() {
        return demoFilesRepository.findAll().stream();
    }
}

