package Control;

import javax.swing.JOptionPane;

import Model.BD;
import Model.Musica;
import View.ViewCadastraMusica;

public class ControleCadastraMusica {
	private BD bds;
	
	public ControleCadastraMusica(BD bds) {
		this.bds = bds;
	}
	public void cadastraMusica() {
		ViewCadastraMusica vcm = new ViewCadastraMusica();
		vcm.cadastraMusica();
		Musica m = new Musica(vcm.getNomeMusica(), vcm.getGenero(), vcm.getArtista());
		
		if (bds.testarMusicaExistente(m.getNomeMusica(), m.getGenero(), m.getArtista())) {
			JOptionPane.showMessageDialog(null, "Musica ja cadastrada");
		}else {
			bds.gravarMusica(m);
			JOptionPane.showMessageDialog(null, "Musica Cadastrada com Sucesso");
		}
	}
}
