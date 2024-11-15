package edu.brunao.ControleFluxo.EstruturasRepeticao;

public class ExemploForArray {

    public static void main(String[] args) {

        //Em Arrays, o Índice de Elementos se inicia em ZERO, portanto, a variável deverá se inicializar com "0" também.
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for (int x=0; x<alunos.length; x++) {

		System.out.println("O aluno número " + (x + 1) + " é " + alunos[x]);
	    }


        //Exemplo de Um For Each:
        for (String aluno : alunos){
            System.out.println("Nome do Aluno é: " + aluno);
            
        }

    }
    
}
