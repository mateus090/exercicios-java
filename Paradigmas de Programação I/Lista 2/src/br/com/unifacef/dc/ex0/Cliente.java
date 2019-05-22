
package br.com.unifacef.dc.ex0;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8 && numeroConta.startsWith("-",6) ){
            this.numeroConta = numeroConta;
        }
        else this.numeroConta = ("Número da conta inválido");
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6 && numeroAgencia.startsWith("-",4)){
           this.numeroAgencia = numeroAgencia; 
        }
        else this.numeroAgencia = ("Número da agência inválido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 30){
            this.nome = nome;
        }
        else this.nome = ("Nome inválido");
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);

        //this.numeroConta = numeroConta;
        //this.numeroAgencia = numeroAgencia;
        //this.nome = nome;
        //this.saldo = saldo;     
    }
    public void realizarDeposito(float x){
        this.saldo = saldo + x;
    }
    public void realizarSaque(float x){
        this.saldo = saldo - x;
    }
    public String mostra(){
        return "Nome: " + this.nome + "\n" + "Número da conta: " + this.numeroConta
        + "\n" + "Agência: " + this.numeroAgencia + "\n" + "Saldo atual: " + this.saldo;
    }

    private void startsWith(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
