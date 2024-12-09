package com.devmaster.lesson03.controller;

import com.devmaster.lesson03.entity.Khoa;
import com.devmaster.lesson03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @GetMapping("/khoas")
    public List<Khoa> getAllKhoas(){
        return  khoaService.getKhoaList();
    }
}
