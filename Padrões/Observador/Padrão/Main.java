package Observador.Padrão;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Refresher refresher = new Refresher();
        Circle circle = new Circle();
        Square square = new Square();

        refresher.addObserver(circle);
        refresher.addObserver(square);

        refresher.updateAllPositions(refresher.getNewX(),  refresher.getNewY());

    }
}
