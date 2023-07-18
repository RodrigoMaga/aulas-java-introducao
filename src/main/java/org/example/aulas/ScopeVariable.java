package org.example.aulas;

public class ScopeVariable { //Primeiro escopo
    public static void main(String[] args) { //Segundo escopo
        int x = 10;

        if (x > 9) { //Terceiro Escopo
            int dentroIf = 10;
            System.out.println("Entrou " + x);
            System.out.println("Entrou " + dentroIf);

            if (x <9) { //Quarto escopo
                int segundoIf;
                System.out.println("Segundo if");
            } else { //Quinto escopo
                int y = 10;
            }
        }
        System.out.println("Não deu");
    }
}