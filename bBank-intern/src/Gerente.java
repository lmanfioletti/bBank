public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            System.out.println("Aproved");
            return true;
        }
        else {
            System.out.println("Dennid");
            return false;
        }
    }

    @Override
    public double getBonificacao(){
        return super.getSalario();
    }
}

