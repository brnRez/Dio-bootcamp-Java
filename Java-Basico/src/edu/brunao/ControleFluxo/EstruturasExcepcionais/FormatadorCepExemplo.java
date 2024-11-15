package edu.brunao.ControleFluxo.EstruturasExcepcionais;

public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376596");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep Invalido, revise-o.");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
        
    }
}
