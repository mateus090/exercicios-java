package br.com.unifacef.dc.ex2;

import java.util.ArrayList;

public class Onibus {
    private int numero;
    private String marca;
    private ArrayList<Passageiro> passageiro;

    public Onibus() {
        this.passageiro = new ArrayList();
    }

    public Onibus(int numero, String marca) {
        this.numero = numero;
        this.marca = marca; 
        this.passageiro = new ArrayList();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\n Onibus{" + "numero=" + numero + ", marca=" + marca + ", passageiro=" + passageiro + '}';
    }

   

    public void adicionaPassageiro(Passageiro passageiro){
        this.passageiro.add(passageiro);
    }
    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiro.remove(passageiro);
    }
    public int buscaPassageiro(String cpf){
        for(int i=0;i<this.passageiro.size();i++){
            if(this.passageiro.get(i).getCpf().equals(cpf)){
                return i; // achou
            }
        }   
        return -1; //não achou
    }
//    public int buscaPassageiroPosicao(String cpf){
//        int pos = this.buscaPassageiro(passageiro.getCpf());
//        if (pos != -1){
//            return pos;
//        }
//        else return -1;
//    }
    public boolean atualizaPassageiro(Passageiro passageiro){
        int pos = this.buscaPassageiro(passageiro.getCpf());
        if(pos != -1){ //achou
            this.passageiro.set(pos, passageiro);
            return true;
        }
        else return false;
    }
}
