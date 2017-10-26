package test.br.ufsc.testes.gerenciador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProjeto {
	
	private Projeto umProjeto;
	private Funcionario func;
	
	@Before
	public void configuracao() {
		umProjeto = new Projeto();
		func = new Funcionario("Leozim");
		umProjeto.adicionarOcorrencia(1, "Essa ocorrencia se trata de um teste", TipoOcorrencia.TAREFA, func, TipoPrioridade.MEDIA);
	}
	
	@Test
	public void adicionarOcorrencia() throws Exception {
		assertFalse(umProjeto.obterOcorrencias().isEmpty());
	}
	
	@Test
	public void adicionarMaisDeDezOcorrencias() throws Exception {
		umProjeto.adicionarOcorrencia(2, "Teste 2", TipoOcorrencia.BUG, func, TipoPrioridade.ALTA);
		umProjeto.adicionarOcorrencia(3, "Teste 3", TipoOcorrencia.MELHORIA, func, TipoPrioridade.BAIXA);
		umProjeto.adicionarOcorrencia(4, "Teste 4", TipoOcorrencia.TAREFA, func, TipoPrioridade.MEDIA);
		umProjeto.adicionarOcorrencia(5, "Teste 5", TipoOcorrencia.BUG, func, TipoPrioridade.ALTA);
		umProjeto.adicionarOcorrencia(6, "Teste 6", TipoOcorrencia.MELHORIA, func, TipoPrioridade.BAIXA);
		umProjeto.adicionarOcorrencia(7, "Teste 7", TipoOcorrencia.TAREFA, func, TipoPrioridade.MEDIA);
		umProjeto.adicionarOcorrencia(8, "Teste 8", TipoOcorrencia.BUG, func, TipoPrioridade.ALTA);
		umProjeto.adicionarOcorrencia(9, "Teste 8", TipoOcorrencia.MELHORIA, func, TipoPrioridade.BAIXA);
		umProjeto.adicionarOcorrencia(10, "Teste 10", TipoOcorrencia.TAREFA, func, TipoPrioridade.MEDIA);

		
		assertFalse(umProjeto.adicionarOcorrencia(11, "Teste 11", TipoOcorrencia.TAREFA, func, TipoPrioridade.MEDIA));
		assertEquals(10, func.obterNumeroOcorrencias());
	}
	
	@Test
	public void fecharOcorrencia() throws Exception {
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		ocorrencia.terminarOcorrencia();
		assertFalse(ocorrencia.isTarefaAberta());
	}
	
	@Test
	public void mudarResponsavelAberto() throws Exception {
		Funcionario func2 = new Funcionario("Gava");
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		ocorrencia.setFuncionario(func2);
		assertEquals(func2, ocorrencia.getFuncionario());
	}
	
	@Test
	public void mudarPrioridadeAberto() throws Exception {
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		ocorrencia.setPrioridade(TipoPrioridade.ALTA);
		assertEquals(TipoPrioridade.ALTA, ocorrencia.getPrioridade());

	}
	
	@Test
	public void mudarResponsavelFechado() throws Exception {
		Funcionario func2 = new Funcionario("Gava");
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		ocorrencia.terminarOcorrencia();
		ocorrencia.setFuncionario(func2);
		assertEquals(func, ocorrencia.getFuncionario());
	}
	
	@Test
	public void mudarPrioridade() throws Exception {
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		ocorrencia.terminarOcorrencia();
		ocorrencia.setPrioridade(TipoPrioridade.ALTA);
		assertEquals(TipoPrioridade.MEDIA, ocorrencia.getPrioridade());
	}
	
	@Test
	public void obterResponsavel() throws Exception{
		Ocorrencia ocorrencia = umProjeto.obterOcorrencia(1);
		Funcionario funcTest = ocorrencia.getFuncionario();
		assertEquals(funcTest, func);
	}
	

}
