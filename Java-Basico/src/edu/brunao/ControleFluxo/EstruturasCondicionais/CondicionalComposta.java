package edu.brunao.ControleFluxo.EstruturasCondicionais;

public class CondicionalComposta {
    
    public static void main(String[] args) {
        
        int nota = 6;

        if (nota >= 7)
        System.out.println("Aprovado!");

        //exemplo de Condicional Encadeada
        else if (nota >= 5 && nota <7)
        System.out.println("Você está de Recuperação, boa sorte!");

        else
        System.out.println("Reprovado, tente novamente!");

        //Exemplo de Condição Ternária:
       String resultado =  nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Você está de Recuperação, Boa sorte!" : "Reprovado, Tente novamente!";
       System.out.println(resultado);

    }

}
