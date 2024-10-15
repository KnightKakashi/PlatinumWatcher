/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package platinumwatcher;

/**
 *
 * @author CHUSO
 */
public class PlatinumWatcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dwayne m = new Dwayne();
        Vin v = new Vin();
        Bruce c = new Bruce(m, v);
    }
    
}
