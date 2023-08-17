package org.example.aulas.classes;

public class Radiologista extends Colaborador {
    public String curso;

    @Override
    public boolean isRetired() {
        return idade > 40;
    }
}
