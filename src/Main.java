import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dado1;
        int dado2;
        int valordado = 6;
        int[] valortotal = new int[11];

        System.out.println("Cuantas veces quieres tirar los dados?");
        int tiradas = scanner.nextInt();

        for (int i = 0; i <= tiradas ; i++) {
            dado1 = random.nextInt(valordado);
            dado2 = random.nextInt(valordado);
            for (int j = 0; j <= tiradas ; j++) {
                switch (dado1+dado2){

                    case 2:
                        valortotal[j]++;
                        break;
                    case 3:
                        valortotal[j]++;
                        break;
                    case 4:
                        valortotal[j]++;
                        break;
                    case 5:
                        valortotal[j]++;
                        break;
                    case 6:
                        valortotal[j]++;
                        break;
                    case 7:
                        valortotal[j]++;
                        break;
                    case 8:
                        valortotal[j]++;
                        break;
                    case 9:
                        valortotal[j]++;
                        break;
                    case 10:
                        valortotal[j]++;
                        break;
                    case 11:
                        valortotal[j]++;
                        break;
                    case 12:
                        valortotal[j]++;
                        break;
                }
            }

        }
        for (int i = 0; i <= 11 ; i++) {
            if (valortotal[i]>=1){
                System.out.println("El valor" + i + "ha salido" + valortotal[i]);
            }

        }
    }
}
