public class ListaEncadeada {
	private Celula inicio;
	private Celula fim;
	private Celula atual;
	
	
	public ListaEncadeada() {
	}

	public void adicionar(Contato novoContato) {
		Celula novaCelula = new Celula();
		novaCelula.setDado(novoContato);
		novaCelula.setProximo(null);
		
		if (fim == null && fim == null) {
			inicio = novaCelula;
			fim = novaCelula;
		}else {
			fim.setProximo(novaCelula);
			fim = novaCelula;
			fim.setProximo(null);
		}
	}

	public void remover() {
		if(inicio == null && fim == null) {
			
		}else {

		}
	}
	
	public boolean temProximo(){
		if(inicio == null){
			return false;
		}else if (atual == null){
			atual = inicio;
			return true;
		}else{
			boolean temProx = atual.getProximo() != null ? true : false;
			atual = atual.getProximo();
			return temProx;
		}
	}

	public Celula getInicio() {
		return inicio;
	}


	public void setInicio(Celula inicio) {
		this.inicio = inicio;
	}

	public Celula getFim() {
		return fim;
	}


	public void setFim(Celula fim) {
		this.fim = fim;
	}


	public Celula getAtual() {
		return atual;
	}

	public void setAtual(Celula atual) {
		this.atual = atual;
	}
	

}
