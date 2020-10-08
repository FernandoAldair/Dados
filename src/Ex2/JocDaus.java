package Ex2;

import java.util.Random;
import java.util.Scanner;

public class JocDaus{
    Scanner scanner = new Scanner(System.in);
    
    Dados dado1,dado2,dado3;
    
    private int vic = 0;
    private int der = 0;
    private int total = 0;
    
    public JocDaus(){
        this.dado1 = new Dados();
        this.dado2 = new Dados();
        this.dado3 = new Dados();
    }
    
    public void jugar(){
        int opcionjuego = 1;
        System.out.println("Que quieres hacer?");
        System.out.println("1: Tirar Dados");
        System.out.println("2: Salir");
        opcionjuego = scanner.nextInt();

        while (opcionjuego == 1){
            dado1.setValor(dado1.tirar());
            System.out.println("dado1: " + dado1);
            dado2.setValor(dado2.tirar());
            System.out.println("dado2: " + dado2);
            dado3.setValor(dado3.tirar());
            System.out.println("dado3: " + dado3);

            if (dado1 == dado2 & dado2 == dado3){
                System.out.println("Has ganado!!");
                System.out.println("Que quieres hacer?");
                System.out.println("1: Tirar Dados");
                System.out.println("2: Salir");
                vic++;
                total++;
                opcionjuego = scanner.nextInt();
                System.out.println("--------------------------------");
            }
            else {
                System.out.println("Has perdido...");
                System.out.println("Que quieres hacer?");
                System.out.println("1: Tirar Dados");
                System.out.println("2: Salir");
                der++;
                total++;
                opcionjuego = scanner.nextInt();
                System.out.println("--------------------------------");
            }
        }
        System.out.println("Victorias: " + vic);
        System.out.println("Derrotas: " + der);
        System.out.println("Total jugado: " + total);

        
    }
    
//    public static void start() {
//
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
//   }
}
