package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompas {
    
    private List<Item> itemList;

    public CarrinhoDeCompas() {
        this.itemList = new ArrayList<>(0);
    }
    
    public void adicionarItem(String descricao){
        itemList.add(new Item(descricao));
    }

    public void removerItem(String descricao){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item t : itemList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                itemsParaRemover.add(t);
            }            
        }
        itemList.removeAll(itemsParaRemover);
    }

    public int obterNumeroTotalItens(){
        return itemList.size();
    }

    public void obterDescricoesItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompas listaItem = new CarrinhoDeCompas();
        
        System.out.println("O numero total de elementos na lista é: " + listaItem.obterNumeroTotalItens());

        listaItem.adicionarItem("Item 1");
        listaItem.adicionarItem("Item 1");
        listaItem.adicionarItem("Item 2");

        System.out.println("O numero total de elementos na lista é: " + listaItem.obterNumeroTotalItens());

        listaItem.removerItem("Item 1");

        System.out.println("O numero total de elementos na lista é: " + listaItem.obterNumeroTotalItens());

        listaItem.obterDescricoesItens();
    }
}
