package Ex2;

import java.util.Random;

public class Dados {
    Random random = new Random();
    protected int valor;

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

    public int tirar(){
        valor = random.nextInt(6);
        return valor;
    }
}
