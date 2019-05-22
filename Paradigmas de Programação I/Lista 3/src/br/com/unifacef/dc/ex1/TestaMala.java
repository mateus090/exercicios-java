package br.com.unifacef.dc.ex1;

import javax.swing.JOptionPane;

public class TestaMala {

    public static void main(String[] args) {
        
        Mala m1 = new Mala(1,23,"Branca");
        Mala m2 = new Mala(2,12,"Marrom");
        Mala m3 = new Mala(3,5,"Verde");
        
        Passageiro pa1 = new Passageiro("Bolsonaro", "12345");
        // C - Create
        pa1.adicionaMala(m1);
        pa1.adicionaMala(m2);
        pa1.adicionaMala(m3);
        JOptionPane.showMessageDialog(null, pa1.toString());
        
        // D = Delete
        pa1.removeMala(m2);
        JOptionPane.showMessageDialog(null, pa1.toString());
        
        // U - Update
        Mala m4 = new Mala(3, 9, "Verde escura");
        pa1.atualizaMala(m4);
        JOptionPane.showMessageDialog(null, pa1.toString());
    }
    
}
