
import java.awt.Color;
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
public class VentanaArticulosRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBodega
     */
    public VentanaArticulosRegistrar() {
        initComponents();
        leerProveedores();
        leerArticulos();
        this.setLocationRelativeTo(null);

        articuloID++;
        txtID.setText(articuloID + "");
    }

    private void leerArticulos() {
        A = controlador.leer("Articulos", Articulo.class);
        Object R[] = new Object[4];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                return;
            }

            articuloID = A[i].getID();
            a++;
        }
    }

    public int buscarArticulo(int id, Articulo A[]) {
        for (int i = 0; i < a; i++) {
            if (id == A[i].getID()) {
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

        btnAgregar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblProveedor = new javax.swing.JLabel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        lblNombre.setText("Nombre:");

        lblPrecio.setText("Precio:");

        lblDescripcion.setText("Descripcion:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblProveedor.setText("Proveedor:");

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedores" }));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Articulo");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblID)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblProveedor)
                                    .addComponent(lblNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(lblPrecio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProveedor)
                            .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarID() throws IntegerException, IDsException {
        try {
            ID = Integer.parseInt(txtID.getText());
            if (ID == 0) {
                txtID.requestFocus();
                throw new IntegerException("Falta ingresar el ID");
            }
            if (a != 0) {
                for (int i = 0; i < a; i++) {
                    if (ID == A[i].getID()) {
                        throw new IDsException("El ID ingresado ya esta en uso");
                    }
                }
            }
        } catch (IntegerException | NumberFormatException | IDsException e) {
            lblID.setForeground(Color.red);
            txtID.requestFocus();
            throw e;
        }
    }

    private void validarArticulos() throws StringException, IntegerException, IDsException {
        try {
            name = txtNombre.getText();
            if (name.equals("")) {
                txtNombre.requestFocus();
                throw new StringException("Falta ingresar el nombre");
            }
        } catch (StringException e) {
            lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();
            throw e;
        }
        try {
            desc = txtDescripcion.getText();
            if (desc.equals("")) {
                txtDescripcion.requestFocus();
                throw new StringException("Falta ingresar la descripcion");
            }
        } catch (StringException e) {
            lblDescripcion.setForeground(Color.red);
            txtDescripcion.requestFocus();
            throw e;
        }
        try {
            precio = Double.parseDouble(txtPrecio.getText());
            if (precio == 0) {
                throw new IntegerException("Falta ingresar el precio");
            }
        } catch (IntegerException | NumberFormatException e) {
            lblPrecio.setForeground(Color.red);
            txtPrecio.requestFocus();
            throw e;
        }
        try {
            prov = jcbProveedor.getSelectedItem().toString();
            if (prov.equals("Proveedor")) {
                throw new StringException("Falta ingresar el proveedor");
            }
        } catch (StringException e) {
            lblProveedor.setForeground(Color.red);
            jcbProveedor.requestFocus();
            throw e;
        }
    }

    private void OrdenaIDs() {
        int n = a;
        for (int p = 1; p < n; p++) {//pasadas
            for (int i = 0; i < n - p; i++) {
                if (A[i].getID() > A[i + 1].getID()) {
                    Articulo a = new Articulo();
                    a = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = a;
                }//if
            }//for
        }//for
    }


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            validarID();
            validarArticulos();
            //String Nombre, String Descripcion, String Proveedor, int ID, double precio
            A[a++] = new Articulo(name, desc, prov, ID, precio);

            txtID.setText("");
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtPrecio.setText("");
            jcbProveedor.setSelectedIndex(0);
            controlador.guardar("Articulos", A);
            articuloID++;
            txtID.setText(articuloID + "");
        } catch (IntegerException | NumberFormatException | IDsException | StringException e) {
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void leerProveedores() {

        P = (Proveedor[]) controlador.leer("Proveedores", Proveedor.class);

        // Agregar los clientes al combo box
        for (Proveedor proveedor : P) {
            if (proveedor == null) {
                return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
            }
            String item = proveedor.getID() + " - " + proveedor.getNombre();
            jcbProveedor.addItem(item);
        }

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
            java.util.logging.Logger.getLogger(VentanaArticulosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaArticulosRegistrar().setVisible(true);
            }
        });
    }

    private Articulo A[] = new Articulo[30];

    private int ID, min, max, pos = -1, a = 0, can = 0;
    private String name, desc, prov, sec, IDB;
    private double precio;

    private int articuloID;

    Controller controlador = new Controller();

    private Proveedor P[] = new Proveedor[30];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbProveedor;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
