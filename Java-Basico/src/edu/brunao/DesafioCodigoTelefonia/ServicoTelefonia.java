package edu.brunao.DesafioCodigoTelefonia;

import java.util.Scanner;

public class ServicoTelefonia {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
         //String [] clientes = {"Alice", "Bob", "Carol", "Joao"}       
          for (String parte:partes)
           
           if (parte.equals(servico)){
            contratado = true;
           }
           
        
         String resultado = contratado? "Sim": "Nao";
         System.out.println(resultado);
    }
}
