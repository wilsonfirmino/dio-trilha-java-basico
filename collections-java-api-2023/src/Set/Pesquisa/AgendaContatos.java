package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();        
    }


    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }            
        }
        return contatosPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Wilson", 1234560);
        agendaContatos.adicionarContato("Wilson", 0);
        agendaContatos.adicionarContato("Wilson Firmino", 1111111);
        agendaContatos.adicionarContato("Wilson DIO", 987654321);
        agendaContatos.adicionarContato("Aline", 98765554);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Aline"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Aline",789789789));

        agendaContatos.exibirContatos();

    }

}
