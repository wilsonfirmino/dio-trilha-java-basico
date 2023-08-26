import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantidadeDoces = 0;
        while( mesada > 0){
            Double valorDoce = valorAleatorio();            
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");    
            mesada = mesada - valorDoce;
            quantidadeDoces++;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em "+ quantidadeDoces +" doces");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
