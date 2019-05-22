
package br.com.unifacef.dc.ex0;

public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao; 
        this.qtde = qtde;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    public void vender(int x){
        this.qtde = this.qtde - x;
    }
    public void subir(float x){
        this.preco = this.preco + x;
    }
    public void descer(float x){
        this.preco = this.preco - x;
    }
    public String mostra(){
        return " ID do produto: " + this.id + "\n" + " Descrição do produto: " + this.descricao + "\n" + " Qtde: " + this.qtde + "\n" + " Preço: " + this.preco;
    }
}
