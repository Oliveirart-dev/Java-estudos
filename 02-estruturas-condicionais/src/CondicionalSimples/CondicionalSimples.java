package CondicionalSimples;

import java.util.Scanner;

public class CondicionalSimples {

    //Caixa eletronico

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = sc.nextDouble();
        double retirarValor = sc.nextDouble();
        boolean funcionando = true;

        while(funcionando == true) {
            if (saldo > retirarValor) {
                System.out.println("Valor Retirado com sucesso! " + saldo);
                funcionando = false;
            } else {
                System.out.println("O valor excede o saldo! ");
            }
        }
    }
}

