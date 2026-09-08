package Lanchonete;

public class Cliente{
    public void escolherLanche(){
        System.out.println("Escolhendo Lanche");
    }

     public void fazerPedido(){
        System.out.println("Fazendo um pedido");
    }

     public void pagandoConta(){
        consultarSaldoApp()
        System.out.println("Pagando a conta");
    }

     private void consultarSaldoApp(){
        System.out.println("Consultando saldo no aplicativo");
    }

}