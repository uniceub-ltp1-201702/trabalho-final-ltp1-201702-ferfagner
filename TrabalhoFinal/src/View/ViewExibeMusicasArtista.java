package View;

import javax.swing.JOptionPane;

public class ViewExibeMusicasArtista {
	
	public ViewExibeMusicasArtista(String musicas){
		
		if (musicas == "") {
			JOptionPane.showMessageDialog(null, "Artista n�o Encontrado");
		} else {
			JOptionPane.showMessageDialog(null, musicas);
			
		}
	}
}
