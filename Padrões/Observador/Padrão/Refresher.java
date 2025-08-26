package Observador.Padrão;

import java.util.LinkedList;
import java.util.List;

public class Refresher {
    private int newX;
    private int newY;

    List<Observer> observers = new LinkedList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void updateAllPositions(int newX, int newY) {
        for (Observer o : observers) {
            o.updatePosition(newX, newY);
        }
    }

    public int getNewY() {
        return newY;
    }

    public int getNewX() {
        return newX;
    }
}
