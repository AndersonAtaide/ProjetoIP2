import control.CadastroDeFuncionarios;
import data.IRepositorioDeFuncionarios;
import model.Administrador;
import model.Funcionario;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		Funcionario novoGerente = new Funcionario("Anderson", "Ataide", "04723649441", 996662744, 733465, true, "persel", 
				"persel00");
		Funcionario novoFuncionario = new Funcionario("fabio", "nascimento", "05515905482", 3154796, false, "fabion", "fbnascimento");
		Funcionario novoFuncionario1 = new Funcionario("carlos", "cavalcanti", "05515905482", 3597415, false, "fabion", "fbnascimento");
		
		
		
		IRepositorioDeFuncionarios repositorioDeFuncionarios = new data.repositorioDeFuncionarios(100);
		CadastroDeFuncionarios cadastrarFuncionario = new CadastroDeFuncionarios(repositorioDeFuncionarios);
		
		cadastrarFuncionario.incluirFuncionario(novoFuncionario);
		repositorioDeFuncionarios.incluirFuncionario(novoGerente);
		repositorioDeFuncionarios.incluirFuncionario(novoFuncionario1);

		System.out.println();

		repositorioDeFuncionarios.listarFuncionarios();
		
		System.out.println();
		System.out.println();

		repositorioDeFuncionarios.procurarFuncionario(3597415);
		
		System.out.println();
		
		repositorioDeFuncionarios.excluirFuncionario(733465);
		

		repositorioDeFuncionarios.listarFuncionarios();
		
		System.out.println();
		System.out.println();
		
		repositorioDeFuncionarios.editarFuncionario(3154796, novoFuncionario.getNome(), "da silva", novoFuncionario.getCpf(), novoFuncionario.getTelefone());
		
		repositorioDeFuncionarios.listarFuncionarios();
		
		

		
		

		
	}

}
