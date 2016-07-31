package lab04.sp2fy;

/**
 * Classe que representa musicas
 * <br>2016 (C)Copyright - Todos os direitos reservados.
 * @author ricardoam
 * @version 0.1
 * <br>A versao mais recente deste projeto pode ser encontrada em: https://github.com/RicardoAndradeM/sp2fy.git
 */
public class Musica {

	private String titulo;
	private int duracao;
	private String genero;

	/**
	 * Construtor que criar um musica(Completa)
	 * @param titulo nome da musica
	 * @param duracao tempo de duracao da musica em minutos
	 * @param genero genero da musica
	 * @throws Exception Se qualquer atributo for invalido
	 */
	public Musica(String titulo, int duracao, String genero) throws Exception {
		this.testaStringInvalida(titulo, "Titulo");
		this.titulo = titulo;
		this.testaDuracaoInvalida(duracao);
		this.duracao = duracao;
		this.testaStringInvalida(genero, "Geenero");
		this.genero = genero;
	} // Fim do construtor
	
	private void testaDuracaoInvalida(int duracao) throws Exception{
		if(duracao <= 0){
			throw new Exception("Duracao invalida");
		}
	} // Fim do metodo testaDuracaoInvalida

	private void testaStringInvalida(String entrada, String tipo) throws Exception{
		if(entrada.equals("") || entrada == null){
			throw new Exception(tipo + " invalido(a)");
		}
	} // Fim do metodo testaStringInvalida

	/**
	 * mostra todas as informações das musicas
	 */
	@Override
	public String toString() {
		return String.format("%s (%s - %d) minutos", this.titulo, this.genero, this.duracao);
	} // Fim do metodo toString
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Musica) {
			Musica outraMusica = (Musica) obj;
			if(this.getTitulo().equals(outraMusica.getTitulo()) && this.getDuracao() == outraMusica.getDuracao()){
				return true;
			}
		}
		return false;
	}

	/*metodos gets e sets*/
	
	public String getTitulo() {
		return titulo;
	} // Fim do metodo getTitulo

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} // Fim do metodo setTitulo

	public int getDuracao() {
		return duracao;
	} // Fim do metodo getDuracao

	public String getGenero() {
		return genero;
	} // Fim do metodo setGenero

	public void setGenero(String genero) {
		this.genero = genero;
	} // Fim do metodo setGenero
	
} // fim da classe Musica
