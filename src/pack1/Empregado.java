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

    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static int getContadorId() {
		return contadorId;
	}



	public static void setContadorId(int contadorId) {
		Empregado.contadorId = contadorId;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getAlergias() {
		return alergias;
	}



	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}



	public String getCondicoesMedicas() {
		return condicoesMedicas;
	}



	public void setCondicoesMedicas(String condicoesMedicas) {
		this.condicoesMedicas = condicoesMedicas;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmailContato() {
		return emailContato;
	}



	public void setEmailContato(String emailContato) {
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