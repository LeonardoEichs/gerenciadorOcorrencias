package test.br.ufsc.testes.gerenciador;

public class Ocorrencia {

	private Integer chave;
	private String descricao;
	private TipoOcorrencia tipo;
	private Funcionario funcionario;
	private TipoPrioridade prioridade;
	private boolean tarefaAberta = true;
	
	public Ocorrencia(Integer key, String desc, TipoOcorrencia tarefa, Funcionario func, TipoPrioridade prior) {
		chave = key;
		descricao = desc;
		tipo = tarefa;
		setFuncionario(func);
		setPrioridade(prior);
	}
	
	public void terminarOcorrencia() {
		setTarefaAberta(false);
	}

	public Integer getChave() {
		return chave;
	}

	public String getDescricao() {
		return descricao;
	}

	public TipoOcorrencia getTipo() {
		return tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		if (tarefaAberta == true)
			this.funcionario = funcionario;
	}

	public TipoPrioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(TipoPrioridade prioridade) {
		if (tarefaAberta == true)
			this.prioridade = prioridade;
	}

	public boolean isTarefaAberta() {
		return tarefaAberta;
	}

	public void setTarefaAberta(boolean tarefaAberta) {
		this.tarefaAberta = tarefaAberta;
	}	

}
