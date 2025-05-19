package bridge;

import bridge.interfaz.DibujoImplementador;

public abstract class Forma {
    protected DibujoImplementador implementador;

    public Forma(DibujoImplementador implementador) {
        this.implementador = implementador;
    }

    public abstract void dibujar();
}
