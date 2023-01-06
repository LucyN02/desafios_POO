package contaBancaria;

public class ContaBancaria {
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos acessores
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

        //metodos especificos
    public boolean sacar(float valorSacado){
        if(this.getSaldo() < valorSacado){
            System.out.println("Saldo insuficiente, tente quando ficar rico");
            return false;
        }

        this.setSaldo(this.getSaldo() - valorSacado);
            System.out.println("Valor sacado com sucesso! O seu saldo agora é: " + this.getSaldo());
            return true;
    }

}
