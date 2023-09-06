public class UsuarioIPhone {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println("*************************************");
        System.out.println("*** Iniciando aparelho telefonico ***");
        System.out.println("*************************************");
        iPhone.aparelhoTelefonico.ligar();
        iPhone.aparelhoTelefonico.atender();
        iPhone.aparelhoTelefonico.iniciarCorrerioVoz();
        System.out.println("*");

        System.out.println("*************************************");
        System.out.println("** Iniciando navegador de internet **");
        System.out.println("*************************************");
        iPhone.navegadorInternet.exibirPagina();
        iPhone.navegadorInternet.atualizarPagina();
        iPhone.navegadorInternet.adicionarNovaAba();
        System.out.println("*");

        System.out.println("*************************************");
        System.out.println("**** Iniciando reprdutor musical ****");
        System.out.println("*************************************");
        iPhone.reprodutorMusical.tocar();
        iPhone.reprodutorMusical.pausar();
        iPhone.reprodutorMusical.selecionarMusica();
        System.out.println("*");
        System.out.println("*************************************");
        
    }
    
}
