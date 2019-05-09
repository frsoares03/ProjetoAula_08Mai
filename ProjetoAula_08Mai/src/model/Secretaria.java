package model;

public class Secretaria extends Funcionario{

	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void Admissao() {
		System.out.println("Voc� foi admitido como secret�ria no dia 08 de maio.");
	}

	@Override
	public void Demissao() {
		System.out.println("Voc� foi demitido como secret�ria no dia 08 de maio.");
	}
	
}
