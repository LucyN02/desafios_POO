package controleRemoto;

import javax.naming.ldap.Control;

public class TesteControleRemoto {
    public static void main(String args[]){
        ControleRemoto controleRemoto = new ControleRemoto();

        System.out.println("Chamando Carro: " + controleRemoto.mover("Carro"));
        System.out.println("Chamando Avião: " + controleRemoto.mover("Avião",true));
        System.out.println("Chamando Barco: " + controleRemoto.mover("Barco",true));


    }

}
