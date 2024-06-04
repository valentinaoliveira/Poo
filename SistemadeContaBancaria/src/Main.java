public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(5684, "Valentina de Oliveira Leite");
          if(c1.depositar(100))
            System.out.println("Deposito realizado com sucesso");
          else
            System.out.println("Valor Invalído!");
        System.out.println("Saldo" + c1.getSaldo());

        if (c1.sacar(13.40))
            System.out.println("Saque realizado!");
            else
                System.out.println("Saque Invalído!");
    }
}