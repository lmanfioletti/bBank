public class CriaConta {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Lucas", "04545541234", "estagiário");
        Cliente cliente2 = new Cliente("Maria", "07065699823", "estagiária");
        Conta primeiraConta = new Conta(200.0, 12345, 78910, cliente);
        Conta segundaConta = new Conta(200.0, 12345, 78910, cliente2);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());
        primeiraConta.transfere(100, segundaConta);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

    }

}
