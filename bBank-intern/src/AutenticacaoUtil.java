public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

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
}
