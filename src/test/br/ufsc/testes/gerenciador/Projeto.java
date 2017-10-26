package test.br.ufsc.testes.gerenciador;

import java.util.HashMap;

public class Projeto {
	
	private HashMap<Integer, Ocorrencia> ocorrencias;
	
	public Projeto() {
		ocorrencias = new HashMap<Integer, Ocorrencia>();
	}

	public boolean adicionarOcorrencia(Integer key, String desc, TipoOcorrencia tarefa, Funcionario func, TipoPrioridade prior) {
		
		boolean temMenosQueDez = func.obterNumeroOcorrencias() < 10;
		
		if (temMenosQueDez) {
			Ocorrencia ocorrencia = new Ocorrencia(key, desc, tarefa, func, prior);
			ocorrencias.put(key, ocorrencia);
			func.adicionarOcorrencia(key);
		}
		return temMenosQueDez;
	}

	public HashMap<Integer, Ocorrencia> obterOcorrencias() {
		return ocorrencias;
	}

	public Ocorrencia obterOcorrencia(int key) {
		return ocorrencias.get(key);
	}

	
}
