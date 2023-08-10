package org.example.domain;

public class Student {
    public String name;
    public String email;
    public float grade;
//todo: colocar nota em letra ABC
    public boolean isApproved() {
        System.out.println("Nota: " + grade);
        return grade >= 6;
    }
}