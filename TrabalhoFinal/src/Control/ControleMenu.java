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
	private ControleBuscaMusicaNome cbmn;
	private ControleBuscarMusicaPorPalavra cbmpp;
	private ControleBuscarMusicaArtista cbma;
	
		public ControleMenu(BD bds) {
			this.bds = bds;
			
			this.vm = new ViewMenu();
			this.cca = new ControleCadastrarArtista(bds);
			this.ccm = new ControleCadastraMusica(bds);
			this.cbmpp = new ControleBuscarMusicaPorPalavra(bds);
			this.cbma = new ControleBuscarMusicaArtista(bds);
			this.cbmn = new ControleBuscaMusicaNome(bds);
			
			tratarMenu(this.vm.getMenu());		
	}

		private void tratarMenu(String menu) {
			while (true) {
				switch (menu) {
				case "1": this.cca.cadastraArtista();
				break;
				case "2": this.ccm.cadastraMusica();
				break;
				case "3": this.cbmn.musicaNome();
				break;
				case "4": this.cbma.exeibirNomeArtista();
				break;
				case "5": this.cbmpp.buscaMusicaporPalavra();
				break;
				case "6": JOptionPane.showMessageDialog(null, "Sair"); 
				return;
					
				default: JOptionPane.showMessageDialog(null, "Opção Invalida");
					break;
				}
				menu = this.vm.getMenu();
			}
			
		}
	
	
	
}
