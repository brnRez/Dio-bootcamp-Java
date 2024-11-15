package edu.brunao.ControleFluxo.EstruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    
    public static void main(String[] args) {

        double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();

            //Adicionado para não apresentar valor negativo no resultado.
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce Adicionado no Carrinho! Valor: " + valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
    
}
