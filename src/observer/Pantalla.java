package observer;

public class Pantalla implements Observador {
    @Override
    public void actualizar(float temperatura) {
        System.out.println("Pantalla: Temperatura actualizada a " + temperatura + "°C");
    }
}
