// Alumno: Bruno Levi Velázquez Sánchez
// Grupo: DS-DPO3-2002-B2-002
// Semestre: 2002-B2
// Fecha: jueves, 24 de septiembre de 2020
// Docente: Gabriel Enríquez Peña

package nomina;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarArchivoFileChooser = new javax.swing.JFileChooser();
        buscarArchivoPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nombreEmpleadoLabel = new javax.swing.JLabel();
        nombreEmpleadoField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        noEmpleadoLabel = new javax.swing.JLabel();
        noEmpleadoField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        rfcEmpleadoLabel = new javax.swing.JLabel();
        rfcEmpleadoField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        buscarArchivoBtn = new javax.swing.JButton();
        guardarArchivoBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        buscarArchivoFileChooser.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos empleado"));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        nombreEmpleadoLabel.setText("Nombre del empleado");
        jPanel2.add(nombreEmpleadoLabel);

        nombreEmpleadoField.setColumns(15);
        nombreEmpleadoField.setToolTipText("");
        nombreEmpleadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nombreEmpleadoField);

        jPanel1.add(jPanel2);
        jPanel1.add(jSeparator2);

        noEmpleadoLabel.setText("No. de empleado");
        jPanel3.add(noEmpleadoLabel);

        noEmpleadoField.setColumns(15);
        jPanel3.add(noEmpleadoField);

        jPanel1.add(jPanel3);
        jPanel1.add(jSeparator3);

        rfcEmpleadoLabel.setText("R.F.C. de empleado");
        jPanel4.add(rfcEmpleadoLabel);

        rfcEmpleadoField.setColumns(15);
        jPanel4.add(rfcEmpleadoField);

        jPanel1.add(jPanel4);
        jPanel1.add(jSeparator4);

        buscarArchivoBtn.setText("Buscar archivo");
        buscarArchivoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarArchivoBtnActionPerformed(evt);
            }
        });
        jPanel5.add(buscarArchivoBtn);

        guardarArchivoBtn.setText("Guardar archivo");
        guardarArchivoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoBtnActionPerformed(evt);
            }
        });
        jPanel5.add(guardarArchivoBtn);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem1.setText("Abrir archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEmpleadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoFieldActionPerformed

    private void guardarArchivoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoBtnActionPerformed
        // TODO add your handling code here:
        
        // Se crea la variable file que va a crear un archivo a través de streams
        FileOutputStream file;
        try {
            
            // Se hace una instancia de la clase FileOutputStream con el No. De empleado como nombre de archivo
            file = new FileOutputStream(noEmpleadoField.getText() + ".empleado");
            
            // Se crea la variable que va a construir el texto dentro del archivo
            String texto = nombreEmpleadoField.getText() + "|" + noEmpleadoField.getText() + "|" + rfcEmpleadoField.getText();
            
            // Se pasa el texto a un arreglo de bytes
            byte b[] = texto.getBytes();

            // Se escribe el archivo con el arreglo de bytes
            file.write(b);
            
            // Se cierra el stream
            file.close();
            
            // Se limpian los campos
            nombreEmpleadoField.setText("");
            noEmpleadoField.setText("");
            rfcEmpleadoField.setText("");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarArchivoBtnActionPerformed

    private void buscarArchivoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarArchivoBtnActionPerformed
        // TODO add your handling code here:
        
        // Mostrar diálogo de buscador de archivos
        buscarArchivoFileChooser.showDialog(buscarArchivoPanel, "Abrir");
        
        // Instanciar el buffered reader para pasar acentos y lineas de texto
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(buscarArchivoFileChooser.getSelectedFile()), StandardCharsets.UTF_8));) {
            
            // Se lee la linea de texto y se separa en un arreglo
            String line = reader.readLine();
            String[] datos = line.split("\\|");
            
            // Se instancia un objeto de empleado
            Empleado empleado = new Empleado(datos[0], datos[1], datos[2]);
            
            // Se llenan los campos del formulario
            nombreEmpleadoField.setText(empleado.getNombre());
            noEmpleadoField.setText(empleado.getId());
            rfcEmpleadoField.setText(empleado.getRfc());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarArchivoBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        // Mostrar diálogo de buscador de archivos
        buscarArchivoFileChooser.showDialog(buscarArchivoPanel, "Abrir");
        
        // Instanciar el buffered reader para pasar acentos y lineas de texto
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(buscarArchivoFileChooser.getSelectedFile()), StandardCharsets.UTF_8));) {
            
            // Se lee la linea de texto y se separa en un arreglo
            String line = reader.readLine();
            String[] datos = line.split("\\|");
            
            // Se instancia un objeto de empleado
            Empleado empleado = new Empleado(datos[0], datos[1], datos[2]);
            
            // Se llenan los campos del formulario
            nombreEmpleadoField.setText(empleado.getNombre());
            noEmpleadoField.setText(empleado.getId());
            rfcEmpleadoField.setText(empleado.getRfc());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
                // Se crea la variable file que va a crear un archivo a través de streams
        FileOutputStream file;
        try {
            
            // Se hace una instancia de la clase FileOutputStream con el No. De empleado como nombre de archivo
            file = new FileOutputStream(noEmpleadoField.getText() + ".empleado");
            
            // Se crea la variable que va a construir el texto dentro del archivo
            String texto = nombreEmpleadoField.getText() + "|" + noEmpleadoField.getText() + "|" + rfcEmpleadoField.getText();
            
            // Se pasa el texto a un arreglo de bytes
            byte b[] = texto.getBytes();

            // Se escribe el archivo con el arreglo de bytes
            file.write(b);
            
            // Se cierra el stream
            file.close();
            
            // Se limpian los campos
            nombreEmpleadoField.setText("");
            noEmpleadoField.setText("");
            rfcEmpleadoField.setText("");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarArchivoBtn;
    private javax.swing.JFileChooser buscarArchivoFileChooser;
    private javax.swing.JPanel buscarArchivoPanel;
    private javax.swing.JButton guardarArchivoBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField noEmpleadoField;
    private javax.swing.JLabel noEmpleadoLabel;
    private javax.swing.JTextField nombreEmpleadoField;
    private javax.swing.JLabel nombreEmpleadoLabel;
    private javax.swing.JTextField rfcEmpleadoField;
    private javax.swing.JLabel rfcEmpleadoLabel;
    // End of variables declaration//GEN-END:variables
}