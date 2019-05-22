
package br.com.unifacef.dc.ex0;

import javax.swing.JOptionPane;

public class TesteCliente {
    
     public static void main(String[] args) {
        Cliente obj = new Cliente("122345-9","1135-4","Fulano",(float)1550.68);
        obj.realizarDeposito(1000);
        obj.realizarSaque(500);
        Cliente obj1 = new Cliente("1223459","11354","Ciclanosnadjasdjsbajdsadhsahjsduiahduisahudisahu",(float)550.68);
        obj1.realizarDeposito(1550);
        obj1.realizarSaque(540);
        JOptionPane.showMessageDialog(null, obj.mostra());
        JOptionPane.showMessageDialog(null, obj1.mostra());
        
    }
    
}
