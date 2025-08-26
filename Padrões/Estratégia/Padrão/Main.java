package Estratégia.Padrão;

public class Main {
    public static void main(String[] args) {
        Tiro tiro1 = new Tiro();

        tiro1.setTipo(new Fraco());
        System.out.println(tiro1.conseguirVelocidade());
        tiro1.setTipo(new Forte());
        System.out.println(tiro1.conseguirVelocidade());

    }
}
