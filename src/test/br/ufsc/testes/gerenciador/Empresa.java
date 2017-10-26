package test.br.ufsc.testes.gerenciador;

import java.util.LinkedList;

public class Empresa {
	
	private LinkedList<Funcionario> funcionarios;
	private LinkedList<Projeto> projetos;

	
	public Empresa() {
		funcionarios = new LinkedList<Funcionario>();
		projetos = new LinkedList<Projeto>();
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		
	}

	public LinkedList<Funcionario> obterFuncionarios() {
		return funcionarios;
	}

	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
	}

	public LinkedList<Projeto> obterProjetos() {
		return projetos;
	}

}
