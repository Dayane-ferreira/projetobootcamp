package projetobootcamp;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;
	private String titulo;
	private String conteudo;

	public Conteudo() {

	}	
	
	public Conteudo(String titulo, String conteudo) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}	
	
}
