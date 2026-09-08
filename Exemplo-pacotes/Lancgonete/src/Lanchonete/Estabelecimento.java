package Lanchonete;

public class Estabelecimento{
    public static void main(String[] args) {
        Cozinhiero cozinheiro = new Cozinhiero();
    
        //ações que estabelecimento precisa Ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        
        Atendente atendente = new atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();
        

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        

    }
}