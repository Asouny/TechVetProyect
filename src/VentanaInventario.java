
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author orozc
 */
public class VentanaInventario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaArticulos
     */
    public VentanaInventario() {
        initComponents();
        m = (DefaultTableModel) tblInventario.getModel();
        leerArticulos();
        leerInventario();
    }

    private void leerArticulos() {

        A = (Articulos[]) controlador.leer("Articulos", Articulos.class); // Agregar los clientes al combo box
        for (Articulos articulos : A) {
            if (articulos == null) {
                return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
            }
            String item = articulos.getID() + "";
            jcbID.addItem(item);
            name = articulos.getNombre();
            prov = articulos.getProveedor();
        }

    }

    private void leerInventario() {
        I = (Inventario[]) controlador.leer("Inventario", Inventario.class);

        // Agregar los clientes al combo box
        for (Inventario articulos : I) {
            if (articulos == null) {
                return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
            }
            Object O[] = new Object[5];
            O[0] = articulos.getID();
            O[1] = articulos.getNombre();
            O[2] = articulos.getProveedor();
            O[3] = articulos.getExistencias();
            O[4] = articulos.getClasificacion();
            m.addRow(O);
        }

    }

    private void validarID() throws IntegerException, IDsException {
        try {
            ID = Integer.parseInt(jcbID.getSelectedItem().toString());
            if (ID == 0) {
                jcbID.requestFocus();
                throw new IntegerException("Falta ingresar el ID");
            }
            if (in != 0) {
                for (int i = 0; i < in; i++) {
                    if (ID == A[i].getID()) {
                        throw new IDsException("El ID ingresado ya esta en uso");
                    }
                }
            }
        } catch (IntegerException | NumberFormatException | IDsException e) {
            lblID.setForeground(Color.red);
            jcbID.requestFocus();
            throw e;
        }
    }

    private void validarInventario() throws StringException, IntegerException, IDsException {
        try {
            ex = Integer.parseInt(txtExistencias.getText());
            if (ex == 0) {
                throw new IntegerException("Falta ingresar las existencias");
            }
        } catch (IntegerException | NumberFormatException e) {
            lblExistencias.setForeground(Color.red);
            txtExistencias.requestFocus();
            throw e;
        }
        try {
            cla = jcbClasificacion.getSelectedItem().toString();
            if (cla.equals("Clasificacion")) {
                throw new StringException("Falta ingresar la clasificacion");
            }
        } catch (StringException e) {
            lblClasificacion.setForeground(Color.red);
            jcbClasificacion.requestFocus();
            throw e;
        }
    }

    private void OrdenaIDs() {
        int n = in;
        for (int p = 1; p < n; p++) {//pasadas
            for (int i = 0; i < n - p; i++) {
                if (I[i].getID() > I[i + 1].getID()) {
                    Inventario inv = new Inventario();
                    inv = I[i];
                    I[i] = I[i + 1];
                    I[i + 1] = inv;
                }//if
            }//for
        }//for
    }

    public void llenaTabla() {
        for (int i = 0; i < in; i++) {
            m.setValueAt(I[i].getID(), i, 0);
            m.setValueAt(I[i].getNombre(), i, 1);
            m.setValueAt(I[i].getProveedor(), i, 2);
            m.setValueAt(I[i].getExistencias(), i, 3);
            m.setValueAt(I[i].getClasificacion(), i, 4);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        btnOrdenar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        lblExistencias = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        lblClasificacion = new javax.swing.JLabel();
        jcbClasificacion = new javax.swing.JComboBox<>();
        jcbID = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Proveedor", "Existencias", "Clasificacion"
            }
        ));
        jScrollPane2.setViewportView(tblInventario);

        lblID.setText("ID Articulos:");

        lblExistencias.setText("Existencias:");

        lblClasificacion.setText("Clasificacion:");

        jcbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasificacion", "Medicamentos", "Alimentos", "Accesorios", "Limpieza", "Cirugia" }));

        jcbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Articulo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExistencias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClasificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbClasificacion, 0, 1, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExistencias)
                    .addComponent(lblClasificacion)
                    .addComponent(jcbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        OrdenaIDs();
        llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    public int buscarInventario(int id, Inventario I[]) {
        for (int i = 0; i < in; i++) {
            if (id == I[i].getID()) {
                return i;
            }
        }
        return -1;
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            int id = Integer.parseInt(jcbID.getSelectedItem().toString());
            pos = buscarInventario(id, I);
            if (pos != -1) {
                jcbID.setSelectedItem(I[pos].getID() + "");
                txtExistencias.setText(I[pos].getExistencias() + "");
                jcbClasificacion.setSelectedItem(I[pos].getClasificacion());
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
            } else {
                showMessageDialog(this, "Ese Articulo no se encuentra registrada");
            }
        } catch (NumberFormatException e) {
            showMessageDialog(this, "Falta ingresar el ID");
            lblID.setForeground(Color.red);
            jcbID.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            validarInventario();
            ex = Integer.parseInt(txtExistencias.getText());
            I[pos].setExistencias(ex);
            m.setValueAt(ex, pos, 3);
            cla = jcbClasificacion.getSelectedItem().toString();
            I[pos].setProveedor(cla);
            m.setValueAt(prov, pos, 4);
            controlador.guardar("INVENTARIO", I);
        } catch (IntegerException | NumberFormatException | IDsException | StringException e) {
            showMessageDialog(this, e.getMessage());
        }
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            validarID();
            validarInventario();
            //int Existencias, int ID, String Nombre, String Proveedor, String Clasificacion
            I[in++] = new Inventario(ex, ID, name, prov, cla);
            Object O[] = new Object[9];
            O[0] = ID;
            O[1] = name;
            O[2] = prov;
            O[3] = ex;
            O[4] = cla;
            m.addRow(O);
            jcbID.setSelectedIndex(0);
            txtExistencias.setText("");
            jcbClasificacion.setSelectedIndex(0);
            controlador.guardar("Inventario", I);
        } catch (IntegerException | NumberFormatException | IDsException | StringException e) {
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int boton = showConfirmDialog(this, "Seguro que quieres borrar?");
        if (boton == 0) {
            m.removeRow(pos);
            I = controlador.eliminar(I, pos);
            for (int i = pos; i < in; i++) {
                I[i] = I[i + 1];
                in--;
            }//for
            controlador.guardar("INVENTARIO", I);
            jcbID.setSelectedIndex(0);
            txtExistencias.setText("");
            jcbClasificacion.setSelectedIndex(0);
        }//if
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInventario().setVisible(true);
            }
        });
    }
    private Inventario I[] = new Inventario[30];
    private int ID, min, max, pos = -1, in = 0, ex = 0;
    private String name, prov, cla;
    private DefaultTableModel m;
    private Inventario B[] = new Inventario[30];
    private Articulos A[] = new Articulos[30];
    Controller controlador = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbClasificacion;
    private javax.swing.JComboBox<String> jcbID;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblExistencias;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtExistencias;
    // End of variables declaration//GEN-END:variables
}
