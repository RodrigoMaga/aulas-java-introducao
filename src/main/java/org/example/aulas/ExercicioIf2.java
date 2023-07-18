package org.example.aulas;

import javax.swing.*;

public class ExercicioIf2 {
    public static void main(String[] args) {
        String grade = JOptionPane.showInputDialog("Insira sua nota!");
        int convertedGrade = Integer.parseInt(grade);

        if (convertedGrade >= 90) {
            System.out.println("Sua nota corresponde a um A - Excelente");
        } else if (convertedGrade < 90 && convertedGrade >= 80) {
            System.out.println("Sua nota corresponde a um B - Bom");
        } else if (convertedGrade < 80 && convertedGrade >= 70) {
            System.out.println("Sua nota corresponde a um C - Regular");
        } else if (convertedGrade < 70 && convertedGrade >= 60) {
            System.out.println("Sua nota corresponde a um D - Precisa melhorar");
        } else if (convertedGrade < 60) {
            System.out.println("Sua nota corresponde a um E - Reprovado");
        }

    }
}
