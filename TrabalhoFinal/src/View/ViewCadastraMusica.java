package View;

import javax.swing.JOptionPane;

public class ViewCadastraMusica {

	private String nomeMusica;
	private String genero;
	private String artista;
	
	
	public String getNomeMusica() {
		return nomeMusica;
	}


	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public void cadastraMusica() {
		this.setNomeMusica(JOptionPane.showInputDialog("Insira o nome da Musica"));
		this.setGenero(JOptionPane.showInputDialog("Insira o Genero da musica"));
		this.setArtista(JOptionPane.showInputDialog("Insira o nome do artista"));
	}

	
}
