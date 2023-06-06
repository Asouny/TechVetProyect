import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gdlup
 */
public class VentanaConsultorioCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaConsultorioCatalogo
     */
    public VentanaConsultorioCatalogo() {
        initComponents();
        m = (DefaultTableModel) tblConsultorios.getModel();
        leerConsultorios();
        id++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultorios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        tblConsultorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdConsultorio", "Capacidad", "Disponibilidad", "Equipo"
            }
        ));
        tblConsultorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultoriosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsultorios);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Catalogo de consultorios");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(btnOrdenar)
                            .addGap(7, 7, 7)
                            .addComponent(btnEliminar)
                            .addGap(17, 17, 17)
                            .addComponent(btnEditar))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOrdenar)
                        .addComponent(btnEliminar)
                        .addComponent(btnEditar))
                    .addGap(28, 28, 28)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int consultorioEDITPOS = buscaConsultorio(userSelectedID, Con);

        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(consultorioEDITPOS); // pos, pues es la posicion de la que se habla, se borra en la tabla
            eliminarCliente(consultorioEDITPOS);
            controlador.guardar("Consultorio", Con); //para guardarlo en el archivo
            //txtID.setText("");

            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtSearch.getText().equals("")) {
            leerConsultorios();
            return;
        } else {
            int id = Integer.parseInt(txtSearch.getText());

            int consultorioPOS = buscaConsultorio(id, Con);

            if (consultorioPOS == -1) {
                showMessageDialog(this, "Cliente no encontrado");

            } else {
                Consultorio consultorioEncontrado = Con[consultorioPOS];
                m.setRowCount(0);

                Object R[] = new Object[4];
                //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

                R[0] = consultorioEncontrado.getCons();
                R[1] = consultorioEncontrado.getCapacidad();
                R[2] = consultorioEncontrado.getDisponibilidad();
                R[3] = consultorioEncontrado.getEquipo();
                
                id = consultorioEncontrado.getCons();
                m.addRow(R);
                c++;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int consultorioEDITPOS = buscaConsultorio(userSelectedID, Con);

        VentanaConsultorioActualizar frame1 = new VentanaConsultorioActualizar(Con[consultorioEDITPOS]);

        frame1.setVisible(true);

        // Agregar un WindowListener a la ventana de actualización
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Código a ejecutar después de que se cierre la ventana
                System.out.println("La ventana se cerró. Ejecutando código...");
                // Aquí puedes colocar el código que deseas ejecutar

                Con[consultorioEDITPOS] = frame1.Con;
                controlador.guardar("Consultorios", Con);
                leerConsultorios();
            }
        });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        //ordenaNombre();
        //llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void tblConsultoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultoriosMouseClicked
        userSelectedID = obtenerIdConsultorioSeleccionado();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblConsultoriosMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (txtSearch.getText().equals("")) {
            leerConsultorios();
            return;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if (txtSearch.getText().equals("")) {
            leerConsultorios();
            return;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

     private void tblConsultorioMouseClicked(java.awt.event.MouseEvent evt) {                                         
        userSelectedID = obtenerIdConsultorioSeleccionado();
     }
     


    private void leerConsultorios() {
            
            Con = (Consultorio[]) controlador.leer("Consultorios", Consultorio.class);
            Object R[] = new Object[4];
            m.setRowCount(0);

            //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa 
            for (int i = 0; i < Con.length; i++) {
                if (Con[i] == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                R[0] = Con[i].getCons();
                R[1] = Con[i].getCapacidad();
                R[2] = Con[i].getDisponibilidad();
                R[3] = Con[i].getEquipo();
                id = Con[i].getCons();
                m.addRow(R);
                c++;
            }
        
    }

    public int buscaConsultorio(int ca, Consultorio C[]) {
        for (int i = 0; i < C.length; i++) {
            if(C[i] == null){
                return -1;
            }
            if (ca == Con[i].getCons()) {
                if(Con[i] == null){
                    return -1;
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró
    }

    private int obtenerIdConsultorioSeleccionado() {
        // Obtener el índice de la fila seleccionada en la tabla
        int rowIndex = tblConsultorios.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (rowIndex != -1) {
            // Obtener el valor del ID del cliente en la columna 0 (primera columna)
            int idConsultorio = (int) tblConsultorios.getValueAt(rowIndex, 0);

            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            // retornar el ID del cliente en un mensaje
            return idConsultorio;
        } else {
            return -1;
        }
    }
    public void eliminarCliente(int posicion) {

        // Copiar los elementos antes de la posición
        System.arraycopy(Con, 0, Con, 0, posicion);

        // Copiar los elementos después de la posición
        System.arraycopy(Con, posicion + 1, Con, posicion, Con.length - posicion - 1);

        // Asignar null al último elemento
        Con[Con.length - 1] = null;

    }
    
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
            java.util.logging.Logger.getLogger(VentanaConsultorioCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultorioCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultorioCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultorioCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultorioCatalogo().setVisible(true);
            }
        });
    }
    private Consultorio Con[] = new Consultorio[30];
    private int consul, capac, c;
    private String eq, dispon;
    private int pos = -1;
    private String name, sex;
    private DefaultTableModel m;
    private int id;
private int userSelectedID;

Controller controlador = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblConsultorios;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
