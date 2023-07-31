package org.example.aulas;

public class ExercicioArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 30, 20};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        System.out.println("O valor máximo é: " + max);
        System.out.println("O valor mínimo é: " + min);
        }
    }