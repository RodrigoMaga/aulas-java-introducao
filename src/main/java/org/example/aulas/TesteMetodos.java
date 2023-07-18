package org.example.aulas;

import javax.swing.*;

public class TesteMetodos {
    final static int a = 10;
    final static int b = 30;
    final static String texto = System.getenv("JAVA_HOME");

    public static void subtraction() {
        int result = a - b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(texto);
//        String method = JOptionPane.showInputDialog("Informe o tipo de calculo!");

//        if (method.equals("Soma")){
            addition();
//        } else if (method.equals("Subtracao")){
            subtraction();
//        } else if (method.equals("Divisao")){
            division();

        System.out.println("Programa terminado!");
    }

    public static void addition() {
        int result = a + b;
        System.out.println(result);
    }
    public static void division() {
        int result = a / b;
        System.out.println(result);
    }
}