package list.OperacoesBasicas;

public class Item {

    //atributo
    private String descricao;

    public Item(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
       // return "Tarefa {descricao=" + descricao + "]";
        return descricao;
    }

    
}
