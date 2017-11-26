package View;

import javax.swing.JOptionPane;

public class ViewSolicitaArtista {
	private String nome;
	
	public ViewSolicitaArtista(){
		nome = JOptionPane.showInputDialog("inserir nome");
	}

	public String getNome() {
		return nome;
	}
	
}
