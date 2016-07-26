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
		if(titulo.equals("") || titulo.equals(null) || genero.equals("") || genero.equals(null) || duracao <= 0){
			throw new Exception();
		}
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	} // Fim do construtor
	
	/**
	 * mostra todas as informações das musicas
	 */
	@Override
	public String toString() {
		return String.format("%s (%s - %d) minutos", this.titulo, this.genero, this.duracao);
	} // Fim do metodo toString

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

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	} // Fim do metodo setDuracao

	public String getGenero() {
		return genero;
	} // Fim do metodo setGenero

	public void setGenero(String genero) {
		this.genero = genero;
	} // Fim do metodo setGenero
	
} // fim da classe Musica
