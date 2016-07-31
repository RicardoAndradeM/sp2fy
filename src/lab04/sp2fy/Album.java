package lab04.sp2fy;

import java.util.ArrayList;

import org.junit.Assert;

public class Album {
	
	private String artista,
				   titulo;
	private int ano;
	private ArrayList<Musica> musicas;
	
	public Album(String artista, String titulo, int ano) throws Exception{
		this.verificaStringInvalida(artista, "Artista");
		this.setArtista(artista);
		this.verificaStringInvalida(titulo, "Titulo");
		this.setTitulo(titulo);
		this.testaAnoInvalido(ano);
		this.setAno(ano);
		this.musicas = new ArrayList<Musica>();
	}
	
	private void testaAnoInvalido(int ano) throws Exception{
		if(ano <= 1900){
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");
		}
		
	}

	private void verificaStringInvalida(String entrada, String tipo) throws Exception{
		if(entrada.equals("")){
			
			throw new Exception(tipo + " do album nao pode ser nulo ou vazio.");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Album) {
			Album outroAlbum = (Album) obj;
			if(this.getTitulo().equals(outroAlbum.getTitulo()) && this.getArtista().equals(outroAlbum.getArtista())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String saida = String.format("%s, %d (%d)\n", this.getTitulo(), this.getArtista(), this.getAno());
		int indice = 1;
		for (Musica musica : musicas) {
			saida += "   " + indice + ". " + musica.toString();
			indice++;
		}
		return saida;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}// fim da classe Album
