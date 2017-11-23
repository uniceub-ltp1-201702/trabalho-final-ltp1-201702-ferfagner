package View;

import javax.swing.JOptionPane;

public class ViewCadastraArtista {
	private String nome;
	private String idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	
	public void cadastraArtista() {
		this.setNome(JOptionPane.showInputDialog("Coloque o Nome do Artista"));
		this.setIdade(JOptionPane.showInputDialog("Coloque a idade do Artista"));
	}
}
