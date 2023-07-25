package org.example.aulas;

public class TesteArray2D {
    public static void main(String[] args) {
        int[] notas = {100,200,300};
        int[][] notas2d = { {100, 200, 300}, {1, 2, 3} };
//        System.out.println(notas2d[0][1]);

        for (int[] nota2d : notas2d) {
            for (int innerNota2d : nota2d){
                System.out.println(innerNota2d);
            }
        }
    }
}
