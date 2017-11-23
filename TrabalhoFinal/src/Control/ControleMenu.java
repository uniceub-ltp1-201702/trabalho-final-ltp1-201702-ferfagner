package Control;

import javax.swing.JOptionPane;

import Model.BD;
import View.ViewCadastraArtista;
import View.ViewCadastraMusica;
import View.ViewMenu;

public class ControleMenu {
	private BD bds;
	private ViewMenu vm;
	private ControleCadastraMusica ccm;
	private ControleCadastrarArtista cca;
	
		public ControleMenu() {
			this.bds = bds;
			
			this.vm = new ViewMenu();
			this.cca = new ControleCadastrarArtista(bds);
			this.ccm = new ControleCadastraMusica(bds);
			
			
			
	tratarMenu(this.vm.getMenu());		
			
		}

		private void tratarMenu(String menu) {
			while (true) {
				switch (menu) {
				case "1": this.cca.cadastraArtista();
				break;
				case "2": this.ccm.cadastraMusica();
				break;
				case "4": JOptionPane.showMessageDialog(null, "Sair"); 
				return;
					
				default: JOptionPane.showMessageDialog(null, "Opção Invalida");
					break;
				}
				menu = this.vm.getMenu();
			}
			
		}
	
	
	
}
