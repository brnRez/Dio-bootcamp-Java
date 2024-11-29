package edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento.Cozinha;

public class Almoxarife {
    private void  controlarEntrada(){
        System.out.println("Controlando a Entrada dos itens.");
    }
    private void controlarSaida(){
        System.out.println("Controlando a Saida dos Itens");
    }
     void entregarIngredientes(){
        System.out.println("Entregando Ingredientes");
        controlarSaida();
    }
     void trocarGas(){
        System.out.println("Almoxarife Trocando o Gás");
    }

}
