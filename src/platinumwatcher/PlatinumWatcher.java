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
        Dwayne johnson = new Dwayne();
        Vin diesel = new Vin();
        Bruce willis = new Bruce(johnson, diesel);
        System.out.println("Furula perfectamente");
    }
    
}
