package model;

public class Funcionario extends Usuario{
	
	private int matricula;
	private boolean admin;
	private Login login;
	
	
	
	public Funcionario(String nome, String sobrenome, String cpf, int telefone, int matricula, boolean admin, String login , String senha) {
		super(nome, sobrenome, cpf, telefone);
		this.matricula = matricula;
		this.admin = admin;
		this.login = new Login(login, senha);
	}
	public Funcionario(String nome, String sobrenome, String cpf, int matricula, boolean admin, String login , String senha) {
		super(nome, sobrenome, cpf);
		this.matricula = matricula;
		this.admin = admin;
		this.login = new Login(login, senha);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	@Override
	public String toString() {
		return "Funcionario\n" + 
	           super.toString() + 
	           ", matricula=" + matricula + 
	           ", admin=" + admin +
	           ", " + login.toString();
	}
	
	
	
	
}
