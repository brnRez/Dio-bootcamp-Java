package edu.brunao.PilaresOO.ProjetoAppMensagens;

public class Facebook extends ServicoMensagemInstantanea{
    
    public void enviarMensagem(){
        //primeiro validar se há conexão com a internet
        validarConectadoInternet();
        System.out.println("Enviando Mensagem via Facebook!");
        //sempre salvar o histórico
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo Mensagem no Facebook!");
        salvarHistoricoMensagem();
    }
  
}
