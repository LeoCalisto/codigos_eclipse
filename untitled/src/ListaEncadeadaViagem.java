public class ListaEncadeadaViagem {

    private No primeiro;
    private No ultimo;
    private No atual;
    private int contaNos = 0;

    public ListaEncadeadaViagem(){
    }

    public void adicionar(String nomeDaViagem){
        No novoNo = new No();
        novoNo.setDado(nomeDaViagem);
        if (contaNos == 0) {
            novoNo.setProximo(null);
            primeiro = novoNo;
            ultimo = novoNo;
            contaNos++;
        }else {
            ultimo.setProximo(novoNo);
            novoNo.setProximo(null);
            ultimo = novoNo;
            contaNos++;
        }
    }

    public void listar(){
        if (contaNos == 0) {
            System.out.println("Sem itens na lista !");
        }else{
            atual = primeiro;
            do{
                System.out.println(atual.getDado());
                atual = atual.getProximo();
            }while (atual != null);
        }
    }

    public void remover(){
        if (contaNos == 0) {
            System.out.println("Sem itens na lista !");
        }else{
            No aux = acharpenultimo();
            aux.setProximo(null);
            ultimo = aux;
            contaNos--;
        }
    }

    public No acharpenultimo(){
        No penultimo = new No();
        for (int i = 1; i <= contaNos - 1; i++) {
            if (i == 1){
                penultimo = primeiro;
            }else{
                penultimo = penultimo.getProximo();
            }
        }
         return penultimo;
    }

}
