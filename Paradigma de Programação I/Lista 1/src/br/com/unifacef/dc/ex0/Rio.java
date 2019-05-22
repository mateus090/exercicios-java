
package br.com.unifacef.dc.ex0;


public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel; 
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    public void ensolarar(float x){
        this.nivel = this.nivel - x;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public String mostra(){
        return " Nome do rio: " + this.nome + "\n" + " Nível do rio: " + this.nivel + "\n" + " Poluído: " + this.poluido;
    }

    void limpar(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
