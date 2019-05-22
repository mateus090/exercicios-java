
package br.com.unifacef.dc.ex1;

import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiro {

    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Mateus","12345678910");
        Voo voo = new Voo("Franca","1");
        voo.setDestino("Sacramento - MG");
        Reserva reserva = new Reserva(1001, new Date(), passageiro, voo);
        Reserva reserva2 = new Reserva();
        reserva2.setCodigo(2002);
        reserva2.setData(new Date());
        reserva2.setPassageiro(passageiro);
        reserva2.setVoo(voo);
        
        JOptionPane.showMessageDialog(null,reserva.toString());
        JOptionPane.showMessageDialog(null,reserva2.toString());
    }
    
}
