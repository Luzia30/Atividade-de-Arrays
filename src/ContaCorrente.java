
public class ContaCorrente extends Conta {
    @Override
    public void saca(double valor) {
        double valorComTaxa = valor + 0.10;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente - " + super.toString();
    }
}