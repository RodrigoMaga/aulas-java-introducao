package org.example.aulas;

import org.example.helpers.InputUserTerminal;

public class ExercicioIf3 {
    public static void main(String[] args) {
        int convertedYear = InputUserTerminal.askInt("Insira o ano: ");
        boolean isLeapYear = convertedYear % 4 == 0;
        isLeapYear = isLeapYear && (convertedYear %100 != 0 || convertedYear % 400 == 0);

        if (isLeapYear) {
            System.out.println("O ano " + convertedYear + " e bissexto.");
        } else {
            System.out.println("O ano " + convertedYear + " nao e bissexto.");
        }
    }
}
