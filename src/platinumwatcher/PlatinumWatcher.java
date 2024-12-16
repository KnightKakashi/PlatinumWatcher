package platinumwatcher;

import javax.swing.SwingUtilities;

/**
 * Clase principal que ejecuta la aplicación mostrando la pantalla de carga inicial 
 * y lanzando la ventana principal.
 */
public class PlatinumWatcher {
    /**
     * Método principal que arranca la aplicación.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dwayne modelo = new Dwayne();
            Bruce controlador = new Bruce(modelo);
            controlador.IniciameWey();
        });
    }
}
