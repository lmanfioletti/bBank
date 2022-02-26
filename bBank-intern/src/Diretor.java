public class Diretor extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticar;

    public Diretor(String nome, String cpf, double salario, int senha){
        super(nome, cpf, salario);
        this.autenticar = new AutenticacaoUtil();
        autenticar.setSenha(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticar.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticar.autentica(senha);
    }
    @Override
    public double getBonificacao() {
        return 250;
    }
}
