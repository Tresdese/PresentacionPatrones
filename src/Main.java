import bridge.Circulo;
import bridge.DibujoConsola;
import bridge.interfaz.DibujoImplementador;
import bridge.Forma;

import observer.Alarma;
import observer.Pantalla;
import observer.TemperaturaSensor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------Observer--------------------------------\n\n");
        TemperaturaSensor sensor = new TemperaturaSensor();

        Pantalla pantalla = new Pantalla();
        Alarma alarma = new Alarma();

        sensor.agregarObservador(pantalla);
        sensor.agregarObservador(alarma);

        sensor.setTemperatura(25.0f);
        sensor.setTemperatura(32.5f);

        System.out.println("\n\n--------------------------------Singleton--------------------------------\n\n");

        // Obtener la instancia única del Logger
        Logger log1 = Logger.getInstancia();
        log1.log("Primer mensaje");

        // Obtener la misma instancia desde otro punto
        Logger log2 = Logger.getInstancia();
        log2.log("Segundo mensaje");

        // Verificar que ambas variables apuntan al mismo objeto
        if (log1 == log2) {
            System.out.println("Ambos loggers son la misma instancia.");
        } else {
            System.out.println("ERROR: Son instancias diferentes.");
        }

        System.out.println("\n\n--------------------------------Bridge--------------------------------\n\n");

        // Creamos el implementador (consola)
        DibujoImplementador consola = new DibujoConsola();

        // Creamos una forma usando esa implementación
        Forma circulo = new Circulo(10, 20, 5, consola);

        // Dibujamos
        circulo.dibujar();
    }
}