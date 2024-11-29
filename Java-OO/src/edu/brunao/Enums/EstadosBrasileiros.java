package edu.brunao.Enums;


//exemplos de enums em utilização.

public enum EstadosBrasileiros{

    SAO_PAULO ("SP", "São Paulo", 1),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 2),
    PIAUI ("PI" , "Piauí", 3),
    MARANHAO ("MA" , "Maranhão", 4),
    CEARA ("CE" , "Ceará", 5);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public int getIbge() {
        return ibge;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }






    }