package edu.brunao.ControleFluxo.EstruturasCondicionais;

public class CondicionalSimples {

    //Simulação de um Caixa Eletronico para exemplificação de uma estrutura condicional simples.

    public static void main(String[] args) {
        
        double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
    
}
