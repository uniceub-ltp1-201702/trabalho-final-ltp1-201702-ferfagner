package Model;

import java.util.ArrayList;

import javax.print.attribute.standard.RequestingUserName;

import Util.DocumentReader;
import Util.DocumentWriter;

public class BD {
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicas;
	private String filename = "Musica.txt";
	private String filenemea = "Artista.txt";
	
	public ArrayList<Musica> getMusicas(){
		return musicas;
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	//Metodo Construtor
	public BD() {
		this.artistas = new ArrayList<Artista>();
		this.musicas = new ArrayList<Musica>();
	
		//criando documanto musica
		DocumentReader dr1 = new DocumentReader();// musicas

		//linhas musica
		ArrayList<String> Linhas1 = dr1.read(filename);
		for (int i = 0; i < Linhas1.size(); i++) {
			String[] LinhaMusica = Linhas1.get(i).split(";");
			Musica m = new Musica(LinhaMusica[0], LinhaMusica[1], LinhaMusica[2]);
			
			this.musicas.add(m);
		}
		DocumentReader dr2 = new DocumentReader();// artistas	
		//criando documento artista
		ArrayList<String> Linhas2 = dr2.read(filenemea);
		for (int i = 0; i < Linhas2.size(); i++) {
			String [] LinhaArtista = Linhas2.get(i).split(";");
			Artista a = new Artista(LinhaArtista[0], Integer.parseInt(LinhaArtista[1]));
			this.artistas.add(a);
		}
	}

	public void gravarMusica (Musica m) {
		this.musicas.add(m);
		String musica = m.getNomeMusica()+ ";" + m.getGenero() + ";" + m.getArtista();
		DocumentWriter dw = new DocumentWriter();
		
		dw.write(this.filename, musica);
		
	}
	public void gravarArtista (Artista a) {
		this.artistas.add(a);
		String artista = a.getNome()+ ";" + a.getIdade() ;
		DocumentWriter dw = new DocumentWriter();
	dw.write(this.filenemea, artista);
	}
	//testar se o artista passado ja existe
	public boolean testeNomeArtista (String nome){
		boolean resultado = false;
		for (int i = 0; i < artistas.size(); i++) {
			if (artistas.get(i).getNome().equalsIgnoreCase(nome)
			){
				
			}
		}
		return resultado;
		
	}
	public boolean testaArtistaExiste(Artista artista) {
		// Variavel booleana para teste
		boolean resultado = false;
		for (int i = 0; i < artistas.size(); i++) {
			if (artistas.get(i).getNome().equalsIgnoreCase(artista.getNome())) {
				return resultado = true;
			}
		}
		return resultado;
	}
	
	// testar se musica ja existe
	public boolean testarMusicaExistente (String musica,String genero, String artista)	{	
		boolean resultado = false;
		for (int i = 0; i < musicas.size(); i++) {
			if(musicas.get(i).getNomeMusica().equals(musica)
					&& musicas.get(i).getGenero().equals(genero)
					&& musicas.get(i).getArtista().equals(artista))
				{
				
				
				resultado = true;
			}
		}
		return resultado;
	}
	

}
