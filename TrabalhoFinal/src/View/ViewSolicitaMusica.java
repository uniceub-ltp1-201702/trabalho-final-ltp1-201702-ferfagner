package View;

import javax.swing.JOptionPane;



public class ViewSolicitaMusica {
	private String nomeMusica;
	
	public ViewSolicitaMusica (){
		nomeMusica = JOptionPane.showInputDialog("Coloque o nome da musica");
		
	}

	public String getNomeMusica() {
		return nomeMusica;
	}
	
}
