package observer;

public class Alarma implements Observador {
    @Override
    public void actualizar(float temperatura) {
        if (temperatura > 30) {
            System.out.println("Alarma: ¡Temperatura alta! (" + temperatura + "°C)");
        }
    }
}
