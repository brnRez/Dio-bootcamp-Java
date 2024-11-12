package edu.brunao.Terminal;

import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

    public static void main (String [] args){

    //criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite Seu Nome");
    String nome = scanner.next();
    
    System.out.println("Digite Seu Sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua Idade");
    int idade = scanner.nextInt();

    System.out.println("Digite Sua Altura");
    double altura = scanner.nextDouble();


    System.out.println("Olá! Meu nome é " + nome + " " + sobrenome + ".");
    System.out.println("Tenho " + idade + " " + "Anos.");
    System.out.println("E Minha Altura é " + altura + "Cm.");




}


    
}
