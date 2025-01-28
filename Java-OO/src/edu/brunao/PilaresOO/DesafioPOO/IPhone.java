package edu.brunao.PilaresOO.DesafioPOO;

import java.util.Scanner;

import edu.brunao.PilaresOO.DesafioPOO.Aparelhos.DispositivoMovel;

public class IPhone extends DispositivoMovel {

    public static void main(String[] args) {

        DispositivoMovel app = new DispositivoMovel();

        Scanner opcaoApp = new Scanner(System.in);
        System.out.println("Qual app você deseja acessar?");
        System.out.println("1 - Telefone;");
        System.out.println("2 - Navegador;");
        System.out.println("3 - Reprodutor de Vídeo;");
        System.out.println("4 - Reprodutor de Música");
        int abrirApp = opcaoApp.nextInt();

        switch (abrirApp) {
            case 1:
                app.abrirTelefone();
                break;
            case 2:
                app.abrirNavegador();
                break;
            case 3:
                app.abrirReprodutorVisual();
                break;
            case 4:
                app.abrirReprodutorMusical();
                break;
            default:
            System.out.println("Opção Inválida.");
                break;
        }
        
    }
    
    
}
