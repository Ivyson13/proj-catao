package br.com.opendrive.Drive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.opendrive.Drive.entity.File;
import br.com.opendrive.Drive.service.FileService;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public File createFile(@RequestParam String name, @RequestParam String content, @RequestParam Long folderId) {
        return fileService.createFile(name, content, folderId);
    }

    @GetMapping("/folder/{folderId}")
    public List<File> getFilesByFolder(@PathVariable Long folderId) {
        return fileService.getFilesByFolder(folderId);
    }

    // Other endpoints
}
