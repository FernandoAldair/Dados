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

            if (dado1.getValor() == dado2.getValor() & dado2.getValor() == dado3.getValor()){
                System.out.println("Has ganado!!");
                System.out.println("Que quieres hacer?");
                System.out.println("1: Tirar Dados");
                System.out.println("2: Salir");
                vic++;
            }
            else {
                System.out.println("Has perdido...");
                System.out.println("Que quieres hacer?");
                System.out.println("1: Tirar Dados");
                System.out.println("2: Salir");
                der++;
            }
            total++;
            opcionjuego = scanner.nextInt();
            System.out.println("--------------------------------");
        }
        System.out.println("Victorias: " + vic);
        System.out.println("Derrotas: " + der);
        System.out.println("Total jugado: " + total);
        System.out.println("--------------------------------");
        System.out.println("Que quieres hacer?");
        System.out.println("1: Seguir jugando");
        System.out.println("2: Salir al menu");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                jugar();
                break;
            case 2:
                Menu.start();
                break;
            default:
                System.out.println("Esta opcion no existe");
        }
    }

}
