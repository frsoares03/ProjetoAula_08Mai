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
		System.out.println("Você foi admitido como secretária no dia 08 de maio.");
	}

	@Override
	public void Demissao() {
		System.out.println("Você foi demitido como secretária no dia 08 de maio.");
	}
	
}
