public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("O break para a execucão");
        for(int contador = 1; contador <= 5; contador++){
            if(contador == 3)
                break; // para a execu;cão
            System.out.println("Contador: " + contador);
        }

        System.out.println("------------------------");

        System.out.println("O continue pula o contador e continua no proximo");
        for(int contador = 1; contador <= 5; contador++){
            if(contador == 3)
                continue; // pula o contador e continua no proximo
            System.out.println("Contador: " + contador);
        }
    }
}
