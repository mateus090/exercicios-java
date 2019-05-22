package br.com.unifacef.dc.ex0;

import javax.swing.JOptionPane;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno obj = new Aluno(2341451, "Mateus", 19);
        obj.notaFinal(5,5);
        JOptionPane.showMessageDialog(null, obj.dadosAluno());
        JOptionPane.showMessageDialog(null, obj.passou());
    }
    
}
