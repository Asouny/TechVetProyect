
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author gdlup
 */
public class VentanaDiagnosticoCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaDiagnosticoCatalogo
     */
    public VentanaDiagnosticoCatalogo() {
        initComponents();
        m = (DefaultTableModel) tblDiagnosticos.getModel();
        leerDiagnosticos();
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiagnosticos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDiagnosticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdMascota", "Descripción", "Fecha"
            }
        ));
        tblDiagnosticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiagnosticosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiagnosticos);

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

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

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Catalogo de diagnósticos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscar1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int diagnosticoEDITPOS = buscaDiagnostico(userSelectedID, D);
        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(diagnosticoEDITPOS); // pos, pues es la posicion de la que se habla, se borra en la tabla
            eliminarDiagnostico(diagnosticoEDITPOS);

            guardarArray(); //para guardarlo en el archivo

            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int diagnosticoEDITPOS = buscaDiagnostico(userSelectedID, D);

        VentanaDiagnosticoActualizar frame1 = new VentanaDiagnosticoActualizar(D[diagnosticoEDITPOS]);

        frame1.setVisible(true);

        // Agregar un WindowListener a la ventana de actualización
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Código a ejecutar después de que se cierre la ventana
                System.out.println("La ventana se cerró. Ejecutando código...");
                // Aquí puedes colocar el código que deseas ejecutar

                D[diagnosticoEDITPOS] = frame1.D;
                guardarArray();
                leerDiagnosticos();
            }
        });


    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (txtSearch.getText().equals("")) {
            leerDiagnosticos();
            return;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if (txtSearch.getText().equals("")) {
            leerDiagnosticos();
            return;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        if (txtSearch.getText().equals("")) {
            leerDiagnosticos();
            return;
        } else {
            int id = Integer.parseInt(txtSearch.getText());

            int diagnosticoPOS = buscaDiagnostico(id, D);

            if (diagnosticoPOS == -1) {
                showMessageDialog(this, "Diagnostico no encontrado");

            } else {
                Diagnostico diagnosticoEncontrado = D[diagnosticoPOS];
                m.setRowCount(0);

                Object R[] = new Object[3];
                //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

                R[0] = diagnosticoEncontrado.getId();
                R[1] = diagnosticoEncontrado.getDescripcion();
                R[2] = diagnosticoEncontrado.getFecha();

                id = diagnosticoEncontrado.getId();
                m.addRow(R);
                d++;
            }
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void tblDiagnosticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosticosMouseClicked
        userSelectedID = obtenerIdDiagnosticoSeleccionado();
    }//GEN-LAST:event_tblDiagnosticosMouseClicked

    private void guardarArray() {

        try {
            //se abre el flujo y se manda el metodo para guardar
            FileOutputStream flujoBytes = new FileOutputStream("Diagnosticos.obj");
            fcs = new ObjectOutputStream(flujoBytes);
            fcs.writeObject(D);
            fcs.flush();
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        }

    }

    private void leerDiagnosticos() {
        try {
            FileInputStream flujoBytes = new FileInputStream("Diagnosticos.obj"); //flujo de Bytes
            fce = new ObjectInputStream(flujoBytes); //flujo de objetos
            D = (Diagnostico[]) fce.readObject();
            Object R[] = new Object[3];
            m.setRowCount(0);

            //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo
            for (int i = 0; i < D.length; i++) {
                if (D[i] == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }

                R[0] = D[i].getMascota();
                R[1] = D[i].getDescripcion();
                R[2] = D[i].getFecha();

                id = D[i].getId();
                m.addRow(R);
                d++;
            }

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error el archivo no se encontro");
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(this, "Error");
        }
    }

    public int buscaDiagnostico(int ca, Diagnostico A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                return -1;
            }
            if (ca == D[i].getId()) {
                if (D[i] == null) {
                    return -1; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró

    }

    private int obtenerIdDiagnosticoSeleccionado() {
        // Obtener el índice de la fila seleccionada en la tabla
        int rowIndex = tblDiagnosticos.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (rowIndex != -1) {
            // Obtener el valor del ID del cliente en la columna 0 (primera columna)
            int idDiagnostico = (int) tblDiagnosticos.getValueAt(rowIndex, 0);

            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            // retornar el ID del cliente en un mensaje
            return idDiagnostico;
        } else {
            return -1;
        }
    }

    public void eliminarDiagnostico(int posicion) {

        // Copiar los elementos antes de la posición
        System.arraycopy(D, 0, D, 0, posicion);

        // Copiar los elementos después de la posición
        System.arraycopy(D, posicion + 1, D, posicion, D.length - posicion - 1);

        // Asignar null al último elemento
        D[D.length - 1] = null;

    }

    public int buscaMascota(int ca, Mascota A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                if (ca == A[i].getId()) {
                    if (A[i] == null) {
                        return -1; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                    }
                    return i; //Return el arreglo en esa posición
                }//Para que compare id (parámetro) con id del arreglo
            }
        }
        return -1; //Por si no los encontró
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
            java.util.logging.Logger.getLogger(VentanaDiagnosticoCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDiagnosticoCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDiagnosticoCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDiagnosticoCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDiagnosticoCatalogo().setVisible(true);
            }
        });
    }

    private Diagnostico D[] = new Diagnostico[30];
    private DefaultTableModel m;
    private int id, d;
    private int pos = -1;
    private int userSelectedID;
    //nuevos agregados con lo de archivos
    private ObjectOutputStream fcs; // flujo de objetos de escritura
    private ObjectInputStream fce;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDiagnosticos;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
