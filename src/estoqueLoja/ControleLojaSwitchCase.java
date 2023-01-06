package estoqueLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleLojaSwitchCase extends ControleLojaCRUD{
    public static void main(String[] args){
        List<String> estoque = new ArrayList<String>();
        Scanner leia = new Scanner(System.in);
        String item;
        String itemEdicao;
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {System.out.println("""
                Você deseja:
                 1. Adicionar um novo item\s
                 2. Excluir um item\s
                 3. Atualizar um item\s
                 4. mostrar a listagem do estoque
                 0. sair""");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o item que vc queira adicionar: ");
                    item = leia.next();
                    estoque.add(item);
                    System.out.println("Esse é o seu estoque atual: " + estoque);
                }
                case 2 -> {
                    System.out.println("Digite o item que vc queira remover: ");
                    item = leia.next();
                    estoque.remove(item);
                    System.out.println("Esse é o seu estoque atual: " + estoque);
                }
                case 3 -> {
                    System.out.println("Digite o nome do item que vc queira alterar: ");
                    item = leia.next();
                    System.out.println("Digite o novo nome do item:  ");
                    itemEdicao = leia.next();
                    estoque.set(estoque.indexOf(item), itemEdicao);
                }
                case 4 -> {
                    System.out.println("O seu estoque atual é: " + estoque);
                }
            }
        }while(opcao != 0);

    }
}
