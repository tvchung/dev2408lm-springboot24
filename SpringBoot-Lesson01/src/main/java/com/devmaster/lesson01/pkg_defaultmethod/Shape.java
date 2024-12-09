package com.devmaster.lesson01.pkg_defaultmethod;

public interface Shape {
    void Draw();

    default  void setColor(String color) {
        System.out.println("Vẽ hình với màu; "+ color);
    }
}
