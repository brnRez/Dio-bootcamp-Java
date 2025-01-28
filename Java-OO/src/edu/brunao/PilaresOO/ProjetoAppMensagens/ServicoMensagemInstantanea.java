package edu.brunao.PilaresOO.ProjetoAppMensagens;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico de Mensagens.");
    }

    protected void validarConectadoInternet(){
        System.out.println("Validando se Está Conectado.");
    }
    
}
