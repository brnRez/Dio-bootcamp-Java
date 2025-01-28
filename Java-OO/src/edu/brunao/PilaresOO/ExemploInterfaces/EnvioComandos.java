package edu.brunao.PilaresOO.ExemploInterfaces;

import edu.brunao.PilaresOO.ExemploInterfaces.Equipamentos.ImpressoraMultifuncional;

public class EnvioComandos {
    
    public static void main (String [] args){
        ImpressoraMultifuncional im = new ImpressoraMultifuncional();
        
        im.imprimir();
        im.copiar();
        im.digitalizar();


    }
}
