package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();

    public KhoaService() {
        khoaList.addAll(Arrays.asList(
                new Khoa("AV","Anh văn"),
                new Khoa("TH","Tin học"),
                new Khoa("TR","Triết học")
                ));
    }

    // Get all
    public List<Khoa> getKhoaList() {
        return khoaList;
    }
    // Get By id
    public Khoa getKhoa(String makh) {
        return khoaList.stream().filter(k->k.getMaKH().equals(makh)).findFirst().orElse(null);
    }

}
