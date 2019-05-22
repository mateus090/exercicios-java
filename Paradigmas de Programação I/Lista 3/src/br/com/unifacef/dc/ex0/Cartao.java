package br.com.unifacef.dc.ex0;

import java.util.Date;

public class Cartao {
    private int senha, cvv, numero;
    private String bandeira;
    private Date validade;
    private Conta conta; 
    public Cartao(){
    }

    public Cartao(int senha, int cvv, int numero, String bandeira, Date validade, Conta conta) {
        this.senha = senha;
        this.cvv = cvv;
        this.numero = numero;
        this.bandeira = bandeira;
        this.validade = validade;
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cartao{" + "senha=" + senha + ", cvv=" + cvv +
        ", numero=" + numero + ", bandeira=" + bandeira + ", validade="
        + validade + ", conta=" + conta + '}';
    }
     public boolean saque(float valor, int senha){
        if(this.senha == senha){
            if((this.conta.getSaldo() - valor) >= 0){
                this.conta.setSaldo(this.conta.getSaldo() - valor);
                return true;
            }
        }
        else return false;
        return false;
    }
}


