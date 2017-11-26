package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Musica;
import View.ViewExibirMusica;
import View.ViewSolicitaMusica;

public class ControleBuscarMusica {
	private BD bds;
	
	public void buscarPorLetra(){
		ArrayList<Musica> musicas= bds.getMusicas();
		
		ViewSolicitaMusica vsm = new ViewSolicitaMusica();
		
		String nome = vsm.getNomeMusica();
		char letra = nome.charAt(0);
		
		String m = "-----Musicas com " + letra + "----\n";
		for (int i = 0; i < musicas.size(); i++) {
			
			char[] ch = musicas.get(i).getNomeMusica().toCharArray();
			
			//comparar a letra
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == letra) {
					m = "-----------\n" + musicas.get(i).getNomeMusica() + "\n" + musicas.get(i).getGenero() + "\n" + musicas.get(i).getArtista() + "\n";
				}
			}
		}
		ViewExibirMusica vem = new ViewExibirMusica(m);
	}
}
