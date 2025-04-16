package Desafios.BancoDigitalOO;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Brunao", "123.456.789-00", "brunao@email.com");
        ContaCorrente cc = new ContaCorrente("0001", cliente1, 500);
        ContaPoupanca cp = new ContaPoupanca("0002", cliente1, 0.01);

        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(cp, 300);

        cp.aplicarRendimento();

        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();
    }
}
