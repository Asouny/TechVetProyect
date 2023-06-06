
import java.awt.Color;
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
public class VentanaEmpleadosRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpleados
     */
    public VentanaEmpleadosRegistrar() {
        initComponents();
        leerEmpleados();
        id++;
        txtID.setText(id + "");
    }

    private void leerEmpleados() {
        //String reg=""; TAREA UNA CONDICION PARA QUE NO MARQUE ERROR AL FINALIZAR EL ERROR
        E = (Empleado[]) controlador.leer("Empleados", Empleado.class);
        Object R[] = new Object[6];
        for (int i = 0; i < E.length; i++) {
            if (E[i] == null) {
                return;
            }
            id = E[i].getID();
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

        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jcbPuesto = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        lblEdad.setText("Edad:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
        });

        lblSexo.setText("Sexo:");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "H", "F" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        lblSueldo.setText("Sueldo:");

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSueldoKeyPressed(evt);
            }
        });

        jcbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puesto", "Veterinario", "Limpieza", "Administracion" }));
        jcbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPuestoActionPerformed(evt);
            }
        });

        lblNombre.setText("Apellidos:");

        lblPuesto.setText("Puesto:");

        lblID.setText("ID:");

        txtID.setEditable(false);
        txtID.setEnabled(false);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PrincipalPageComponent/src/icons8_save_48px.png"))); // NOI18N
        btnAgregar1.setBorderPainted(false);
        btnAgregar1.setContentAreaFilled(false);
        btnAgregar1.setDefaultCapable(false);
        btnAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/PrincipalPageComponent/src/icons8_save_48px_p.png"))); // NOI18N
        btnAgregar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PrincipalPageComponent/src/icons8_save_48px_on.png"))); // NOI18N
        btnAgregar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/PrincipalPageComponent/src/icons8_save_48px_on.png"))); // NOI18N
        btnAgregar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar empleado");
        jLabel2.setToolTipText("");

        lblNombre1.setText("Nombre(s):");

        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar1))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPuesto)
                                    .addComponent(lblNombre1)
                                    .addComponent(lblSexo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(jcbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSueldo)
                                    .addComponent(lblEdad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad)
                                    .addComponent(txtSueldo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto)
                    .addComponent(jcbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSexo)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
            if (e != 0) {
                for (int i = 0; i < e; i++) {
                    if (ID == E[i].getID()) {
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

    private void validarEmpleado() throws StringException, IntegerException, IDsException {
        try {
            name = txtNombre.getText() + " " + txtNombre1.getText();
            if (txtNombre.getText().equals("")) {
                txtNombre.requestFocus();
                throw new StringException("Falta ingresar el nombre");
            }
            if (txtNombre1.getText().equals("")) {
                txtNombre.requestFocus();
                throw new StringException("Falta ingresar el apellido");
            }
        } catch (StringException e) {
            lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();
            lblNombre1.setForeground(Color.red);
            txtNombre1.requestFocus();
            throw e;
        }
        try {
            edad = Integer.parseInt(txtEdad.getText());
            if (edad == 0) {
                throw new IntegerException("Falta ingresar la edad");
            }
        } catch (IntegerException | NumberFormatException e) {
            lblEdad.setForeground(Color.red);
            txtEdad.requestFocus();
            throw e;
        }
        try {
            sex = jcbSexo.getSelectedItem().toString();
            if (sex.equals("Sexo")) {
                throw new StringException("Falta ingresar el Sexo");
            }
        } catch (StringException e) {
            lblSexo.setForeground(Color.red);
            jcbSexo.requestFocus();
            throw e;
        }
        try {
            puesto = jcbPuesto.getSelectedItem().toString();
            if (puesto.equals("Puesto")) {
                throw new StringException("Falta ingresar el puesto");
            }
        } catch (StringException e) {
            lblSexo.setForeground(Color.red);
            jcbSexo.requestFocus();
            throw e;
        }
        try {
            su = Integer.parseInt(txtSueldo.getText());
            if (su == 0) {
                throw new IntegerException("Falta ingresar el sueldo");
            }
        } catch (IntegerException | NumberFormatException e) {
            lblSueldo.setForeground(Color.red);
            txtSueldo.requestFocus();
            throw e;
        }
    }

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        lblNombre.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreKeyPressed


    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        lblSexo.setForeground(Color.black);
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void txtSueldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyPressed
        lblSueldo.setForeground(Color.black);
    }//GEN-LAST:event_txtSueldoKeyPressed

    private void jcbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPuestoActionPerformed
        lblPuesto.setForeground(Color.black);
    }//GEN-LAST:event_jcbPuestoActionPerformed

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed
        lblEdad.setForeground(Color.black);
    }//GEN-LAST:event_txtEdadKeyPressed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        lblID.setForeground(Color.black);
    }//GEN-LAST:event_txtIDKeyPressed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        try {
            validarID();
            validarEmpleado();
            //puesto,sueldo,nombre,sexo,edad
            E[e++] = new Empleado(puesto, su, name, sex, edad, ID);

            txtID.setText("");
            txtNombre.setText("");
            txtNombre1.setText("");

            txtEdad.setText("");
            jcbSexo.setSelectedIndex(0);
            txtSueldo.setText("");

            jcbPuesto.setSelectedIndex(0);
            controlador.guardar("Empleados", E);
            id++;
            txtID.setText(id + "");
        } catch (IntegerException | NumberFormatException | IDsException | StringException e) {
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void txtNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyPressed
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
            java.util.logging.Logger.getLogger(VentanaEmpleadosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadosRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleadosRegistrar().setVisible(true);
            }
        });
    }
    private Empleado E[] = new Empleado[30];
    private int edad, e, su, ID, pos = -1;
    private String name, sex, puesto;

    Controller controlador = new Controller();

    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbPuesto;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
