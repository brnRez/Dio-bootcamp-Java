package edu.brunao.PilaresOO.ExemploInterfaces.Equipamentos;

import edu.brunao.PilaresOO.ExemploInterfaces.Funcionalidades.Copiadora;
import edu.brunao.PilaresOO.ExemploInterfaces.Funcionalidades.Digitalizadora;
import edu.brunao.PilaresOO.ExemploInterfaces.Funcionalidades.Impressora;

public class ImpressoraMultifuncional implements Impressora,Digitalizadora,Copiadora {
    
    public void imprimir(){
        System.out.println("Imprimindo via Multifuncional.");

      
        }

    public void copiar(){
            System.out.println("Fazendo uma Cópia.");
    
            
        }

    public void digitalizar(){
            System.out.println("Digitalizando um Arquivo via Multifuncional.");
    
           
        }
    }
