package edu.brunao.PilaresOO.ProjetoAppMensagens;

public class ComputadorTeste {
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;
        /*
        NAO SE SABE QUAL APP
        MAS INDEPENDENTE DO QUE FOR, DEVERA ENVIAR E RECEBER MENSAGEM
         */

         String appEscolhido = "msn";
         if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
         else if (appEscolhido.equals("fb"))
            smi = new Facebook();
         else if (appEscolhido.equals("tel"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
            
        }
    }
