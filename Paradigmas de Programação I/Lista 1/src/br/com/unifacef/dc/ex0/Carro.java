
package br.com.unifacef.dc.ex0;

public class Carro {
    private float vel;
    private boolean status;
    //Método construtor
    public Carro(float vel, boolean status){
        this.vel = vel;
        this.status = status;
    }
    public void ligar(){
        this.status = true;
    }
    public void desligar(){
        this.status = false;
    }
    public void acelerar(float x){
        this.vel = this.vel + x;
    }
    public void frear(float x){
        this.vel = this.vel - x;
    }
    public String toString(){
        return " Vel: " + this.vel + " Status: " + this.status;
    }
}
    