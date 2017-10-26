package test.br.ufsc.testes.gerenciador;

import java.util.LinkedList;

public class Funcionario {

	private String nome;
	private LinkedList<Integer> ocorrencias;

	public Funcionario(String nome) {
		this.nome = nome;
		ocorrencias = new LinkedList<Integer>();
	}

	public void adicionarOcorrencia(Integer key) {
		ocorrencias.add(key);
	}

	public int obterNumeroOcorrencias() {
		return ocorrencias.size();
	}

}
