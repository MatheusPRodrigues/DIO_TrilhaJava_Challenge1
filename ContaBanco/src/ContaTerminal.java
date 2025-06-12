import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int numAgencia = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência:");
        String nomeAgencia = scanner.next();
        scanner.nextLine(); // Utilizado para consumir a quebra de linha

        System.out.println("Por favor, insira o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo de sua conta:");
        // BigDecimal para representar com precisão valores monetários
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo é de R$%s já está disponível para saque",
                nomeCliente, nomeAgencia, numAgencia, String.format("%.2f", saldo));
    }
}
