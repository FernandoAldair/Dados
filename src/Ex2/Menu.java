package Ex2;

import java.util.Scanner;

public class Menu {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A que quieres jugar? :)");
        System.out.println("1: Daus");
        System.out.println("2: Parxis");
        System.out.println("3: Tic tac toe");
        System.out.println("4: ...");
        int resultado = scanner.nextInt();

        if (resultado == 1){
            Dados.start();
        }
        else if (resultado == 2){

        }
        else if (resultado == 3){

        }
    }
}
