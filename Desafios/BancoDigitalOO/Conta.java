package Desafios.BancoDigitalOO;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    //atributos
    protected String numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> historico = new ArrayList<>();

    public Conta (String numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar (double valor) {
        saldo += valor;
        historico.add(new Transacao("Deposito", valor));
    }
    
    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            historico.add(new Transacao("Saque", valor));
        }
    }


    public void transferir (Conta destino, double valor){
        if (valor <= saldo){
            this.saldo -= valor;
            destino.depositar(valor);
            historico.add(new Transacao("Transferência", valor));
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    
    public abstract void imprimirExtrato();
}
