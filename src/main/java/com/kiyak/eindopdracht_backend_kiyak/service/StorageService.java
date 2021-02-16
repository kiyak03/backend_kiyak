package com.kiyak.eindopdracht_backend_kiyak.service;


import com.kiyak.eindopdracht_backend_kiyak.domain.DemoFiles;
import com.kiyak.eindopdracht_backend_kiyak.repository.DemoFilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class StorageService {

    private static DemoFilesRepository demoFilesRepository;

    @Autowired
    public StorageService(DemoFilesRepository demoFilesRepository) {
        this.demoFilesRepository = demoFilesRepository;
    }

    public void save(MultipartFile file) throws IOException {
        DemoFiles fileEntity = new DemoFiles();
        fileEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        fileEntity.setContentType(file.getContentType());
        fileEntity.setData(file.getBytes());
        fileEntity.setSize(file.getSize());

        demoFilesRepository.save(fileEntity);
    }

    public static Optional<DemoFiles> getFile(String id) {
        return demoFilesRepository.findById(id);
    }

    public List<DemoFiles> getAllFiles() {
        return demoFilesRepository.findAll();
    }
}

//    public DemoFiles store(MultipartFile file) throws IOException {
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//        DemoFiles DemoFiles = new DemoFiles(fileName, file.getContentType(), file.getBytes());
//
//        return demoFilesRepository.save(DemoFiles);
//    }
//
//    public DemoFiles getFile(String id) {
//        return demoFilesRepository.findById(id).get();
//    }
//
//    public Stream<DemoFiles> getAllFiles() {
//        return demoFilesRepository.findAll().stream();
//    }


