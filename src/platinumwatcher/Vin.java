package platinumwatcher;

import javax.swing.*;
import java.awt.*;


/**
 * Clase que representa la pantalla de carga inicial.
 */
public class Vin extends JWindow {
    private final int durationeee = 3000;
    /**
     * Constructor de clase. Crea una ventana con la imagen de carga.
     */
    public Vin() {
        JLabel cargamela = new JLabel(new ImageIcon(getClass().getResource("/platinumwatcher/image.gif")));
        getContentPane().add(cargamela, BorderLayout.CENTER);
        setSize(600,400);
        setLocationRelativeTo(null);
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1179, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
     * Método que simula la carga y luego ejecuta la acción indicada.
     * 
     * @param onFinish Acción a ejecutar una vez que termine la pantalla de carga.
     */
    public void Cargandooo(Runnable onFinish) {
        if (!isVisible()) {
        setVisible(true);
        }
        
        new Timer(durationeee, e -> {
          setVisible(false);
          dispose();
          onFinish.run();
        }).start();
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
