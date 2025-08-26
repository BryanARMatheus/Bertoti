package Observador.Antipadrão;

public class Main {
    public static void main(String[] args) {
        Refresher refresher = new Refresher();
        Circle circle = new Circle();
        Square square = new Square();

        circle.updatePosition(refresher.getNewX(), refresher.getNewY());
        square.updatePosition(refresher.getNewX(), refresher.getNewY());

    }
}
