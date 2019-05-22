package br.com.unifacef.dc.ex2;

public class Passageiro {
    private String nome;
    private String cpf;

    public Passageiro() {
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }

    
}

