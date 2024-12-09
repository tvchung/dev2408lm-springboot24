package com.devmaster.lesson03.entity;

import java.io.StringReader;

public class Khoa {
    String maKH;
    String tenKH;

    public Khoa() {
    }

    public Khoa(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
