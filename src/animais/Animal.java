package animais;

public class Animal {
    String nome;
    int idade;
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void som(){
        switch (nome) {
            case "cachorro" -> System.out.println("au au");
            case "cavalo" -> System.out.println("hiin in in hinir");
            case "preguiça" -> System.out.println("zzZzzZ");
        }
    }

    public void movimento(){
        if(nome == "cachorro" || nome == "cavalo"){
            System.out.println("correndo...");
        }else{
            System.out.println("dormindo...");
        }
    }


}
