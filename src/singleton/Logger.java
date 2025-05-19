public class Logger {
    // Instancia única (privada y estática)
    private static Logger instanciaUnica;

    // Constructor privado para evitar instanciación externa
    private Logger() {
        System.out.println("Logger creado.\n");
    }

    // Método estático público para obtener la instancia única
    public static Logger getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Logger();
        }
        return instanciaUnica;
    }

    // Método de ejemplo
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}