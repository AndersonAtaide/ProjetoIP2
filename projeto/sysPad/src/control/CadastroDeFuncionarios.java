package control;

import data.IRepositorioDeFuncionarios;
import model.Funcionario;
import model.Usuario;
import data.repositorioDeFuncionarios;

public class CadastroDeFuncionarios implements ICadastroDeFuncionarios{

	private IRepositorioDeFuncionarios repositorioDeFuncionarios;
	
	public CadastroDeFuncionarios(IRepositorioDeFuncionarios repositorioDeFuncionarios) {
		this.repositorioDeFuncionarios = repositorioDeFuncionarios;
	}
	
	public void incluirFuncionario(Funcionario funci) {
		try {
			if (funci != null && funci.getMatricula() > 0) {
				repositorioDeFuncionarios.incluirFuncionario(funci);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public void procurarFuncionario (int matricula) {
		if(matricula > 0)
			repositorioDeFuncionarios.procurarFuncionario(matricula);
	}
	public void excluirFuncionario (int matricula) {
		if (matricula > 0)
			repositorioDeFuncionarios.excluirFuncionario(matricula);
	}
	public void listarFuncionarios() {
		repositorioDeFuncionarios.listarFuncionarios();
	}
	public boolean editarFuncionario(int matricula, String nome, String sobrenome, String cpf, int telefone) {
		
		if (matricula > 0 && !nome.contains(" ") && !sobrenome.contains(" ") && cpf.length() == 11) {
			
			boolean resposta;
			
			char primeiraLetraDoNome = nome.toUpperCase().charAt(0);
			nome = primeiraLetraDoNome + nome.substring(1);
			
			char primeiraLetraDoSobrenome = sobrenome.toUpperCase().charAt(0);
			sobrenome = primeiraLetraDoSobrenome + sobrenome.substring(1);
			
			resposta = repositorioDeFuncionarios.editarFuncionario(matricula, nome, sobrenome, cpf, telefone);
			
			return resposta;
		} else {
			return false;
		}
	}
}
