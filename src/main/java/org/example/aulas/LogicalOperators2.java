package org.example.aulas;

import javax.swing.*;
import java.math.BigDecimal;

public class LogicalOperators2 {
   static int usaLegalAge = 16;
   static int brazilLegalAge = 18;

    public static void main(String[] args) {
        String age = JOptionPane.showInputDialog("Idade");
        int convertedAge = Integer.parseInt(age);
        boolean canDriveBrazil = convertedAge >= brazilLegalAge;
        boolean canDriveUsa = convertedAge >= usaLegalAge;
        if (canDriveBrazil || canDriveUsa){
            if (canDriveBrazil) {
                System.out.println("Pode dirigir no Brasil");
            } else {
                System.out.println("Pode dirigir nos EUA");
            }
            return;
        }
        System.out.println("Não pode dirigir");
    }
}
