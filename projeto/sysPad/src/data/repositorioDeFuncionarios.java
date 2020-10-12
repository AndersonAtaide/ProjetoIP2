package data;

import model.Funcionario;
import model.Usuario;

public class repositorioDeFuncionarios implements IRepositorioDeFuncionarios{

	private Funcionario[] funcionarios;
	private int posicao = 0;
	
	public repositorioDeFuncionarios(int tamanho) {
		this.funcionarios = new Funcionario[tamanho];
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}


	public void incluirFuncionario(Funcionario funci) {
		while (funcionarios[this.posicao] != null) {
			posicao += 1;
		}
		this.funcionarios[posicao] = (Funcionario)funci;
	}
	public void procurarFuncionario (int matricula) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getMatricula() == matricula) {
				System.out.println(funcionario);
				break;
			} 	
		}
	}
	public void excluirFuncionario (int matricula) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i].getMatricula() == matricula) {
				funcionarios[i] = null;
				break;
		}
		}
	}
	public void listarFuncionarios() {
		for (Funcionario funci : funcionarios) {
			if (funci != null) System.out.print(funci);
		}
	}
	public boolean editarFuncionario(int matricula, String nome, String sobrenome, String cpf, int telefone) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getMatricula() == matricula) 
			{	
				funcionario.setNome(nome);
				funcionario.setSobrenome(sobrenome);
				funcionario.setCpf(cpf);
				funcionario.setTelefone(telefone);
				return true;
			}
		}
		return false;
	}
}
