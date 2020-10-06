package Ex2;

import java.util.Random;
import java.util.Scanner;

public class JocDaus {

    public static void start() {
        int cantidadDados = 3;

        Dados[] dado = new Dados[cantidadDados];

        dado[0] = new Dados();
        dado[1] = new Dados();
        dado[2] = new Dados();

        dado[0].tirar();
        dado[1].tirar();
        dado[2].tirar();









//        Scanner scanner = new Scanner(System.in);
//
//        int valor;
//
//        System.out.println("Si los dados tienen el mismo valor ganas, que quieres hacer?");
//        System.out.println("1: Tirar dados");
//        System.out.println("2: Salir");
//        int opcion = scanner.nextInt();
//        int vic = 0;
//        int der = 0;
//
//       while (opcion == 1){
//            Dados.start();
//            if (Dados.dado1 == Dados.dado2 & Dados.dado2 == Dados.dado3){
//                System.out.println("Has ganado!!");
//                System.out.println("Que quieres hacer?");
//                System.out.println("1: Tirar Dados");
//                System.out.println("2: Salir");
//                vic++;
//                opcion = scanner.nextInt();
//                System.out.println("--------------------------------");
//            }
//            else {
//                System.out.println("Has perdido...");
//                System.out.println("Que quieres hacer?");
//                System.out.println("1: Tirar Dados");
//                System.out.println("2: Salir");
//                der++;
//                opcion = scanner.nextInt();
//                System.out.println("--------------------------------");
//            }
//        }
//                  System.out.println("Victorias: " + vic);
//
//        System.out.println("Derrotas: " + der);
   }
}
