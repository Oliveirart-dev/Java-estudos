package CondicionalComposta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();

        double media = nota1 + nota2 / 2;
        System.out.println("Média final: " + media);

       for (int i = 1; i <= 1; i++) {
            if (media >= 7) {
                System.out.println("Você pássou!");
            } else if (media >= 5 && media <= 6) {
                System.out.println("Você está de recuperação!");
            } else if (media >= 1 && media <= 4) {
                System.out.println("Você reprovou!");
            }
        }


    }
}