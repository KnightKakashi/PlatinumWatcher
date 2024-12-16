
package platinumwatcher;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;


/**
 * Clase que representa un diálogo de configuración.
 */
public class Configurativo extends JDialog {
    private JList<String> Listajuegos;
    private JButton cambialook;
    private JButton cerraloWey;
    
    
    /**
     * Constructor de la clase. Inicializa el diálogo con sus componentes.
     * 
     * @param parent JFrame principal que actúa como padre del diálogo.
     */
    public Configurativo(JFrame padre, List<String> juegos) {
        super(padre, "Configuración", true);
        setLayout(new BorderLayout());
        setSize(400,200);
        setLocationRelativeTo(padre);
        JLabel jueginlabelin = new JLabel("Juegos disponibles:");
        jueginlabelin.setHorizontalAlignment(SwingConstants.CENTER);
        add(jueginlabelin, BorderLayout.NORTH);
        
        Listajuegos = new JList<>(juegos.toArray(new String[0]));
        Listajuegos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(Listajuegos), BorderLayout.CENTER);
        
        JPanel panelboton = new JPanel();
        cambialook = new JButton("Cambia tu estilo");
        cerraloWey = new JButton ("Cerrar");
        panelboton.add(cambialook);
        panelboton.add(cerraloWey);
        add(panelboton, BorderLayout.SOUTH);
        
        
        
        setResizable(false);
        
        
    }

    /**
     * Añade un ActionListener a los botones del diálogo.
     * 
     * @param listener Listener que manejará los eventos de los botones.
    */

    public void EscuchameRey(ActionListener escucha) {
        cambialook.addActionListener(escucha);
        cerraloWey.addActionListener(escucha);
    }
    
    public String getJuegoSeleccionado(){
        return Listajuegos.getSelectedValue();
    }
    
    public void actualizar(List<String> juegos) {
        if (juegos == null) {
            throw new IllegalArgumentException("La lista de juegos no puede ser null.");
        }
        Listajuegos.setListData(juegos.toArray(new String[0]));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
    
    public void mostrarDialogo() {
        setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
