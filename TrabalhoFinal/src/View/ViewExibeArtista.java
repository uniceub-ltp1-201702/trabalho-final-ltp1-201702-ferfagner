package View;

import javax.swing.JOptionPane;

public class ViewExibeArtista {
	public ViewExibeArtista(String artista){
		if (artista == null) {
			JOptionPane.showMessageDialog(null, "Artista nao Existe");
		}else JOptionPane.showMessageDialog(null, artista);
		
		
	}
}
