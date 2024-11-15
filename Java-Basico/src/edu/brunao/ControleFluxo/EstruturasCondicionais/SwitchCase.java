package edu.brunao.ControleFluxo.EstruturasCondicionais;

public class SwitchCase {
    public static void main(String[] args) {
        
        String sigla = "M";

        //Sempre lembrar de adicionar o "Break", para que não haja erros no código.

		switch (sigla) {
		case "P":{
			System.out.println("Tamanho: Pequeno");
			break;
		}
		case "M":{
			System.out.println("Tamanho: Médio");
			break;
		}
		case "G":{
			System.out.println("Tamanho: Grande");
			break;
		}
		default:
			System.out.println("Tamanho não encontrado, Digite novamente, por favor!");
		}


        //Exemplo de Utilização eficiente de um Switch Case sem "Break"
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}

        }

    }

}