
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author orozc
 */
public class VentanaMascotasRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMascota
     */
    public VentanaMascotasRegistrar() {
        initComponents();
        leerClientes();
        leerMascotas();
        id++;        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSexo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblclie = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        lblespe = new javax.swing.JLabel();
        jcbEspecie = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSexo.setText("Sexo:");

        lblNombre.setText("Nombre:");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "H", "F" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadKeyPressed(evt);
            }
        });

        lblEdad.setText("Edad:");

        lblclie.setText("Cliente:");

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente" }));
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        lblespe.setText("Especie:");

        jcbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especie", "Dalmata", "Chihuahua" }));
        jcbEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEspecieActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Mascota");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblclie)
                                    .addComponent(lblSexo)
                                    .addComponent(lblEdad)
                                    .addComponent(lblespe)
                                    .addComponent(lblNombre))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEdad)
                                        .addComponent(jcbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbEspecie, 0, 200, Short.MAX_VALUE)
                                        .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblespe)
                    .addComponent(jcbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblclie)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void leerMascotas(){
        M = controlador.leer("Mascotas", Mascota.class);
        
        for(int i = 0; i<M.length;i++){
            if(M[i]==null){
                return;
            }
            id = M[i].getId();
            a++;
        }
    }
    private boolean validarMascotas(boolean b) {
        //validar nombre
        name = txtNombre.getText();
        if (name.equals("")) {
            showMessageDialog(this, "Falta ingresar el nombre");
            lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();
            return b = false;
        }
        try {
            edad = Integer.parseInt(txtEdad.getText());
        } catch (NumberFormatException err) {
            showMessageDialog(this, "Solo numeros");
            lblEdad.setForeground(Color.red);
            txtEdad.requestFocus();
            return b = false;
        }
        if (edad == 0) {
            showMessageDialog(this, "Falta ingresar la edad");
            lblEdad.setForeground(Color.red);
            txtEdad.requestFocus();
            return b = false;
        }

        sex = jcbSexo.getSelectedItem().toString();
        if (sex.equals("Sexo")) {
            showMessageDialog(this, "Falta ingresar el sexo");
            lblSexo.setForeground(Color.red);
            jcbSexo.requestFocus();
            return b = false;
        }

        //for (Cliente cliente : VentanaClientes.C ) {
        //jcbCliente.addItem(String.valueOf(cliente.getId()));
        String clientePedazo = jcbCliente.getSelectedItem().toString();

        clie = clientePedazo.split(" - ")[0];

        if (clie.equals("Puesto")) {
            showMessageDialog(this, "Falta ingresar el Cliente");
            lblclie.setForeground(Color.red);
            jcbCliente.requestFocus();
            return b = false;
        }

        espe = jcbEspecie.getSelectedItem().toString();
        if (espe.equals("Puesto")) {
            showMessageDialog(this, "Falta ingresar el Especie");
            lblespe.setForeground(Color.red);
            jcbEspecie.requestFocus();
            return b = false;
        }

        return b;
    }

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        lblSexo.setForeground(Color.black);
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        lblNombre.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean b = true;
        b = validarMascotas(b);
        if (b == true) {
            //String nombre, String especie, String sexo, String cliente, int id, int edad
            M[a++] = new Mascota(name, espe, sex, Integer.parseInt(clie), id, edad);

            controlador.guardar("Mascotas", M);
            
            txtNombre.setText("");
            txtEdad.setText("");
            jcbSexo.setSelectedIndex(0);
            jcbCliente.setSelectedIndex(0);
            jcbEspecie.setSelectedIndex(0);
            id++;
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyPressed

    }//GEN-LAST:event_txtEdadKeyPressed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed

    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jcbEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEspecieActionPerformed

    }//GEN-LAST:event_jcbEspecieActionPerformed

    private void OrdenaNombre() {
        int n = a;
        for (int p = 1; p < n; p++) {//pasadas
            for (int i = 0; i < n - p; i++) {
                if (M[i].getNombre().compareTo(M[i + 1].getNombre()) > 0) {
                    Mascota t = new Mascota();
                    t = M[i];
                    M[i] = M[i + 1];
                    M[i + 1] = t;
                }//if
            }//for
        }//for
    }

    public void llenaTabla() {
        for (int i = 0; i < a; i++) {
            m.setValueAt(M[i].getNombre(), i, 0);
            m.setValueAt(M[i].getSexo(), i, 1);
            m.setValueAt(M[i].getEdad(), i, 2);
            m.setValueAt(M[i].getCliente(), i, 3);
            m.setValueAt(M[i].getEspecie(), i, 4);
        }
    }

    private void leerClientes() {

        C = (Cliente[]) controlador.leer("Clientes", Cliente.class);

        // Agregar los clientes al combo box
        for (Cliente cliente : C) {
            if (cliente == null) {
                return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
            }
            String item = cliente.getId() + " - " + cliente.getNombre();
            jcbCliente.addItem(item);

        }
    }


    public int buscaMascota(int ca, Mascota A[]) {
        for (int i = 0; i < a; i++) {
            if (ca == A[i].getId()) {
                if (A[i] == null) {
                    return -1; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró
    }

    public int buscaCliente(int ca, Cliente A[]) {
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
            java.util.logging.Logger.getLogger(VentanaMascotasRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMascotasRegistrar().setVisible(true);
            }
        });
    }

    private Mascota M[] = new Mascota[30];
    private int id, edad;
    private int a = 0, pos = -1;
    private String name, sex, espe, clie;
    private DefaultTableModel m;
    private int c = 0;

    private Cliente C[] = new Cliente[30];
    Controller controlador = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbEspecie;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblclie;
    private javax.swing.JLabel lblespe;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
