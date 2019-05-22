package br.com.unifacef.dc.ex0;

import java.util.Date;
import javax.swing.JOptionPane;

public class Testa {
    public static void mostra(Esporte camaleao){
        JOptionPane.showMessageDialog(null, camaleao.toString());
    }
    public static void main(String[] args) {
        Futebol fut = new Futebol(" De campo"," 11 metros do gol"," chegou ao Brasil",new Date()," Inglaterra");
        Basquete bas = new Basquete(" 7 Metros"," 4.6 Metros"," surgiu nos EUA",new Date()," EUA");
        Volei vol = new Volei(" Recepção a defesa"," Bola em jogo"," criado em 1895",new Date()," EUA");
        
       /* JOptionPane.showMessageDialog(null, fut.toString());
        JOptionPane.showMessageDialog(null, bas.toString());
        JOptionPane.showMessageDialog(null, vol.toString());*/
       
       mostra(fut);
       mostra(bas);
       mostra(vol);
    }
    
}
