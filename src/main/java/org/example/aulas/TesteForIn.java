package org.example.aulas;

public class TesteForIn {
    public static void main(String[] args) {
        int[] notas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int notaa = notas[2];
        for (int nota : notas) {
            if (nota == 0) {
                System.out.println("Mateus " + nota);
            }else if (nota == 1) {
                System.out.println("Rodrigo " + nota);

            } else if (nota == 3) {
                System.out.println("Gustavo " + nota);
            }
        }
    }
}