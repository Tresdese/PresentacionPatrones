package bridge;

import bridge.interfaz.DibujoImplementador;

public class DibujoConsola implements DibujoImplementador {
    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        System.out.println("Dibujando círculo en consola en (" + x + ", " + y + ") con radio " + radio);
    }
}
