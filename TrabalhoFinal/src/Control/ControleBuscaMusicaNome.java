package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Musica;
import View.ViewExibirMusica;
import View.ViewSolicitaMusica;

public class ControleBuscaMusicaNome {
	private BD bds;
	
	public ControleBuscaMusicaNome(BD bds){
		this.bds = bds;
		
	}
	public void musicaNome(){
		
			ArrayList<Musica> musicas = this.bds.getMusicas();
			
			ViewSolicitaMusica vsm = new ViewSolicitaMusica();
			
			
			String nomeMusica = vsm.getNomeMusica();
			
			String nm = "---" + nomeMusica + "---\n";
			for (int i = 0; i < musicas.size(); i++) {
				if(musicas.get(i).getNomeMusica().equals(nomeMusica)){
					nm  += "-------------------\n" + 
							musicas.get(i).getNomeMusica() + "\n" + 
							musicas.get(i).getGenero() + "\n" +
							musicas.get(i).getArtista() + "\n";
				}
			}
			ViewExibirMusica vem = new ViewExibirMusica(nm);
		}
}

	
		
	
