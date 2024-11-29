package edu.brunao.VisibilidadeRecursos.Lanchonete.Atendimento.Cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando Lanche Natural no Balcão.");

    }
    //pode ser default
     public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando Suco no Balcão.");
    }

    //pode ser default
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando Lanche Natural");
    }

    private void prepararVitamina(){
        System.out.println("Preparando Vitamina");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o Pão, Verduras, carne e adicionais.");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando Fruta e Leite escolhidos.");
    }

    private void lavarIngredientes (){
        System.out.println("Lavando Ingredientes");
    }

    private void baterVitamina (){
        System.out.println("Batendo Vitamina");
    }

    private void fritarIngredientes(){
        System.out.println("Fritando Carne e Ovo para o Lanche.");
    }
    
    private void pedirParaTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes (Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
