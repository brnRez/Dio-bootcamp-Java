package Desafios.BancoDigitalOO;

import java.util.Date;

public class Transacao {
    //atributos
    private Date data;
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor){
        this.data = new Date();
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getResumo(){
        return data + " - " + tipo + ": R$ " + valor;
    }
    
    
}
