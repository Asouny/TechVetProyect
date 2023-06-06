
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
public class VentanaProveedoresCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProveedores
     */
    public VentanaProveedoresCatalogo() {
        initComponents();
        m = (DefaultTableModel) tblProveedores.getModel();
        leerProveedores();        this.setLocationRelativeTo(null);

    }

    private void leerProveedores() {

        P = (Proveedores[]) controlador.leer("Proveedores", Proveedores.class);
        Object R[] = new Object[5];
        m.setRowCount(0);

        for (int i = 0; i < P.length; i++) {
            if (P[i] == null) {
                return;
            }
            R[0] = P[i].getID();
            R[1] = P[i].getNombre();
            R[2] = P[i].getRFC();
            R[3] = P[i].getTelefono();
            R[4] = P[i].getCorreo();
            m.addRow(R);
            pr++;
        }
    }

    public int buscarProveedores(int id, Proveedores E[]) {
        for (int i = 0; i < pr; i++) {
            if (id == P[i].getID()) {
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

        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

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

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RFC", "Telefono", "Correo Electronico"
            }
        ));
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Catalogo de Proveedores");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int proveedorEDITPOS = buscaProveedor(proveedorSelectedID, P);

        VentanaProveedoresActualizar frame1 = new VentanaProveedoresActualizar(P[proveedorEDITPOS]);

        frame1.setVisible(true);

        // Agregar un WindowListener a la ventana de actualización
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Código a ejecutar después de que se cierre la ventana
                System.out.println("La ventana se cerró. Ejecutando código...");
                // Aquí puedes colocar el código que deseas ejecutar

                P[proveedorEDITPOS] = frame1.P;
                controlador.guardar("Proveedores", P);
                leerProveedores();
            }
        });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int clienteEDITPOS = buscaProveedor(proveedorSelectedID, P);

        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(clienteEDITPOS); // pos, pues es la posicion de la que se habla, se borra en la tabla
            eliminar(clienteEDITPOS);
            controlador.guardar("Proveedores", P); //para guardarlo en el archivo
            //txtID.setText("");

            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void eliminar(int posicion) {

        // Copiar los elementos antes de la posición
        System.arraycopy(P, 0, P, 0, posicion);

        // Copiar los elementos después de la posición
        System.arraycopy(P, posicion + 1, P, posicion, P.length - posicion - 1);

        // Asignar null al último elemento
        P[P.length - 1] = null;

    }

    public int buscaEmpleados(int ca, Proveedores E[]) {
        for (int i = 0; i < E.length; i++) {
            if (E[i] == null) {
                return -1;
            }
            if (ca == this.P[i].getID()) {
                if (this.P[i] == null) {
                    return -1;
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtSearch.getText().equals("")) {
            leerProveedores();
            return;
        } else {
            int id = Integer.parseInt(txtSearch.getText());

            int proveedorPOS = buscaProveedor(id, P);

            if (proveedorPOS == -1) {
                showMessageDialog(this, "proveedor no encontrado");

            } else {
                Proveedores ProveedorEncontrado = P[proveedorPOS];
                m.setRowCount(0);

                Object R[] = new Object[5];
                //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

                R[0] = ProveedorEncontrado.getID();
                R[1] = ProveedorEncontrado.getNombre();
                R[2] = ProveedorEncontrado.getRFC();
                R[3] = ProveedorEncontrado.getTelefono();
                R[4] = ProveedorEncontrado.getCorreo();
                m.addRow(R);
                pr++;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
        proveedorSelectedID = obtenerIdProveedorSeleccionado();

        // TODO add your handling code here:
    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

        if (txtSearch.getText().equals("")) {
            leerProveedores();
            return;
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private int obtenerIdProveedorSeleccionado() {
        // Obtener el índice de la fila seleccionada en la tabla
        int rowIndex = tblProveedores.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (rowIndex != -1) {
            // Obtener el valor del ID del cliente en la columna 0 (primera columna)
            int idConsultorio = (int) tblProveedores.getValueAt(rowIndex, 0);

            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            // retornar el ID del cliente en un mensaje
            return idConsultorio;
        } else {
            return -1;
        }
    }

    public int buscaProveedor(int ca, Proveedores E[]) {
        for (int i = 0; i < E.length; i++) {
            if (E[i] == null) {
                return -1;
            }
            if (ca == this.P[i].getID()) {
                if (this.P[i] == null) {
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
            java.util.logging.Logger.getLogger(VentanaProveedoresCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedoresCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedoresCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedoresCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedoresCatalogo().setVisible(true);
            }
        });
    }
    private Proveedores P[] = new Proveedores[30];
    private int pr, ID, pos = -1;
    private String name, RFC, correo, tel;
    private DefaultTableModel m;

    int proveedorSelectedID;
    Controller controlador = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
