package model;

public abstract class Usuario {

	private String nome;
	private String sobrenome;
	private String cpf;
	private int telefone;
	
	public Usuario(String nome, String sobrenome, String cpf, int telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public Usuario(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", telefone=" + telefone;
	}
	
}
