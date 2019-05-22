
package br.com.unifacef.dc.ex1;

import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private String cpf;
    private ArrayList<Mala> malas;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        // alocar espaço na memória
        this.malas = new ArrayList();
    }
    public Passageiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + ",+ malas=" + malas + '}';
    }

    
    
    // associa uma mala ao passageiro
    public void adicionaMala(Mala mala){
        this.malas.add(mala);
    }
    // remove uma mala do passageiro
    public boolean removeMala(Mala mala){
        return this.malas.remove(mala);
    }
    // busca posição da mala
    public int buscaMala(int codigo){
        for(int i=0;i<this.malas.size();i++){
            if(this.malas.get(i).getCodigo() == codigo){
                return i; // achou
            }
        }   
        return -1; //não achou
    }
    public boolean atualizaMala(Mala nova){
        int pos = this.buscaMala(nova.getCodigo());
        if(pos != -1){ //achou
            this.malas.set(pos, nova);
            return true;
        }
        else return false;
    }
}
