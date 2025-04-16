# Desafio Com Orientação a Objetos - Banco Digital

Pequeno desafio demonstrando o funcionamento de um Banco digital, com atividades como saque, transferência e depósito.

Futuramente, pretendo implementar a função compra, utilizando o Cartão.

## Diagrama

```mermaid

classDiagram
    class Cliente {
        -String nome
        -String cpf
        -String email
        +getNome()
        +getCpf()
        +getEmail()
        +getDados()
    }

    class Cartao {
        -String numero
        -Date validade
        -String tipo
        -double limite
        +autorizarCompra(double): boolean
    }

    class Conta {
        #String numero
        #double saldo
        #Cliente cliente
        #List~Transacao~ historico
        +depositar(double)
        +sacar(double)
        +transferir(Conta, double)
        +getSaldo(): double
        +getCliente(): Cliente
        +imprimirExtrato()*
    }

    class ContaCorrente {
        -double limiteChequeEspecial
        +sacar(double)
        +imprimirExtrato()
    }

    class ContaPoupanca {
        -double taxaJuros
        +aplicarRendimento()
        +imprimirExtrato()
    }

    class Transacao {
        -Date data
        -String tipo
        -double valor
        +getResumo(): String
    }

    class Main {
        <<static>>
        +main(String[])
    }

    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta --> Cliente
    Conta --> Transacao





