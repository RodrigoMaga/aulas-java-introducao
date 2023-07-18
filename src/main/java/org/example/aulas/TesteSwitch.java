package org.example.aulas;

import javax.swing.*;

public class TesteSwitch {
    public static void main(String[] args) {
        String paymentType = JOptionPane.showInputDialog("Informe o pagamento!");
        switch (paymentType) {
            case "pix" -> System.out.println("Pagamento pix");
            case "dinheiro" -> System.out.println("Pagamento dinheiro");
            case "credito" -> System.out.println("Pagamento credito");
            default -> System.out.println("Escolha uma forma valida de pagamento");
        }
    }
}