---
title: Bank example
---


classDiagram
    class Banco {
        - nome: String
        - cnpj: String
        - contas: List<Conta>
        + adicionarConta(conta: Conta): void
        + buscarConta(numero: String): Conta
    }

    class Cliente {
        - nome: String
        - cpf: String
        - email: String
        + getDados(): String
    }

    class Conta {
        <<abstract>>
        - numero: String
        - saldo: Double
        - cliente: Cliente
        - historico: List<Transacao>
        + depositar(valor: Double): void
        + sacar(valor: Double): void
        + transferir(destino: Conta, valor: Double): void
        + getSaldo(): Double
    }

    class ContaCorrente {
        - limiteChequeEspecial: Double
        + usarChequeEspecial(): void
    }

    class ContaPoupanca {
        - taxaJuros: Double
        + aplicarRendimento(): void
    }

    class Transacao {
        - data: Date
        - tipo: String
        - valor: Double
        - descricao: String
        + getResumo(): String
    }

    class Cartao {
        - numero: String
        - validade: Date
        - tipo: String
        - limite: Double
        + autorizarCompra(valor: Double): boolean
    }

    Banco --> Conta
    Conta --> Cliente
    Conta --> "1..*" Transacao
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta --> Cartao

