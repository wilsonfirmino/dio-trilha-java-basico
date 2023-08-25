import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Imporat a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario
        //obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o numero da Agencia !");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta !");
        int numero = scanner.nextInt();

        System.out.println("Digite seu nome !");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome !");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite seu saldo na conta !");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
