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
		System.out.println("Você foi adimitido na direção no dia 08 de maio.");
	}

	@Override
	public void Demissao() {
		System.out.println("Você foi demitido na direção no dia 08 de maio.");
	}

}
