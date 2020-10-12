package control;

import data.IRepositorioDeFuncionarios;
import model.Funcionario;
import model.Usuario;

public class CadastroDeFuncionarios {

	private IRepositorioDeFuncionarios repositorioDeFuncionarios;
	
	
	public CadastroDeFuncionarios(IRepositorioDeFuncionarios repositorioDeFuncionarios) {
		this.repositorioDeFuncionarios = repositorioDeFuncionarios;
	}
	
	public void incluirFuncionario(Funcionario funci) {
		try	{
			repositorioDeFuncionarios.incluirFuncionario(funci);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void procurarFuncionario (int matricula) {
		repositorioDeFuncionarios.procurarFuncionario(matricula);
	}
	public void excluirFuncionario (int matricula) {
		repositorioDeFuncionarios.excluirFuncionario(matricula);
	}
	public void listarFuncionarios() {
		repositorioDeFuncionarios.listarFuncionarios();
	}
	public boolean editarFuncionario(int matricula, String nome, String sobrenome, String cpf, int telefone) {
		boolean resposta;
		
		resposta = repositorioDeFuncionarios.editarFuncionario(matricula, nome, sobrenome, cpf, telefone);
		
		return resposta;
	}
	
}
