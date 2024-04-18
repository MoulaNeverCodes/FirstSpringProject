package com.example.FirstSpringBootProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String aname;
    private String atech;

    @Autowired
    @Qualifier("lap1")
    private laptop Laptop;
    public Alien() {
        System.out.println("Object is created");
    }

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getAtech() {
        return atech;
    }
    public void setAtech(String atech) {
        this.atech = atech;
    }

    

    
    public void show(){
        System.out.println("Show is running successfuly...");
        Laptop.Compiling();

    }

    public laptop getLaptop() {
        return Laptop;
    }

    public void setLaptop(laptop laptop) {
        Laptop = laptop;
    }




    

}
