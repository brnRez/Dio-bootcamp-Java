package edu.brunao.DebuggingJava;

public class ExemploDebugging {

    public static void main(String[] args) {
        System.out.println("Iniciou o Programa no Método Main.");
        a();
        System.out.println("Finalizou o Programa no Método Main.");
    }
    static void a() {
        System.out.println("Entrou no Método a.");
        b();
        System.out.println("Finalizou o Método a.");

    }
    
    static void b() {
        System.out.println("Entrou no Método b.");
        for(int i = 0; i<= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o Método b.");

    }

    static void c() {
        System.out.println("Entrou no Método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o Método c.");

    }

}
