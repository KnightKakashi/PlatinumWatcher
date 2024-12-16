package platinumwatcher;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Controlador de la aplicación. Maneja la interacción entre el modelo y la vista.
 * @implements ActionListner para usar las escuchas.
 */
public class Bruce implements ActionListener {
    private Dwayne roca;  
    private Vin familia;  
    private VinPrincipal diesel;
    private Configurativo configurativo;

    /**
     * Constructor de la clase. Inicializa el controlador.
     * 
     * @param roca Instancia del modelo.
     */
    public Bruce(Dwayne roca) {
        this.roca = roca;
        this.familia = new Vin(); 
    }

    /**
     * Método que inicializa la aplicación mostrando la pantalla de carga y luego la ventana principal.
     */
    public void IniciameWey() {
       List<String> biblioteca = roca.getSteam();
       diesel = new VinPrincipal(biblioteca); 
       configurativo = new Configurativo(diesel,roca.getSteam());
       if(!diesel.isVisible()){ 
        familia.Cargandooo(() -> {
            diesel.setVisible(true);  
        });
        
        diesel.configurarListeners(this);
        configurativo.EscuchameRey(this); 
        
       }
    }
    
    /**
     * Maneja los eventos generados por los botones de la interfaz.
     * 
     * @param e Evento generado por un componente.
    */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "INSERTAR":
                System.out.println("Botón insertar presionado");
                break;
            case "ACCEDER":
                diesel.mostrarMenuContextual();
                System.out.println("Botón acceder presionado");
                break;
            case "Configuración":
                System.out.println("Botón configuración presionado");
                configurativo.mostrarDialogo();
                break;
            case "Cambia tu estilo":
                System.out.println("Cambio de estilo solcitiado");
                Color nuevin = JColorChooser.showDialog(diesel, "Elige un color de fondo", diesel.getBackground());
                diesel.Camaleon(nuevin);
                break;
            case "Test":
                System.out.println("Has hecho un test.");
                break;
            case "Cerrar":
                if (configurativo != null){
                    configurativo.dispose();
                    System.out.println("Se ha cerrado la configuración.");
                }
                break;
            default:
                break;
        }
    }
     /**
     * Abre el diálogo de configuración.
     */
    public void abrirDialogoConfiguracion() {
       
        configurativo.actualizar(roca.getSteam());
        configurativo.setVisible(true);
    }
}
    
    

