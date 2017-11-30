package Control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.BD;
import Model.Musica;
import View.ViewExibirMusica;
import View.ViewSolicitaMusica;
import View.ViewSolicitaPalavra;

public class ControleBuscarMusicaPorPalavra {
	private BD bds;
	
	public ControleBuscarMusicaPorPalavra(BD bds) {
		this.bds = bds;
	}
	
	public void buscaMusicaporPalavra() {

		
		ArrayList<Musica> musicas = bds.getMusicas();

		
		ViewSolicitaPalavra vsp = new ViewSolicitaPalavra();

		
		String nome = vsp.getNome().toUpperCase();
		
		String a = "";

		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getNomeMusica().toUpperCase().contains(nome)) {
				a += "Nome: " + musicas.get(i).getNomeMusica() + "\n" +
					"Genero: " + musicas.get(i).getGenero() + "\n "+
					"Artista: " + musicas.get(i).getArtista()+ "\n "+
					"\n " + "--------------------" + "\n";
			}
		}
		ViewExibirMusica vem = new ViewExibirMusica(a);
	}
}