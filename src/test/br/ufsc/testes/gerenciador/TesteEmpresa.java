package test.br.ufsc.testes.gerenciador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteEmpresa {

	private Empresa umaEmpresa;
	
	@Before
	public void criarEmpresa() throws Exception {
		umaEmpresa = new Empresa();
		
	}
	
	@Test
	public void adicionarFuncionario() throws Exception {
		umaEmpresa.adicionarFuncionario(new Funcionario("Bob Brown"));
		assertFalse(umaEmpresa.obterFuncionarios().isEmpty());
	}
	
	@Test
	public void adicionarProjeto() throws Exception {
		umaEmpresa.adicionarProjeto(new Projeto());
		assertFalse(umaEmpresa.obterProjetos().isEmpty());
	}
	
}
