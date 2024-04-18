package com.example.FirstSpringBootProj;

import org.springframework.stereotype.Component;

@Component("lap1")
public class laptop {
    private int Lid;
    private String brand;
    public int getLid() {
        return Lid;
    }
    public void setLid(int lid) {
        Lid = lid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "laptop [Lid=" + Lid + ", brand=" + brand + "]";
    }

    public void Compiling(){
        System.out.println("Compiling...");
    }
}
