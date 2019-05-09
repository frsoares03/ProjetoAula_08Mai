package view;

import model.Direcao;
import model.Professor;
import model.Secretaria;

public class Execucao {

	public static void main(String[] args) {
		
		Direcao dir = new Direcao();
		Secretaria secre = new Secretaria();
		Professor prof = new Professor();
		
		dir.setNome("Felipe");
		dir.setCargo("Coordenador");
		
		secre.setNome("Juliana");
		secre.setLogin("121212");
		
		prof.setNome("João");
		prof.setDisc("Matemática");
		
		dir.Admissao();
		dir.Demissao();
		
		System.out.println(" ");
		
		secre.Admissao();
		secre.Demissao();
		
		System.out.println(" ");
		
		prof.Admissao();
		prof.Demissao();
		
	}

}
