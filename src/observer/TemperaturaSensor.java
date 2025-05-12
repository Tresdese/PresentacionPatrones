package observer;

import java.util.ArrayList;
import java.util.List;

public class TemperaturaSensor {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void quitarObservador(Observador o) {
        observadores.remove(o);
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }
}
