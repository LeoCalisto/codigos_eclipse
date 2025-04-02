package heranca;

public class Conta {
    private Double saldo;
    private String numeroConta;

    
    public Conta(){
    }

    public Conta(Double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        }
    }

    public void sacar(Double valorSaque){
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo-=valorSaque;
        }
    }
}

