
package br.com.unifacef.dc.ex0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
      Carro obj1 = new Carro(30,true);
      obj1.acelerar(50);
      Carro obj2 = new Carro(0,false);
      obj2.ligar();
      obj2.acelerar(60);
      JOptionPane.showMessageDialog(null, obj1.toString());
      JOptionPane.showMessageDialog(null, obj2.toString());
    }
    
}
