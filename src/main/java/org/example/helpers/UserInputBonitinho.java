package org.example.helpers;

import javax.swing.*;

public class UserInputBonitinho {
    public static int askInt(String userInput) {
        String input = JOptionPane.showInputDialog(userInput);
        int inputConverted = Integer.parseInt(input);
        return inputConverted;
    }
}
