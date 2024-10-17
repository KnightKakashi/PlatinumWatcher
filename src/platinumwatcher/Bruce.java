/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platinumwatcher;

/**
 *
 * @author CHUSO
 */
public class Bruce { // Controlador
    
    private Dwayne model;
    private Vin view;

    
    public Bruce(Dwayne model, Vin view) {
        this.model = model;
        this.view = view;
        view.CambioLabel(model.getMsg());
        view.setVisible(true);
        view.setTitle("PlatinumWatcher");
    }
        
}
