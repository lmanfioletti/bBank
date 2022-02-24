public class Cliente {
    String nome;
    String cpf;
    String profissao;

    //Constructor
    public Cliente(String nome, String cpf, String profissao){
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
