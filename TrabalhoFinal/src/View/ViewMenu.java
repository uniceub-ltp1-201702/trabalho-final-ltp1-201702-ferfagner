package View;

import javax.swing.JOptionPane;

public class ViewMenu {
	private String menu;
	
	
	public String getMenu() {
		this.menu = JOptionPane.showInputDialog(
				"Escolha uma upção" + "\n" + 
		"1 - Cadastrar Artista"+ "\n"+
						"2 - Cadastrar Musica"+ "\n"+
		"3- Buscar Musica por Nome" + "\n" +
		"4- Buscar todas as musicas de um Artista" + "\n" +
		"5- Buscar Musica por Palavra" + "\n" +
						"6- Sair");
	return this.menu;
	}
}
