
public class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;
    private static int totalContas = 0;

    //Constructor
    public Conta(double saldo, int agencia, int numero, Cliente cliente){
        this.saldo = saldo;
        setAgencia(agencia);
        setNumero(numero);
        setCliente(cliente);
        Conta.totalContas++;
    }

    //Getters
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    //Setters
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean deposita(double valor){
        if (valor>0){
            this.saldo += valor;
            return true;
        }
        else {
            System.out.println("O valor não pode ser < 0");
            return false;
        }
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }

    public boolean transfere(double valor, Conta contaDetino){
        if(saca(valor)){
            contaDetino.deposita(valor);
            return true;
        }
        else
            return false;
    }

}