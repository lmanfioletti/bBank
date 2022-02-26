public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, int agencia, int numero, Cliente cliente){
        super(saldo, agencia, numero, cliente);
    }

    @Override
    public boolean saca(double valor) {
        valor += 0.2;
        return super.saca(valor);
    }
}
