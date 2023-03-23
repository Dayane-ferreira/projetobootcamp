package projetobootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	public Mentoria() {
		
	}	

	public Mentoria(String titulo, String conteudo, LocalDate data) {
		super(titulo, conteudo);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	
}
