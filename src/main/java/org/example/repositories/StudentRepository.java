package org.example.repositories;

import org.example.domain.Student;

public class StudentRepository {
    public static Student[] findAll() {
        //instanciar = usar "new"
        Student rodrigo = new Student();
        Student mateus = new Student();
        Student gustavo = new Student();
        Student cesar = new Student();

        //Simples atribuição
        rodrigo.name = "Rodrigo Magalhaes Nunes";
        rodrigo.email = "rodrigo_dimenor@hotmail.com";
        rodrigo.grade = 7.5f;

        mateus.name = "Mateus Gomes da Silva Cardoso";
        mateus.email = "mateus@gmail.com";
        mateus.grade = 2.5f;

        cesar.name = "Cesar Henrique Matos Porto";
        cesar.email = "cesar@proton.com";
        cesar.grade = 5.4f;

        gustavo.name = "Gustavo Magalhaes Nunes";
        gustavo.email = "gustavo@bol.com";
        gustavo.grade = 6.2f;

        //declarando/populando o array
        return new Student[]{
                rodrigo,
                mateus,
                cesar,
                gustavo
        };
    }
}