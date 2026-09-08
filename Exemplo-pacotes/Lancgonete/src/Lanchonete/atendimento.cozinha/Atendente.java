package Lanchonete;

public class Atendente{
    public void servindoMesa(){
        pegarLancheCozinha();
        
        System.out.println("Servindo Mesa");
    }

    private void pegarLancheCozinha(){
        System.out.println("Pegando Lanche na cozinha");
    }

     public void receberPagamento(){
        System.out.println("Recebendo Pagamento");
    }

    void trocaGas(){
        System.out.println("Atendente trocando gas");
    }

    private void PegarBebidaBalcao(){
        System.out.println("Pegando o pedido no balcao");
    }
}