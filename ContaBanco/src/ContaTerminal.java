import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importa a classe  Scanner
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

    //Obter pela Scanner os dados digitados pelo usuário
        System.out.println("Por favor, digite o número da conta: ");
       numeroConta =  scanner.nextInt();
       scanner.nextLine();
       
       System.out.println("Por favor, digite o número da agência: ");
       agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo =  scanner.nextDouble();
        
    //Exibir a mensagem para o nosso usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        

        //Exibir a mensagem final, da conta criada
        scanner.close();
    }
}
