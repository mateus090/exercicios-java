package br.com.unifacef.dc.ex2;

import javax.swing.JOptionPane;

public class TestaRodoviaria {

    public static void main(String[] args) {
        
        Rodoviaria ro1 = new Rodoviaria("Rodo","Franca");
        Onibus on1 = new Onibus(1500, "Volvo");
        Onibus on2 = new Onibus(1705, "Mercedes");
        Passageiro pa1 = new Passageiro("Mateus","123"); 
        Passageiro pa2 = new Passageiro("Daniel","456");
        Passageiro pa3 = new Passageiro("Leticia","789"); 
        Passageiro pa4 = new Passageiro("Tatiane","101"); 
        
        // Adiciona onibus na rodoviaria
        ro1.adicionaOnibus(on1);
        ro1.adicionaOnibus(on2);
        // Adiciona passageiro no onibus
        ro1.adicionaPassageiroOnibus(on1, pa1);
        ro1.adicionaPassageiroOnibus(on1, pa2);
        ro1.adicionaPassageiroOnibus(on2, pa3);
        ro1.adicionaPassageiroOnibus(on2, pa4);
        JOptionPane.showMessageDialog(null, ro1.toString());
        
        //Remove passageiro do onibus
        ro1.removeOnibusPassageiro(on1, pa1);
        JOptionPane.showMessageDialog(null, ro1.toString());
        
        //Atualiza passageiro do onibus
        Passageiro pa5 = new Passageiro("Gustavo","789");
        ro1.atualizaPassageiroOnibus(on1, pa5);
        JOptionPane.showMessageDialog(null, ro1.toString());
        
        //Atualiza onibus
        Onibus on3 = new Onibus(1500, "MAN");
        ro1.atualizaOnibus(on3);
        JOptionPane.showMessageDialog(null, ro1.toString());
    }
    
}
