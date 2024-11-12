package edu.brunao.Terminal;

public class Argumentos {


    /*
      Assim como o TesteTerminal.java, não foi possível criar o arquivo Argumentos.class 
     Efetuei a edição manualmente no launch.json para que o teste pudesse ser efetuado.
     */


    
    public static void main (String [] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " Anos ");
        System.out.println("Minha altura eh " + altura + "cm ");




    }
    
}
