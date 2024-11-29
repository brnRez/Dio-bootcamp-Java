package edu.brunao.GettersSetters.Escola;

public class Escola {
    public static void main (String[] args){
        Aluno felipe = new Aluno ();
        felipe.setNome("Brunao");
        felipe.setIdade(25);

        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }

    
}
