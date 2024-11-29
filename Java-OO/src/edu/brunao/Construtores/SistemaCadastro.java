package edu.brunao.Construtores;

public class SistemaCadastro {
    public static void main (String[] args){
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("12345678910", "Marcos");

        //definimos o endereço de Marcos
        marcos.setEndereco("Rua das Marias");
        
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
}
