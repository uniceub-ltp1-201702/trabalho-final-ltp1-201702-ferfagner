package Model;

import java.util.ArrayList;

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

	//Metodo Construtor
	public BD() {
		this.artistas = new ArrayList<Artista>();
		this.musicas= new ArrayList<Musica>();
		//criando documanto musica
		DocumentReader dr1 = new DocumentReader();
		DocumentReader dr2 = new DocumentReader();
		//linhas musica
		ArrayList<String> Linhas1 = dr1.read(filename);
		
		
		for (int i = 0; i < Linhas1.size(); i++) {
			
			String [] LinhaMusica = Linhas1.get(i).split("#");
			Musica m = new Musica(LinhaMusica [0], LinhaMusica[1], LinhaMusica[2]);
			
			this.musicas.add(m);
		}
		//criando documento artista
		
		ArrayList<String> Linhas2 = dr2.read(filenemea);
		for (int i = 0; i < Linhas2.size(); i++) {
			String [] LinhaArtista = Linhas2.get(i).split("$");
			Artista a = new Artista(LinhaArtista[0], Integer.parseInt(LinhaArtista[1]));
		}
	}

	public void gravarMusica (Musica m) {
		this.musicas.add(m);
		String musica = "\n" + m.getNomeMusica()+ "#" + m.getGenero();
		DocumentWriter dw = new DocumentWriter();
		
		dw.write(this.filename, musica);
		
	}
	public void gravarArtista (Artista a) {
		this.artistas.add(a);
		String artista = "\n" + a.getNome()+ "$" + a.getIdade() ;
		DocumentWriter dw = new DocumentWriter();
	dw.write(filenemea, artista);
	}


}
