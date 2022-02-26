public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticar;

    public Cliente(){
        this.autenticar = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticar.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticar.autentica(senha);
    }
}
