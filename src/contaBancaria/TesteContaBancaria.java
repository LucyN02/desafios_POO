package contaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria novaConta = new ContaBancaria(22, 5050, 2, "luci", 100f);
        System.out.println("número da conta: " + novaConta.getNumero());
        System.out.println("número da agência: " + novaConta.getAgencia());
        System.out.println("Tipo de conta: " + novaConta.getTipo());
        System.out.println("Titular: " + novaConta.getTitular());
        System.out.println("Saldo: " + novaConta.getSaldo());

        novaConta.sacar(150f);
    }
}
