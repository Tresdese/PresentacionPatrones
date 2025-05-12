import observer.Alarma;
import observer.Pantalla;
import observer.TemperaturaSensor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TemperaturaSensor sensor = new TemperaturaSensor();

        Pantalla pantalla = new Pantalla();
        Alarma alarma = new Alarma();

        sensor.agregarObservador(pantalla);
        sensor.agregarObservador(alarma);

        sensor.setTemperatura(25.0f);
        sensor.setTemperatura(32.5f);
    }
}