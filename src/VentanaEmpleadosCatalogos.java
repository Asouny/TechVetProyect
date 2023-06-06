
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author orozc
 */
public class VentanaEmpleadosCatalogos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpleados
     */
    public VentanaEmpleadosCatalogos() {
        initComponents();
        m = (DefaultTableModel) tblEmpleados.getModel();
        leerEmpleados();
    }

    private void leerEmpleados() {

        E = (Empleado[]) controlador.leer("Empleados", Empleado.class);
        Object R[] = new Object[6];
        m.setRowCount(0);

        for (int i = 0; i < E.length; i++) {
            if (E[i] == null) {
                return;
            }
            R[0] = E[i].getID();
            R[1] = E[i].getNombre();
            R[2] = E[i].getEdad();
            R[3] = E[i].getSexo();
            R[4] = E[i].getPuesto();
            R[5] = E[i].getSueldo();
            m.addRow(R);
            e++;
        }

    }

    public int buscarEmpleado(int id, Empleado E[]) {
        for (int i = 0; i < e; i++) {
            if (id == E[i].getID()) {
                return i;
            }
        }
        return -1;
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
        tblEmpleados = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Sexo", "Puesto", "Sueldo"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Catalogo de Empleados");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenar)
                        .addGap(13, 13, 13))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnOrdenar)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtSearch.getText().equals("")) {
            leerEmpleados();
            return;
        } else {
            int id = Integer.parseInt(txtSearch.getText());

            int empleadoPOS = buscaEmpleados(id, E);

            if (empleadoPOS == -1) {
                showMessageDialog(this, "Empleado no encontrado");

            } else {
                Empleado EmpleadoEncontrado = E[empleadoPOS];
                m.setRowCount(0);

                Object R[] = new Object[6];
                //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

                R[0] = EmpleadoEncontrado.getID();
                R[1] = EmpleadoEncontrado.getNombre();
                R[2] = EmpleadoEncontrado.getEdad();
                R[3] = EmpleadoEncontrado.getSexo();
                R[4] = EmpleadoEncontrado.getPuesto();
                R[5] = EmpleadoEncontrado.getSueldo();
                m.addRow(R);
                c++;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int empleadoEDITPOS = buscaEmpleados(userSelectedID, E);

        VentanaEmpleadosActualizar frame1 = new VentanaEmpleadosActualizar(E[empleadoEDITPOS]);

        frame1.setVisible(true);

        // Agregar un WindowListener a la ventana de actualización
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Código a ejecutar después de que se cierre la ventana
                System.out.println("La ventana se cerró. Ejecutando código...");
                // Aquí puedes colocar el código que deseas ejecutar

                E[empleadoEDITPOS] = frame1.E;
                controlador.guardar("Empleados", E);
                leerEmpleados();
            }
        });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int empleadoEDITPOS = buscaEmpleados(userSelectedID, E);

        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(empleadoEDITPOS); // pos, pues es la posicion de la que se habla, se borra en la tabla

            eliminar(empleadoEDITPOS);
            controlador.guardar("Empleados", E); //para guardarlo en el archivo
            //txtID.setText("");

            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed
    public void eliminar(int posicion) {

        // Copiar los elementos antes de la posición
        System.arraycopy(E, 0, E, 0, posicion);

        // Copiar los elementos después de la posición
        System.arraycopy(E, posicion + 1, E, posicion, E.length - posicion - 1);

        // Asignar null al último elemento
        E[E.length - 1] = null;

    }


    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        OrdenaIDs();
        llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        userSelectedID = obtenerIdClienteSeleccionado();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if (txtSearch.getText().equals("")) {
            leerEmpleados();
            return;
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private int obtenerIdClienteSeleccionado() {
        // Obtener el índice de la fila seleccionada en la tabla
        int rowIndex = tblEmpleados.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (rowIndex != -1) {
            // Obtener el valor del ID del cliente en la columna 0 (primera columna)
            int idConsultorio = (int) tblEmpleados.getValueAt(rowIndex, 0);

            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            // retornar el ID del cliente en un mensaje
            return idConsultorio;
        } else {
            return -1;
        }
    }

    private void OrdenaIDs() {
        int n = e;
        for (int p = 1; p < n; p++) {//pasadas
            for (int i = 0; i < n - p; i++) {
                if (E[i].getID() > E[i + 1].getID()) {
                    Empleado e = new Empleado();
                    e = E[i];
                    E[i] = E[i + 1];
                    E[i + 1] = e;
                }//if
            }//for
        }//for
    }

    public void llenaTabla() {
        for (int i = 0; i < e; i++) {
            m.setValueAt(E[i].getID(), i, 0);
            m.setValueAt(E[i].getNombre(), i, 1);
            m.setValueAt(E[i].getEdad(), i, 2);
            m.setValueAt(E[i].getSexo(), i, 3);
            m.setValueAt(E[i].getPuesto(), i, 4);
            m.setValueAt(E[i].getSueldo(), i, 5);
        }
    }

    public int buscaEmpleados(int ca, Empleado E[]) {
        for (int i = 0; i < E.length; i++) {
            if (E[i] == null) {
                return -1;
            }
            if (ca == this.E[i].getID()) {
                if (this.E[i] == null) {
                    return -1;
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
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
            java.util.logging.Logger.getLogger(VentanaEmpleadosCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleadosCatalogos().setVisible(true);
            }
        });
    }
    private Empleado E[] = new Empleado[30];
    private int edad, e, su, ID, pos = -1, c;
    private String name, sex, puesto;
    private DefaultTableModel m;

    Controller controlador = new Controller();

    int userSelectedID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
