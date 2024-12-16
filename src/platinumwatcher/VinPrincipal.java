package platinumwatcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.Color;

/**
 * Clase que representa la ventana principal de la aplicación.
 */

public class VinPrincipal extends JFrame {
    private JPopupMenu OstiaMenu;
    private JButton inserteame;
    private JButton accesion;
    private  JMenuItem configOption = new JMenuItem("Configuración");
    private  JMenuItem testOption = new JMenuItem("Test");
    private JPanel panelBotonera;
    /**
     * Constructor de la clase. Crea la ventana principal con botones funcionales.
     * 
     * @param biblioteca Lista de juegos que se van a mostrar en la aplicación.
    */
    public VinPrincipal(List<String> biblioteca) {
        setTitle("PlatinumWatcher");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(true);
        setBackground(new Color (70,130,180));
        inserteame = new JButton("INSERTAR");
        accesion = new JButton("ACCEDER");
        
        
        panelBotonera = new JPanel();
        panelBotonera.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelBotonera.add(inserteame, gbc);
        panelBotonera.setBackground(new Color (70,130,180));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelBotonera.add(accesion, gbc);
        add(panelBotonera, BorderLayout.CENTER);
    }
    
     /**
      * Configura los listeners de los botones desde el controlador.
      * 
      * @param escuchache Listener usado parael controlador
     */
     public void configurarListeners(ActionListener escuchache) {
        inserteame.addActionListener(escuchache);
        accesion.addActionListener(escuchache);
        configOption.addActionListener(escuchache);
        testOption.addActionListener(escuchache);
    }

     /**
     * Muestra el menú contextual.
     */
     public void mostrarMenuContextual() {
        OstiaMenu = new JPopupMenu();
        OstiaMenu.add(configOption);
        OstiaMenu.add(testOption);
        OstiaMenu.show(this, 400, 300); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void Camaleon(Color color) {
        panelBotonera.setBackground(color);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
