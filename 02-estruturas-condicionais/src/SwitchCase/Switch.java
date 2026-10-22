package SwitchCase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int plano;

     for (int i = 0;i != 1;){
         System.out.println("Escolha o seu plano de internet: \n1. Basic \n2. Pro \n3. Pro Max  \n4. Sair   ");
            plano = sc.nextInt();
            switch (plano) {
                case 1:
                    System.out.println("20G B + Whatsapp ilimitado! 45R$");
                    break;
                case 2:
                    System.out.println("30 GB + Whatsapp ilimitado + TikTok ilimitado! 60R$");
                    break;
                case 3:
                    System.out.println("50 GB + Whatsapp ilimitado + TikTok ilimitado + Youtube ilimitado + Acesso a Netflix! 85R$ ");
                    break;
                    case 4:
                        System.out.println("Você saiu da tela!");
                        i = 1;
                        break;
                default:
                    System.out.println("Não existe essa opção!");
                    break;
            }
         System.out.print("\n\n");
        }
    }
}
