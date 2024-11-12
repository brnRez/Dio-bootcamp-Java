package edu.brunao.ContaBanco;

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e Importar a Classe Scanner: Done
        //Exibir as Mensagens para o nosso usuário: Done
        //Obter pela scanner os valores digitados no terminal: Done
        //Exibir a mensagem "Conta Criada": Done
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo ao app de criação de contas do Nosso Banco!");


        System.out.println("Por Favor, Digite o número de Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número de sua Agência contendo o hífen " + "(-)" + ", por favor:");
        String numeroAgencia = scanner.next();

        System.out.println("Qual seria o Saldo da conta?");
        double saldo = scanner.nextDouble();

        System.out.println("Qual seu nome e Sobrenome?");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("E Como você deseja ser chamado?");
        String apelido = scanner.nextLine(); 

        System.out.println("Olá, " + apelido + "!");
        System.out.println("Obrigado por criar uma conta em Nosso Banco! Sua Agência é " + numeroAgencia + ", sua Conta é " + numeroConta + " e seu Saldo (" + saldo + ") " +  "já está disponível para saque!");




    }
    
}
