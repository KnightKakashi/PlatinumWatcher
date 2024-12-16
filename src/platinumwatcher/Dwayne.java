package platinumwatcher;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase que actúa como el modelo: almacena los datos de los juegos disponibles.
 */

public class Dwayne { // Dwayne = modelo
    private List<String> steam;
    
    /**
     * Constructor dew la clase.
    */
    
    
    public Dwayne() {
        steam = new ArrayList<>();
        GameInbound();
    }
    
    /**
     * Método para añadir unos juegos provisionales a la lista.
     */
    
    private void GameInbound(){
        steam.add("Dark Souls");
        steam.add("Bloodborne");
        steam.add("Sekiro: Shadows Die Twice");
        steam.add("Cyberpunk 2077");
        steam.add("DOOM");
    }

    /**
     * Método para conseguir la lista de la clase.
     * @return Lista de los juegos actual.
     */
    
    public List<String> getSteam() {
        return steam;
    }
    /**
     * Método para actualizar la lista de juegos.
     * 
     * @param juegos Nueva lista de juegos.
     */
    public void setSteam(List<String> juegos) {
        if (juegos != null) {
            steam = new ArrayList<>(juegos);
        }
    }
    
    
    /**
     * Añade un nuevo juego a la lista.
     * 
     * @param juego Nombre del juego a añadir.
    */
    public void CompreJuego(String juego) {
        steam.add(juego);
    }
    /**
     * Elimina un juego de la lista.
     * 
     * @param juego Nombre del juego a eliminar.
    */
    public void VendiJuego(String juego) {
        steam.remove(juego);
    }
    
    
}