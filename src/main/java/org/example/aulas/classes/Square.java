package org.example.aulas.classes;

public class Square extends GeometricShape {


    @Override
    public double calculateArea(){
        return altura * comprimento;
    }
}
