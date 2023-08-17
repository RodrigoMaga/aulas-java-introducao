package org.example.aulas;

import org.example.aulas.classes.Balconista;
import org.example.aulas.classes.Radiologista;

public class TesteHeranca {
    public static void main(String[] args) {
        Radiologista radiologista = new Radiologista();
        Balconista balconista = new Balconista();
        balconista.idade = 65;
        System.out.println(balconista.isRetired());

        radiologista.idade = 45;
        System.out.println(radiologista.isRetired());
    }
}
