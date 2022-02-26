public class Cliente implements Autenticavel {

    private int senha;

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
}
