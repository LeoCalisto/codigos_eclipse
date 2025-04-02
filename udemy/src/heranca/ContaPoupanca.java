package heranca;

public class ContaPoupanca extends Conta{
    Double saldoGuardado;
    
    public void guardarSaldo(Double valor){
        if (valor <= getSaldo() && valor > 0) {
            sacar(valor);
            saldoGuardado = valor;
        }
    }
}
