public class No {
    private No proximo;
    private No anterior;
    private String dado;

    public No(){
    }

    public No(No proximo, No anterior, String dado) {
        this.proximo = proximo;
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public String getDado() {
        return dado;
    }
    public void setDado(String dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "No [proximo=" + proximo + ", dado=" + dado + "]";
    }
}
