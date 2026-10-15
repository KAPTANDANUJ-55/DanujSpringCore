package org.Demo;

import java.beans.ConstructorProperties;

public class Cj1 {

   private int age;
    private String name;
    private int aadhar;
    private String email;

    public Cj1(int age, String name, int aadhar, String email) {
        this.age = age;
        this.name = name;
        this.aadhar = aadhar;
        this.email = email;
    }

    public Cj1(int age){
        this.age = age;
        System.out.println("Para Constructor Called");
    }
  @ConstructorProperties({"age","name"})
    public Cj1(int  age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
