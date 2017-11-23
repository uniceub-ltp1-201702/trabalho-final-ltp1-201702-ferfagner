package Control;

import Model.Artista;
import Model.BD;
import View.ViewCadastraArtista;
import View.ViewCadastraMusica;

public class ControleCadastrarArtista {
	private BD bds;
	
	public ControleCadastrarArtista(BD bds) {
	 this.bds = bds;	
	}
	
	public void cadastraArtista() {
		ViewCadastraArtista vca =  new ViewCadastraArtista();
		vca.cadastraArtista();
		Artista a = new Artista(vca.getNome(), Integer.parseInt(vca.getIdade()));
	this.bds.gravarArtista(a);
	
	
	}
	
	
	}

