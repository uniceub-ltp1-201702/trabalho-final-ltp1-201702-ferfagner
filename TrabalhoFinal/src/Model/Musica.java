package Model;

public class Musica {
	private String nomeMusica;
	private String genero;
	private String artista;
	
	
	
	public Musica(String nomeMusica, String genero, String artista) {
		super();
		this.nomeMusica = nomeMusica;
		this.genero = genero;
		this.artista = artista;
	}
	@Override
	public String toString() {
		return "Musica [nomeMusica=" + nomeMusica + ", genero=" + genero + ", artista=" + artista + "]";
	}
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
}

	