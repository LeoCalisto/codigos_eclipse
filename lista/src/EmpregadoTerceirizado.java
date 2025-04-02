public class EmpregadoTerceirizado extends Empregado{
    private double despesaAdicional;


    public EmpregadoTerceirizado() {
    }

    public EmpregadoTerceirizado(String nome, int horas, double valorPorHora, double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + (despesaAdicional * 1.1);
    }

}
