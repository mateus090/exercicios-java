package br.com.unifacef.dc.ex1;

import javax.swing.JOptionPane;

public class Testa {
    public static void mostra(Produto produto){
        JOptionPane.showMessageDialog(null, produto.toString());
    }
    public static void main(String[] args) {
        Radio ra = new Radio((float)103.3,"110Ghz",5,14452,(float)109.99);
        Tv tv = new Tv(120,5,12558,(float) 1499.90);
        
       /* JOptionPane.showMessageDialog(null, ra.toString());
        JOptionPane.showMessageDialog(null, tv.toString());*/
       
       //POLIFORMISMO
       mostra(ra);
       mostra(tv);
    }
    
}
