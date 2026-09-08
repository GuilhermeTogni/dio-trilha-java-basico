package Lanchonete.atendimento.cozinha;

import Lanchonete.atendimento.cozinha;

public class Cozinhiero {

    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hambuguer no balcao");
    }

     //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando Suco natural  no balcao");
    }

     //pode ser default
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println( "   Preparando Lache tipo Hamburguer");

    }

    private void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }

    private void preparaCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientes(){
        System.out.println("selecionando ingredientes");
    }
    
    private void PedirParaTrocaGas(Almoxarife meuAmigo){
        meuAmigo.trocaGas();
    }

    private  void pedirIngredientes(Almoxarife almoxarife){
        meuAmigo.entregarIngredientes();
    }

    private void lavarIngredientes(){
        System.out.println("Lavando Ingredientes");
    }

    private void baterVitaminaLiquitificador(){
        System.out.println("Batendo vitamina no Liquidificador");
    }

  

   
    
}