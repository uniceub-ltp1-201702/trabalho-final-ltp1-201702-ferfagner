package View;

import javax.swing.JOptionPane;

public class ViewMenu {
	private String menu;
	
	
	public String getMenu() {
		this.menu = JOptionPane.showInputDialog(
				"Escolha uma upção" + "\n" + 
		"1 - Cadastrar Artista"+ "\n"+
						"2 - Cadastrar Musica"+ "\n"+
		"3- Cadastrar Musica a Artista" + "\n" +
						"4- Sair");
	return this.menu;
	}
}
