package estoqueLoja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    public static void main(String args[]){
        List<String> estoque = new ArrayList<String>();

        //adiciona items na lista estoque
        estoque.add("Camiseta");
        estoque.add("Vestido");
        estoque.add("Bota");

        //atualiza items na lista estoque
        estoque.remove("Bota");
        estoque.add("Cortuno");

        //mostra items da lista
        System.out.println("No meu estoque tem: " + estoque);

        //remove um item da lista pelo indice
        estoque.remove(1);

        //lista depois da remoção de um item do estoque
        System.out.println("No meu estoque tem: " + estoque);

    }
}
