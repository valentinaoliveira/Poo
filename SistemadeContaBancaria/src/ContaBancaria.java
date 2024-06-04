public class ContaBancaria {
    //Atributos
    private int numero;
    private double saldo; // pode manipular fora da classe, pq tem método publico incluido
    private String titular;

    //Construtor
    public ContaBancaria(int numero, String titular){
        this.numero=numero;
        this.saldo= 0.0;
        this.titular=titular;
    }


    //Métodos
    public boolean depositar(double valor){
        if(valor<=0)
            return false;
        this.saldo+=valor;
            return true;
    }
    public boolean sacar(double valor){
        if(valor<=0 || this.saldo>=valor)
            return false;
        this.saldo-=valor;
            return true;

    };

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    // getter and setters
    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // toString()

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
