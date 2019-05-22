
package br.com.unifacef.dc.ex0;

public class TesteAluno_Exemplo {

    public static void main(String[] args) {
        // Teste feliz
        Aluno_Exemplo aluno = new Aluno_Exemplo("23456", 7);
        System.out.println(aluno.passou());
        System.out.println(aluno.qualCurso());
        //Teste triste
        aluno.setNota(-9);
        aluno.setCodigo("63455");
    }
        
}
