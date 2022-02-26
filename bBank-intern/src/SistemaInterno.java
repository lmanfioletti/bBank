public class SistemaInterno{

    private int senha = 1234;

    public void autentica(Autenticavel fa){
        fa.autentica(this.senha);
    }

}
