package org.example.aulas.classes;

import org.example.helpers.InputUserTerminal;

public class AppMain {
    public static void main(String[] args) {
        Aluno rodrigo = new Aluno();
        Aluno mateus = new Aluno();

        rodrigo.name = InputUserTerminal.askString("Informe o nome do aluno: ");
        rodrigo.email = InputUserTerminal.askString("Informe o e-mail do aluno: ");
        rodrigo.age = InputUserTerminal.askInt("Informe a idade do aluno: ");

        mateus.name = InputUserTerminal.askString("Informe o nome do aluno: ");
        mateus.email = InputUserTerminal.askString("Informe o e-mail do aluno: ");
        mateus.age = InputUserTerminal.askInt("Informe a idade do aluno: ");

        printAlunoClass(rodrigo);
        printAlunoClass(mateus);
    }
    public static void printAlunoClass(Aluno student) {
        System.out.println("Nome: " + student.name);
        System.out.println("E-mail: " + student.email);
        System.out.println("Idade: " + student.age);

    }
}