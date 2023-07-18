package org.example.aulas;

import org.example.helpers.InputUserTerminal;

public class ExercicioIf1 {
    public static void main(String[] args) {
        int number = InputUserTerminal.askInt("Insira um numero: ");
        boolean isEven = number % 2 == 0;
        // essa equação eu peguei de um site, mas entendi o funcionamento quando vi, eu faço a divisão por 2 se o resto for 0 o número é par.


        if (isEven) {
            System.out.println("O numero " + number + " e par");
        } else {
            System.out.println("O numero " + number + " e impar");
        }

    }
}
