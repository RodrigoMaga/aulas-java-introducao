package org.example.aulas.methods;


import org.example.helpers.InputUserTerminal;

public class ExercicioIfWithMethods {
    public static void main(String[] args) {
        int realGrade = InputUserTerminal.askInt("Digite a nota do aluno: ");
        String temp = "Ronaldinho gaucho";
        HandleGrades.isGradeA(temp);
        System.out.println(temp);
        System.out.println(System.identityHashCode(temp));
    }
}