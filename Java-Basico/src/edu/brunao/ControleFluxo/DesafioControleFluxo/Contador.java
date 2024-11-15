package edu.brunao.ControleFluxo.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);
        

        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException exception) {
            System.out.println("O Segundo parâmetro deve ser maior que o Primeiro, Tente novamente!");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção, também valida se ambos os parâmetros são diferentes de zero.

		if (parametroUm > parametroDois || (parametroDois == 0 && parametroUm == 0)) {
            throw new ParametrosInvalidosException();   
        }

		int contagem = parametroDois - parametroUm;
        System.out.println("Iniciando contagem de :" + contagem + " Segundos");
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
               System.out.println(i);
	
            }
            System.out.println("Contagem Finalizada.");
        }
    
}