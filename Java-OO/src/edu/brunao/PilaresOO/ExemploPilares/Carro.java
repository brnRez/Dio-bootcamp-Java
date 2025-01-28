package edu.brunao.PilaresOO.ExemploPilares;

public class Carro extends Veiculo {

    public void ligar () {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro Ligado!");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel!");
    }
    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }

    
}
