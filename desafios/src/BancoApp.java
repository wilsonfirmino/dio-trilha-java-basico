import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = 5000.0; //scanner.nextDouble();
             
        double taxaJuros = 0.08; //scanner.nextDouble();
        
        int periodo = 5; //scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        DecimalFormat df = new DecimalFormat("#,###.00");

        for(int x=1; x <= periodo; x++){
            valorFinal = valorFinal +(valorFinal * taxaJuros);
        }
        
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
