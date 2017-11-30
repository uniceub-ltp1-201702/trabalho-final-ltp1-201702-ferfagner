package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Musica;
import View.ViewExibeMusicasArtista;
import View.ViewExibirMusica;
import View.ViewSolicitaArtista;
import View.ViewSolicitaMusica;

public class ControleBuscarMusicaArtista {
	private BD bds;
	public ControleBuscarMusicaArtista(BD bds){
		this.bds = bds;
		
	}
	public void exeibirNomeArtista(){
		ArrayList<Musica> musicas = this.bds.getMusicas();
		
		ViewSolicitaArtista vsa = new ViewSolicitaArtista();
		
		
		String nomeArtista = vsa.getNome();
		
		String na = "";
		
		for (int i = 0; i < musicas.size(); i++) {
			if(musicas.get(i).getArtista().equals(nomeArtista)){
			na  += "-------------------\n" + 
						"Musica: " + musicas.get(i).getNomeMusica() + "\n" + 
						"Genero: " +musicas.get(i).getGenero() + "\n" +
						"Artista: " +musicas.get(i).getArtista() + "\n";
			}
		}
		ViewExibeMusicasArtista vea = new ViewExibeMusicasArtista(na);
	}
}
