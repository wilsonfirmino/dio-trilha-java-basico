package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{

    public static void main(String[] args) {
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();
        imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcio", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indoce do elemento");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O cadidato de numero: " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de intera;ão for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos={"Felipe","Marcio","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println(candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        System.out.println("Foram selecionado " + candidatosSelecionados + " candodatos");

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase==salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
            else{
                System.out.println("Aguardar o resultado dos demais candidatos");
            }
    }
}