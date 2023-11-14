package com.ubl.studentweb.Domain;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String address;
    private LocalDate dateofBirth;
    private String nim;

    public Student(){
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
    }

    public LocalDate getDateofBirth(){
        return dateofBirth;
    }
    public void setDateofBirth(LocalDate dateofBirth){
        this.dateofBirth=dateofBirth;
    }
    
}
