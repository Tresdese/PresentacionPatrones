package bridge;

import bridge.interfaz.DibujoImplementador;

public class Circulo extends Forma {
    private int x, y, radio;

    public Circulo(int x, int y, int radio, DibujoImplementador implementador) {
        super(implementador);
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        implementador.dibujarCirculo(x, y, radio);
    }
}