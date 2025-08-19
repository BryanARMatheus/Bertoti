package Antipadrão;

public class TiroFraco extends Tiro {

    @Override
    public double calcVelocidade() {
        return this.tamanho * 1.4;
    }
}
