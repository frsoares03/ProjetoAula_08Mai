package model;

public class Direcao extends Funcionario{
	
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void Admissao() {
		System.out.println("Voc� foi adimitido na dire��o no dia 08 de maio.");
	}

	@Override
	public void Demissao() {
		System.out.println("Voc� foi demitido na dire��o no dia 08 de maio.");
	}

}
