package edu.brunao.PilaresOO.DesafioPOO.Aparelhos;

import java.util.Scanner;

import edu.brunao.PilaresOO.DesafioPOO.Apps.Navegador;
import edu.brunao.PilaresOO.DesafioPOO.Apps.ReprodutorMusical;
import edu.brunao.PilaresOO.DesafioPOO.Apps.ReprodutorVisual;
import edu.brunao.PilaresOO.DesafioPOO.Apps.Telefone;

public class DispositivoMovel implements Navegador,ReprodutorMusical,ReprodutorVisual,Telefone  {

       public void botaoInicio(){
        System.out.println("Voltando ao Início.");
    }

    //Funções de Telefone
    public void abrirTelefone(){
        System.out.println("Abrindo o app Telefone.");
        menuTelefone();
    }
    public void menuTelefone(){
        Scanner opcaoTel = new Scanner(System.in);
        System.out.println("Qual funcionalidade você deseja utilizar?");
        System.out.println("1 - Fazer uma Ligação;");
        System.out.println("2 - Atender uma Ligação;");
        System.out.println("3 - Utilizar o Correio de Voz");
        int funcaoTel = opcaoTel.nextInt();

        switch (funcaoTel) {
            case 1:
                ligar();
                break;
            case 2:
                atender();
                break;
            case 3:
                iniciarCorreioVoz();
                break;
            default:
            System.out.println("Opção Inválida");
                break;
        }

    }
    public void ligar (){
        Scanner digitarNumero = new Scanner(System.in);
        System.out.println("Digite o número desejado para efetuar a ligação: ");
        String numero = digitarNumero.nextLine();
        System.out.println("ligando para: " + numero); 
    }
    public void atender(){
        System.out.println("Atendendo ligação...");

    }
    public void iniciarCorreioVoz(){
        System.out.println("Abrindo Correio de Voz!");
        selecionarCorreioVoz();
    }
    public void selecionarCorreioVoz(){
        Scanner digitarOpcao = new Scanner(System.in);
        System.out.println("Insira o número da mensagem que deseja reproduzir:");
        int opcao = digitarOpcao.nextInt();
        System.out.println("Agora reproduzindo a mensagem: " + opcao);
    }

    //Funções de Navegador
    public void abrirNavegador(){
        System.out.println("Abrindo o Navegador...");
        menuNavegador();
    }
    public void menuNavegador(){
        Scanner opcaoNav = new Scanner(System.in);
        System.out.println("Qual funcionalidade você deseja utilizar?");
        System.out.println("1 - Abrir uma Página Específica;");
        System.out.println("2 - Adicionar uma Nova Aba;");
        System.out.println("3 - Atualizar a Página Atual");
        int funcaoNav = opcaoNav.nextInt();

        switch (funcaoNav) {
            case 1:
                exibirPagina();
                break;
            case 2:
                adicionarNovaAba();
                break;
            case 3:
                atualizarPagina();
                break;
            default:
            System.out.println("Opção Inválida");
                break;
        }
    }
    public void exibirPagina (){
        Scanner digitarSite = new Scanner(System.in);
        System.out.println("Inserir URL: ");
        String url = digitarSite.nextLine();
        System.out.println("Abrindo: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página.");
    }
    
    //Funções de Reprodutor de Vídeo
    public void abrirReprodutorVisual(){
        System.out.println("Abrindo Player de Vídeo...");
        selecionarVideo();
    }
    public void menuVideo(){
        Scanner opcaoMenu = new Scanner(System.in);
        System.out.println("Qual funcionalidade você deseja utilizar?");
        System.out.println("1 - Pausar o Vídeo Atual;");
        System.out.println("2 - Retomar o Vídeo Atual;");
        System.out.println("3 - Voltar ao Menu do Reprodutor de Vídeos");
        int funcaoMenu = opcaoMenu.nextInt();

        switch (funcaoMenu) {
            case 1:
                pausarVideo();
                break;
            case 2:
                retomarVideo();
                break;
            case 3:
                voltarMenuVideo();
                break;
            default:
            System.out.println("Opção Inválida");
                break;
        }
    }
    public void selecionarVideo(){
        Scanner digitarVideo = new Scanner(System.in);
        System.out.println("Qual vídeo você deseja reproduzir? ");
        String video = digitarVideo.nextLine();
        System.out.println("Abrindo: " + video);
        menuVideo();
    }
    public void pausarVideo(){
        System.out.println("Pausando Video!");
    }
    public void retomarVideo(){
        System.out.println("Retomando Vídeo!");
    }
    public void voltarMenuVideo(){
        System.out.println("Voltando ao Menu!");
        selecionarVideo();
    }

    //Funções do Player de Música
    public void abrirReprodutorMusical(){
        System.out.println("Abrindo Reprodutor Musical");
        selecionarMusica();
    }
     
    public void selecionarMusica (){
        Scanner digitarMusica = new Scanner(System.in);
        System.out.println("Qual música você deseja ouvir? ");
        String musica = digitarMusica.nextLine();
        System.out.println("Agora reproduzindo: " + musica);
        menuMusica();
    }
    public void tocar(){
        System.out.println("Tocando Musica!");
    }
    public void pausar(){
        System.out.println("Pausando Musica!");
    }
    public void voltarMenuMusica(){
        System.out.println("Voltando ao Menu");
        selecionarMusica();
    }
    public void menuMusica(){
        Scanner opcaoMenu = new Scanner(System.in);
        System.out.println("Qual funcionalidade você deseja utilizar?");
        System.out.println("1 - Pausar a Música Atual;");
        System.out.println("2 - Retomar a Música Atual;");
        System.out.println("3 - Voltar ao Menu do Reprodutor Musical");
        int funcaoMenu = opcaoMenu.nextInt();

        switch (funcaoMenu) {
            case 1:
                pausar();
                break;
            case 2:
                tocar();
                break;
            case 3:
                voltarMenuMusica();
                break;
            default:
            System.out.println("Opção Inválida");
                break;
        }
    }

}
