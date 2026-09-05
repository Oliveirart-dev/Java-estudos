package metodos;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();

        System.out.println("Quer ligar a TV? \n1. Ligar \n2. Desligar" +
                "");
        int opcao = sc.nextInt();
        smartTV.ligar();
        if (opcao == 1) {
            while (smartTV.ligada  == true) {

                System.out.println(smartTV.toString());
                //Aqui está as opções de funções da TV:
                System.out.println("1. Mudar canal \n2. Mudar volume \n3. Desligar");
                int opcao2 = sc.nextInt();


                if (opcao2 == 1) {
                    //Mudar de Canal:
                    System.out.println("1. Canal especifico \n2. Aumentar canal \n3. Diminuir canal");
                    int escolhaCanal = sc.nextInt();
                    if (escolhaCanal == 1) {
                        System.out.println("Qual o canal?");
                        int mudarCanal = sc.nextInt();
                        smartTV.mudarCanal(mudarCanal);
                    } else if (escolhaCanal == 2) {
                        smartTV.aumentarCanal();
                    } else if (escolhaCanal == 3) {
                        smartTV.diminuirCanal();
                    }
                }

                else if (opcao2 == 2) {
                    //Mudar o volume:

                    System.out.println("Vai aumentar ou diminuir o volume? \n1. Aumentar o volume; \n2. Diminuir");
                    int mudarVolume = sc.nextInt();
                    if (mudarVolume == 1) {
                        smartTV.aumentarVolume();
                    } else if (mudarVolume == 2) {
                        smartTV.diminuirVolume();
                    }

                }
                else if (opcao2 == 3) {
                    smartTV.desligar();
                }
            }

        }

        System.out.println("A TV desligou.");

        sc.close();
    }
}