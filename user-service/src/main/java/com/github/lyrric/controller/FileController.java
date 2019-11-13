package com.github.lyrric.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created on 2019-11-13.
 *
 * @author wangxiaodong
 */
@RestController
@RequestMapping(value = "/file")
public class FileController {


    @PostMapping(value = "/upload")
    String upload(MultipartFile file){
        return file.getOriginalFilename();
    }
}
