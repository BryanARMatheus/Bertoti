package Estratégia.Padrão;

public class Tiro {
    Tipo tipo;

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double conseguirVelocidade() {
        return tipo.calcVelocidade();
    }
}
