
package br.com.unifacef.dc.ex0;

import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
        Rio obj1 = new Rio("Rio Claro",(float)102.2,true);
        obj1.chover(3);
        obj1.ensolarar(6);
        obj1.limpar();
        
        Rio obj2 = new Rio("Rio Grande",(float)99.5,false);
        obj2.chover(3);
        obj2.ensolarar(4);
        obj2.sujar();
        
        JOptionPane.showMessageDialog(null, obj1.mostra());
        JOptionPane.showMessageDialog(null, obj2.mostra());
    }
    
}
