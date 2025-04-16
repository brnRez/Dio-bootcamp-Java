package Desafios.BancoDigitalOO;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca (String numero, Cliente cliente, double taxaJuros){
        super(numero, cliente);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Poupanca:");
        for (Transacao t : historico){
            System.out.println(t.getResumo());
        }
        System.out.println("Saldo Atual: R$ " + saldo);
    }




}
