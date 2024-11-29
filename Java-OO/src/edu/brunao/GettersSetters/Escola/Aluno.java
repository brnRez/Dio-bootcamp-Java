package edu.brunao.GettersSetters.Escola;

public class Aluno {
   private String nome;
    private int idade;

    //Exemplo de adição agil de mais itens com getters & setters
    private String sexo;
    
    //Exemplo de adição agil de mais itens com getters & setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Exemplo de adição agil de mais itens com getters & setters
    public String getSexo() {
        return sexo;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome (String newNome){
        nome = newNome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){
        this.idade = newIdade;
    }
}
