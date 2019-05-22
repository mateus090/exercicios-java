
package br.com.unifacef.dc.ex0;

import java.util.Date;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
       Conta conta = new Conta("1555","149-7","Mateus",2000);
       Cartao cartao = new Cartao(123,7888,46,"Visa",new Date(),conta);
       JOptionPane.showMessageDialog(null,cartao.toString());
       
       if(!cartao.saque(1555,123)){
           JOptionPane.showMessageDialog(null,"Saque não realizado");
       }
       else JOptionPane.showMessageDialog(null,cartao.toString());
    }
    
}
