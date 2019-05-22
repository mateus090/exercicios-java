package br.com.unifacef.dc.ex0;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    private float nota ;

    public Aluno(int numeroAluno, String nome, int idade){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    public void notaFinal(float p1, float p2){
        nota = (p1 + p2)/2;
        System.out.print(this.nota);
    }
    public String passou(){
        if(nota >= 6){
            return "Nota: " + this.nota + " - Aprovado";
        }
        else return "Nota: " + this.nota + " - Reprovado";
    }
    public String dadosAluno(){
        return "Cód. Aluno: " + this.numeroAluno + "\n" +
               "Nome: " + this.nome + "\n" +  
               "Idade: " + this.idade;
               
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public int setNumeroAluno(int numeroAluno) {
        if(Integer.toString(numeroAluno).length() == 6){
            this.numeroAluno = numeroAluno;
        }
        return 0;   
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        if(nome.length() < 30){
            this.nome = nome;
        }
        else return "Nome inválido";
        return null;
    }

    public int getIdade() {
        return idade;
    }

    public String setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }
        else return "Idade inválida";
        return null;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 > 0){
            this.p1 = p1;
        }
        else System.out.println("Nota inválida");
       
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 > 0){
            this.p2 = p2;
        }
        else System.out.println("Nota inválida"); 
    }
    
}