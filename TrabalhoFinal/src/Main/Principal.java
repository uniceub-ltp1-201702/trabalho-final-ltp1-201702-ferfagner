package Main;


import Control.ControleCadastraMusica;
import Control.ControleCadastrarArtista;
import Control.ControleMenu;
import Model.BD;


public class Principal {
	
	
	public static void main(String[] args) {
		
		BD bds = new BD();
				
		ControleMenu cm = new ControleMenu(bds);
	}

}

