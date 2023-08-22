package org.example.aulas;

import org.example.aulas.classes.GeometricShape;
import org.example.aulas.classes.Square;
import org.example.aulas.classes.Triangle;

public class TestePolimorfismo {
    public static void main(String[] args) {
        GeometricShape triangleShape = new Triangle();
        GeometricShape squareShape = new Square();

        triangleShape.comprimento = 20;
        triangleShape.altura = 30;

        squareShape.comprimento = 10;
        squareShape.altura = 10;

        TestePolimorfismo testePolimorfismo = new TestePolimorfismo();
        testePolimorfismo.printArea(triangleShape);
        testePolimorfismo.printArea(squareShape);
    }

    private void printArea(GeometricShape geometricShape) {
        System.out.println(geometricShape.getClass().getName());
        System.out.println(geometricShape.comprimento);
        System.out.println(geometricShape.altura);
        System.out.println(geometricShape.calculateArea());
    }
}
