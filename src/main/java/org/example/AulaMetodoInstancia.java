package org.example;

import org.example.domain.Student;

public class AulaMetodoInstancia {
    public static void main(String[] args) {

        Student rodrigo = new Student();
        Student mateus = new Student();

        rodrigo.name = "Rodrigo Magalhaes Nunes";
        rodrigo.email = "rodrigo@gmail.com";
        rodrigo.grade = 9.5f;
        System.out.println(rodrigo.isApproved());

        mateus.name = "Mateus Gomes";
        mateus.email = "mateus@gmail.com";
        mateus.grade = 4.5f;
        System.out.println(mateus.isApproved());
    }
}