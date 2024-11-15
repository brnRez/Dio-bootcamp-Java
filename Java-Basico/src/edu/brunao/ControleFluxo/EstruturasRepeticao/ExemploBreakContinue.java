package edu.brunao.ControleFluxo.EstruturasRepeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        //Exemplo de um Break numa Estrutura For
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
        }

        //Exemplo de um Continue numa Estrutura For
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
        }

        //Teste de Contagem de números ímpares.
        for(int numero = 0; numero<=100; numero++){
            if (numero%2 == 0)
            continue;

            System.out.println(numero);
        }
    }
    
}
