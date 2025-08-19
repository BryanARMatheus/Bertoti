package Antipadrão;

public class TiroForte extends Tiro {

    @Override
    public double calcVelocidade() {
        return this.tamanho * 0.4;
    }
}
