
public class Celula {
	private Contato dado;
	private Celula proximo;
	
	public Celula() {
	}

	public Contato getDado() {
		return dado;
	}

	public void setDado(Contato dado) {
		this.dado = dado;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
