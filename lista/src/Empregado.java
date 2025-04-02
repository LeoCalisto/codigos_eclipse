public class Empregado {
    private String nome;
    private int horas;
    private double valorPorHora;

    public Empregado(){
    }
    
    public Empregado(String nome, int horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return horas*valorPorHora;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", horas=" + horas + ", valorPorHora=" + valorPorHora + "]";
    }

}
