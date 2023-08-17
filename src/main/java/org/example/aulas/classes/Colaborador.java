package org.example.aulas.classes;

public class Colaborador {
    public String nome;
    public int idade;
    public String cpf;
    public String email;

    public boolean isRetired() {
        return idade > 60;
    }
}
