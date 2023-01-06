package animais;

public class TestaAnimais {
    public static void main(String args[]){
        Animal cachorro = new Animal("cachorro",5);
        Animal cavalo = new Animal("cavalo",5);
        Animal preguiça = new Animal("preguiça",10);

        cachorro.som();
        cachorro.movimento();

        cavalo.som();
        cavalo.movimento();

        preguiça.som();
        preguiça.movimento();
    }
}
