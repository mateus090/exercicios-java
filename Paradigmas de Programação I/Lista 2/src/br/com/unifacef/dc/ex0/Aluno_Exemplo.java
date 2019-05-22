package br.com.unifacef.dc.ex0;

public class Aluno_Exemplo {
    private String codigo;
    private float nota;
    
    
    public Aluno_Exemplo(String codigo, float nota){
        this.setCodigo(codigo);
        this.setNota(nota);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length() == 5){
            this.codigo = codigo;
        }
        else System.out.println("Código inválido");
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if ((nota >= 0) && (nota <= 10)){
            this.nota = nota;
        }
        else System.out.println("Nota inválida");
    }
    
    public String passou(){
        if(this.nota >= 6){
            return "Aprovado";
        }
        else return "Reprovado";
    }
    public String qualCurso(){
        char id = this.codigo.charAt(0);
        if (id == '1'){
            return "SI";
        }
        else if(id == '2'){
            return "ES";
        }
        else return "Não importa";
    }
}
