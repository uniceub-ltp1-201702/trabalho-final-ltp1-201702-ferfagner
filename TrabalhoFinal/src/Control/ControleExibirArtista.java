package Control;

import java.util.ArrayList;

import Model.Artista;
import Model.BD;
import View.ViewExibeArtista;

public class ControleExibirArtista {
	private BD bds;
		
	public ControleExibirArtista(BD bds){
		this.bds = bds;
		
	}
	public void exibeArtistas(){
		ArrayList<Artista> artistas = bds.getArtistas();
		String art = "Artista \n";
		
		for (int i = 0; i < artistas.size(); i++) {
			art += "------\n" + artistas.get(i).getNome() + "\n";
		}
		ViewExibeArtista vea = new ViewExibeArtista(art);
	}

}
