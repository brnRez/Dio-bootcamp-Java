package edu.brunao.VisibilidadeRecursos.Lanchonete;

import edu.brunao.VisibilidadeRecursos.Lanchonete.AreaCliente.Cliente;
import edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento.Atendente;
import edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento.Cozinha.Almoxarife;
import edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main (String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();

       

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();


       

    
        
    }
}
