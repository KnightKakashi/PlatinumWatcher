package platinumwatcher;

/**
 *
 * @author KnightKakashi
 */
public class PlatinumWatcher {

    /**
     * @param args el Array de <b>Strings</b> que captura el programa. 
     */
    public static void main(String[] args) {    
        Dwayne m = new Dwayne();
        Vin v = new Vin();
        Bruce c = new Bruce(m, v);
        
    }
    
}
