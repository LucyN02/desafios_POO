package estoqueLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleLojaCRUD {
    List<String> estoque = new ArrayList<String>();
    Scanner entrada = new Scanner(System.in);


    public void adicionarItem(){
        System.out.println("Digite o item que você deseja adicionar");
        String item = entrada.nextLine();
        estoque.add(item);
        System.out.println("Esse é o seu estoque atual: " + estoque);
     }
}
