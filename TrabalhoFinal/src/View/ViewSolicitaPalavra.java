package View;

import javax.swing.JOptionPane;

public class ViewSolicitaPalavra {
	
	private String nome;

	public ViewSolicitaPalavra() {
		nome = JOptionPane.showInputDialog("Infome a palavra busca a Musica: ");
	}

	public String getNome() {
		return nome;
	}
}
