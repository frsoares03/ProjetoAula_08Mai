package model;

public class Professor extends Funcionario{
	
	private String disc;

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	@Override
	public void Admissao() {
		System.out.println("Voc� foi adimitido como professor no dia 08 de maio.");
	}

	@Override
	public void Demissao() {
		System.out.println("Voc� foi demitido como professor no dia 08 de maio.");
	}
	
}
