package Desafios.BancoDigitalOO;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, Cliente cliente, double limiteChequeEspecial){
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    @Override
    public void sacar (double valor){
        if (valor <= saldo + limiteChequeEspecial){
            saldo -= valor;
            historico.add(new Transacao("Saque (CC)", + valor));
        }
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente:");
        for (Transacao t : historico){
            System.out.println(t.getResumo());
        }
        System.out.println("Saldo Atual: R$ " + saldo);
    }


}
