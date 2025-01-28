package edu.brunao.PilaresOO.ExemploPilares;

public class Autodromo {
    public static void main(String[] args) {
        //Simulando um exemplo de Encapsulamento através da exemplificação de partida de um carro "Jeep"
        Carro jeep = new Carro();
        jeep.setChassi("123471");
        jeep.ligar();


        //Exemplificando o conceito de Herança
        Moto z400 = new Moto();
        z400.setChassi("123411");
        //Exemplificando o Conceito de Abstração
        z400.ligar();
        
        //Exemplificando o Polimorfismo
        Veiculo coringa = jeep;
        Veiculo joker = z400;
        joker.ligar();
        coringa.ligar();
    }
    

    
}
