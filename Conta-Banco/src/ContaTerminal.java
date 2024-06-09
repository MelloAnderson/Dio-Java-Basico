import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Solicitação e leitura dos dados da conta
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitação e leitura dos dados da conta
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            
            scanner.nextLine(); // Consumir a nova linha
            
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();
            
            // Exibição da mensagem final com os dados fornecidos pelo usuário
            String mensagem = "Olá " + nomeCliente + "obrigado por criar uma conta em nosso banco, sua agência é" +
                    agencia + "conta" + numero + "e seu saldo" + saldo + "já está disponível para saque.";
            System.out.println(mensagem);
        }
    }
}
