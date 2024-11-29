package edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("Servindo Mesa");
    }
    
    void pegarLancheCozinha() {
        System.out.println("Pegando o Lanche na Cozinha");
    }

    public void receberPagamento() {
        System.out.println("Recebendo Pagamento");
    }

    void trocarGas() {
        System.err.println("Atendente Trocando o Gas");
    }
    private void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no Balcão");
    }
}
