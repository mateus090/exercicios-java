
package br.com.unifacef.dc.ex0;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        Produto obj1 = new Produto(1001,"CAMISETA", 17,35);
        obj1.comprar(1);
        obj1.vender(4);
        obj1.subir(5);
        obj1.descer(10);
        
        Produto obj2 = new Produto(2001,"NOTEBOOK", 10, (float) 3499.9);
        obj2.comprar(5);
        obj2.vender(3);
        obj2.subir((float)100.1);
        obj2.descer(100);
   
        JOptionPane.showMessageDialog(null, obj1.mostra());
        JOptionPane.showMessageDialog(null, obj2.mostra());
        
    }
    
}
