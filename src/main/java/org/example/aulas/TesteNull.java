package org.example.aulas;

import org.example.aulas.classes.Aluno;

public class TesteNull {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println(aluno.name);
        System.out.println(aluno.age);
        Integer idade = 18;
        System.out.println(idade.floatValue());
        System.out.println(idade);
        Integer isTrue = null;
        printIdade(isTrue.intValue());

        //LEIA AS LETRAS VERMELHAS
    }
    private static void printIdade(int value) {
        System.out.println(value);
    }
}