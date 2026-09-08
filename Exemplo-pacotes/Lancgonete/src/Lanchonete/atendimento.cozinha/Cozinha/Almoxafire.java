package Lanchonete.atendimento.cozinha;

public class Almoxarife{
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos Itens");
    }

     private void controlarSaida(){
        System.out.println("Controlando a Saida dos Itens");
    }

      void entregarIngredientes(){
        System.out.println("Entregando os ingredientes");
        controlarSaida();
    }

         void trocaGas(){
        System.out.println("Almoxarife trocando gas");
    }
}