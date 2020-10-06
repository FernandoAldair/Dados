package Ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dado1;
        int dado2;
        int valordado = 7;
        int[] valortotal = new int[12];

        System.out.println("Cuantas veces quieres tirar los dados?");
        int tiradas = scanner.nextInt();

        for (int i = 0; i < tiradas; i++) {
            dado1 = random.nextInt(valordado);
            dado2 = random.nextInt(valordado);
            if (dado1 + dado2 == 2) {
                valortotal[1]++;
            } else if (dado1 + dado2 == 3) {
                valortotal[2]++;
            } else if (dado1 + dado2 == 4) {
                valortotal[3]++;
            } else if (dado1 + dado2 == 5) {
                valortotal[4]++;
            } else if (dado1 + dado2 == 6) {
                valortotal[5]++;
            } else if (dado1 + dado2 == 7) {
                valortotal[6]++;
            } else if (dado1 + dado2 == 8) {
                valortotal[7]++;
            } else if (dado1 + dado2 == 9) {
                valortotal[8]++;
            } else if (dado1 + dado2 == 10) {
                valortotal[9]++;
            } else if (dado1 + dado2 == 11) {
                valortotal[10]++;
            } else if (dado1 + dado2 == 12) {
                valortotal[11]++;
            }
        }
        for (int j = 1; j < 12; j++) {
            if (valortotal[j]>0){
                System.out.println("El valor " + (j+1) + " ha salido " + valortotal[j]);
            }
        }
    }
}

