package br.com.unifacef.dc.ex2;

import java.util.ArrayList;


public class Rodoviaria {
    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibus;
   
    
    public Rodoviaria() {
        this.onibus = new ArrayList();
    }
    
    public Rodoviaria(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = new ArrayList();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade +
                ", onibus=" + onibus +'}';
    }

    public void adicionaOnibus(Onibus onibus){
        this.onibus.add(onibus);
    }
    public void adicionaPassageiroOnibus(Onibus on, Passageiro pas){
        int pos = this.obterOnibus(on.getNumero());
        if(pos != -1){
            on.adicionaPassageiro(pas);
        }
    }
    public boolean removeOnibus(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    public boolean removeOnibusPassageiro(Onibus onibus, Passageiro passageiro){
        int pos = this.obterOnibus(onibus.getNumero());
        if(pos != -1){
            return onibus.removePassageiro(passageiro);
        }
        else return false;
    }
    public int obterOnibus(int numero){
        for(int i=0;i<this.onibus.size();i++){
            if(this.onibus.get(i).getNumero() == numero){
                return i; // achou
            }
        }   
        return -1; //não achou
    }
    public boolean atualizaOnibus(Onibus onibus){
        int pos = this.obterOnibus(onibus.getNumero());
        if(pos != -1){ //achou
            this.onibus.set(pos, onibus);
            return true;
        }
        else return false;
    }
   public boolean atualizaPassageiroOnibus(Onibus onibus, Passageiro passageiro){
        int pos = this.obterOnibus(onibus.getNumero());
        if(pos != -1){
            return onibus.atualizaPassageiro(passageiro);
        }
        else return false;
    }
}

