package Antipadrão;

abstract class Tiro {
    protected double tamanho;

    public double calcVelocidade() {
        return this.tamanho * 0.8;
    }
}
