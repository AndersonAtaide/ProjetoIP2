package control;

import model.Funcionario;

public interface ICadastroDeFuncionarios {
	
	void incluirFuncionario(Funcionario funci);
	void procurarFuncionario (int matricula);
	void excluirFuncionario (int matricula);
	void listarFuncionarios();
	boolean editarFuncionario(int matricula, String nome, String sobrenome, String cpf, int telefone);
}