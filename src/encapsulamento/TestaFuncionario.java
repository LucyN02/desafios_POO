package encapsulamento;

public class TestaFuncionario {
    public static void main (String args[]){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setSalario(2000);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());

    }
}
