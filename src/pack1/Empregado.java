package pack1;

import java.util.Scanner;

class Empregado {
    private int id;
    private static int contadorId = 1;
    private String nome;
    private String alergias;
    private String condicoesMedicas;
    private String telefone;
    private String emailContato;

    public Empregado(String nome, String alergias, String condicoesMedicas, String telefone, String emailContato) {
        this.id = contadorId;
        contadorId++;
        this.nome = nome;
        this.alergias = alergias;
        this.condicoesMedicas = condicoesMedicas;
        this.telefone = telefone;
        this.emailContato = emailContato;
    }

    

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "Alergias: " + alergias + "\n" +
               "Condições Médicas: " + condicoesMedicas + "\n" +
               "Telefone de Contato: " + telefone + "\n" +
               "Email de Contato: " + emailContato;
    }
}