public class Teste {

    public static void main(String[] args){
        Gerente gerente = new Gerente("Stive Jobs", "08046512378", 13050, 1234);
        Programador programador = new Programador("Paul Macartney", "89745623111", 7500);
        Diretor diretor = new Diretor("Lucas Manfioletti", "845132381", 18000, 12324);
        Cliente cliente = new Cliente();
        SistemaInterno sistemaInterno = new SistemaInterno();

        cliente.setSenha(1234);
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(diretor);
        sistemaInterno.autentica(cliente);
        //sistemaInterno.autentica(Programador);


    }

}
