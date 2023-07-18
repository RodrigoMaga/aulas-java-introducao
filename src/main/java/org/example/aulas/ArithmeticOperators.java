package org.example.aulas;

public class ArithmeticOperators {
    public static void main(String[] args) {
        double x = 15;
        double y = 7;

        System.out.println("Value x: " + x);
        System.out.println("Value y: " + y);

        double addition = x + y;
        System.out.println("addition: " + addition);

        double subtraction = x - y;
        System.out.println("subtraction: " + subtraction);

        double multiplication = x * y;
        System.out.println("multiplication: " + multiplication);

        double division = x / y;
        System.out.println("division: " + division);

        //resto da divisão
        double remainders = x % y;
        System.out.println("remainders: " + remainders);

        x--;
//        --y;
        System.out.println("Value x: " + x);
        System.out.println("Value y: " + y);

        y += 7;
//        y = y - 7;
        System.out.println("Value y: " + y);
        System.out.println(x + y);
    }
}
