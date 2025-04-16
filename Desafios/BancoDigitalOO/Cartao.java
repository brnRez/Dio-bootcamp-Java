package Desafios.BancoDigitalOO;

import java.sql.Date;

public class Cartao {

    //atributos
    private String numero;
    private Date validade;
    private String tipo;
    private double limite;

    public Cartao(String numero, Date validade, String tipo, double limite){
        this.numero = numero;
        this.validade = validade;
        this.tipo = tipo;
        this.limite = limite;
    }
    
    public boolean autorizarCompra(double valor){
        return valor <= limite;
    }

    


}
