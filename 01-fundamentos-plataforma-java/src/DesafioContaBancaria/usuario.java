package DesafioContaBancaria;

import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {
        conta conta = new conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        conta.nome = sc.nextLine();

        System.out.println("Digite seu número: ");
        conta.numero = sc.nextInt();

        System.out.println("Digite sua agência: ");
        conta.agencia = sc.nextLine();
        sc.nextLine();

        System.out.println("Digite seu saldo: ");
        conta.saldo = sc.nextDouble();

        System.out.print(conta.toString());

        sc.close();
    }
}
