package edu.brunao.ControleFluxo.EstruturasRepeticao;

import java.util.Random;

public class ExemploDoWhile {
    
    public static void main(String[] args) {

        //Simulando uma Ligação de Telefone
        System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	
    private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + (atendeu?"Sim":"Não"));
		//negando o ato de continuar tocando
		return ! atendeu;

    }
}
