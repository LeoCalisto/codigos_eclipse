public class TestaListaEncadeada {

	public static void main(String[] args) {
		TestaListaEncadeada teste = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		teste.addContato(listaEncadeada);
		
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getAtual().getDado().getNome());
		}
	}
	
	void addContato(ListaEncadeada listaEncadeada) {
		Contato contato1 = new Contato(1, "leo", "leo@gmail.com");
		listaEncadeada.adicionar(contato1);
		Contato contato2 = new Contato(2, "marcos", "marcos@gmail.com");
		listaEncadeada.adicionar(contato2);
		Contato contato3 = new Contato(3, "pedro", "pedro@gmail.com");
		listaEncadeada.adicionar(contato3);
	}

	
}
