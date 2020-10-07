package Ex2;

import java.util.Random;
import java.util.Scanner;

public class Dados {
    Random random = new Random();
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "valor=" + valor +
                '}';
    }

    public void tirar(){
        valor = random.nextInt(6);
    }




//    public static int dado1, dado2, dado3;
//    public static void start() {
//        Random random = new Random();
//        int valorDado = 6;
//
//        dado1 = random.nextInt(valorDado + 1);
//        System.out.println("Dado1: " + dado1);
//        dado2 = random.nextInt(valorDado + 1);
//        System.out.println("Dado2: " + dado2);
//        dado3 = random.nextInt(valorDado + 1);
//        System.out.println("Dado3: " + dado3);
//
//    }
}
