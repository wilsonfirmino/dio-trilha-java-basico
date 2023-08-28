import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            System.out.println("Digite o primeiro parametro:");
            int paremetroUm = terminal.nextInt();
    
            System.out.println("Digite o segundo parametro:");
            int parametroDois = terminal.nextInt();
        
            try{
                contar(paremetroUm, parametroDois);
            }catch(ParametrosInvalidosException e){
                System.out.println("Exception: " + e.getMessage());         
            }

            } catch (InputMismatchException e) {
            System.out.println("Exception: Os parametros só aceitam valores numericos.");
        }
    }

    static void contar(int paremetroUm, int parametroDois) throws ParametrosInvalidosException{

        if (paremetroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - paremetroUm;
        for(int x=1; x <= contagem; x++){
            System.out.println("Imprimindo o numero " + x);
        }
    }
}
