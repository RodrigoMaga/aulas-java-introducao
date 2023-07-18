package org.example.aulas;

import org.example.helpers.UserInputBonitinho;

import javax.swing.*;

public class TesteIf {
    public static void main(String[] args) {
        int userAgeConverted = UserInputBonitinho.askInt("Insira a idade: ");
        int legalAge = 18;
        if (userAgeConverted == 17) {
            System.out.println("Ta quase la fera");
        } else if (userAgeConverted >= legalAge) {
            System.out.println("Parabens");
        } else {
            System.out.println("ERRO");
        }
    }
}