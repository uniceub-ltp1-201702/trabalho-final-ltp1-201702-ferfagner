package Control;

import javax.swing.JOptionPane;

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
	if (bds.testaArtistaExiste(a)) {
		JOptionPane.showMessageDialog(null, "Artista ja cadastrado");
	}else {
		bds.gravarArtista(a);
		JOptionPane.showMessageDialog(null, "o Artista Foi cadastrado");
	}
	
	}
	
	
	
	}
	
	

