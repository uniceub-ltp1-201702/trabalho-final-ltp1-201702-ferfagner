package Control;

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
		
		this.bds.gravarMusica(m);
	}
}
