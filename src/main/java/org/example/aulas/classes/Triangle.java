package org.example.aulas.classes;

public class Triangle extends GeometricShape {

    @Override
    public double calculateArea(){
        return (altura * comprimento) / 2;
    }
}
