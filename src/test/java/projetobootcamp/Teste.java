package projetobootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class Teste {
	
	@Test
	void inscreverBootcamp() {
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(new Curso("Java Básico", "Descrição Java Básico" , 20));
		bootcamp.getConteudos().add(new Curso("Java POO", "Descrição Java POO" , 50));
		bootcamp.getConteudos().add(new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now()));
		Dev devDayane = new Dev("Dayane");
		devDayane.inscreverBootcamp(bootcamp);
		
		assertEquals(1, bootcamp.getDevsInscritos().size());
		
	}
	
	@Test
	void progredirBootcamp() {
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(new Curso("Java Básico", "Descrição Java Básico" , 20));
		bootcamp.getConteudos().add(new Curso("Java POO", "Descrição Java POO" , 50));
		bootcamp.getConteudos().add(new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now()));
		Dev devDayane = new Dev("Dayane");
		devDayane.inscreverBootcamp(bootcamp);
		devDayane.progredirBootcamp();
		assertEquals(1, devDayane.getConteudosConcluidos().size());
	}
	
	@Test
	void calcularTotalXp() {
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(new Curso("Java Básico", "Descrição Java Básico" , 20));
		bootcamp.getConteudos().add(new Curso("Java POO", "Descrição Java POO" , 50));
		bootcamp.getConteudos().add(new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now()));
		Dev devDayane = new Dev("Dayane");
		devDayane.inscreverBootcamp(bootcamp);
		devDayane.progredirBootcamp();
		assertEquals(200, devDayane.calcularTotalXp());
	}

}
