package Model;

import java.util.ArrayList;

public class Artista {
	private String nome;
	private int idade;
	
	
	public String stringToFile() {
		return this.nome + "$"+
				this.idade + "$";
		
	}
	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", idade=" + idade ;
	}
	public Artista(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	}
