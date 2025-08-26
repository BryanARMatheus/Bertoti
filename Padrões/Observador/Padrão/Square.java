package Observador.Padrão;

public class Square implements Observer {
    private int y;
    private int x;

    public void updatePosition(int x, int y){
        this.x = x;
        this.y = y;
    }

}
