
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author gdlup
 */
public class VentanaPago extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPago
     */
    public VentanaPago() {
        initComponents();
         m = (DefaultTableModel) tblPagos.getModel();
        leerClientes();
        leerPagos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        lblSexo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        lblEdad1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblSexo1 = new javax.swing.JLabel();
        jcbMetodo = new javax.swing.JComboBox<>();
        jcbMotivo = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        lblEdad2 = new javax.swing.JLabel();
        lblSexo2 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Método", "Motivo", "Monto", "IdCliente", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tblPagos);

        lblSexo.setText("Motivo de pago:");

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMontoKeyPressed(evt);
            }
        });

        lblEdad1.setText("Monto:");

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

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblSexo1.setText("Método de pago:");

        jcbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Método de pago", "Efectivo", "Transferencia" }));
        jcbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMetodoActionPerformed(evt);
            }
        });

        jcbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motivo", "Cirugía", "Tratamiento" }));
        jcbMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMotivoActionPerformed(evt);
            }
        });

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        lblEdad2.setText("ID");

        lblSexo2.setText("Cliente:");

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes" }));
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdad1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblEdad2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar)
                        .addGap(197, 197, 197)
                        .addComponent(btnBuscar)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSexo2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSexo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo2)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo1)
                    .addComponent(jcbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSexo))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad1)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnOrdenar)
                    .addComponent(btnBuscar)
                    .addComponent(lblEdad2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        ordenaNombre();
        llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(pos); // pos, pues es la posicion de la que se habla, se borra en la tabla
            for (int i = 0; i < p; i++) {
                P[i] = P[i + 1]; // se recorreran en el arreglo
            }
            p--; //se decrementa pues se eliminó un renglon
            guardarArray(); //guardar en archivo
            
            jcbMetodo.setSelectedItem(0);
            jcbMotivo.setSelectedItem(0);
            txtMonto.setText("");
            txtID.setText("");
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtMontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //validando
        int ca = Integer.parseInt(txtID.getText());
        pos = buscaPago(ca, P);
        if (pos != -1) {
            
            jcbMetodo.setSelectedItem(P[pos].getMetodo());
            jcbMotivo.setSelectedItem(P[pos].getMotivo());
            txtMonto.setText(P[pos].getMonto()+"");
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
        } else {
            showMessageDialog(this, "Registro no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Date fechaSeleccionada = jDateChooser1.getDate();

        String date, met, motiv, id, name;
        float cant = 0;

        //editar 
        
        P[pos].setFecha(fechaSeleccionada+"");
        m.setValueAt(fechaSeleccionada, pos, 0);

        met = jcbMetodo.getSelectedItem().toString();
        P[pos].setMetodo(met);
        m.setValueAt(met, pos, 1);
        
        
        motiv = jcbMotivo.getSelectedItem().toString();
        P[pos].setMotivo(motiv);
        m.setValueAt(motiv, pos, 2);
        
        
        cant = Float.parseFloat(txtMonto.getText());
        P[pos].setMonto(cant);
        m.setValueAt(cant, pos, 3);
       
     

        guardarArray();
        txtMonto.setText("");
        jcbMetodo.setSelectedIndex(0);
        jcbMotivo.setSelectedIndex(0);
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
         Date fechaSeleccionada = jDateChooser1.getDate();

        date = "";
        met = "";
        motiv = "";
        cant = 0;
        name = "";
        id = 0;


        try {
            
            cant = Integer.parseInt(txtMonto.getText());
        }//catch nombre
        catch (NumberFormatException e) {
            showMessageDialog(this, "Solo números enteros");
            txtMonto.setText("");
            txtMonto.requestFocus();
        }
        
        String partes[] = jcbCliente.getSelectedItem().toString().split(" - ");
        
        name = partes[1];
        
        idCliente = Integer.parseInt(partes[0]);
        
        date = fechaSeleccionada + "";
        
        met = jcbMetodo.getSelectedItem().toString();
        if (jcbMetodo.getSelectedIndex() == 0) { //index cuando sea entero
            showMessageDialog(this, "Selecciona un método de pago");
            jcbMetodo.requestFocus();
        }
        motiv = jcbMotivo.getSelectedItem().toString();
        if (jcbMotivo.getSelectedIndex() == 0) { //index cuando sea entero
            showMessageDialog(this, "Selecciona un motivo de pago");
            jcbMotivo.requestFocus();
        } else {
            

            pos = buscaPago(id, P); //si ya se encuentra la clave, no lo agregara
            if (pos != -1) {
                showMessageDialog(this, "Este cliente ya tiene un pago registrado"); 
                return;
            }
            
            P[p++] = new Pago(date, met, motiv, cant, idCliente);

            Object O[] = new Object[6];
            O[0] = date;
            O[1] = met;
            O[2] = motiv;
            O[3] = cant;
            O[4] = idCliente;
            O[5] = name;
            

            m.addRow(O);
            guardarArray();
            txtMonto.setText("");
            txtID.setText("");
            jcbMetodo.setSelectedIndex(0);
            jcbMotivo.setSelectedIndex(0);
        
        
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
        
    private void jcbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMetodoActionPerformed

    private void jcbMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMotivoActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKeyPressed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbClienteActionPerformed

     private void llenaTabla() {
        for (int i = 0; i < p; i++) {
            //if
            m.setValueAt(P[i].getFecha(), i, 0);
            m.setValueAt(P[i].getMetodo(), i, 1);
            m.setValueAt(P[i].getMotivo(), i, 2);
            m.setValueAt(P[i].getMonto(), i, 3);
            m.setValueAt(C[i].getId(), i, 4);
            m.setValueAt(C[i].getNombre(), i, 5);
        }

    }

    private void ordenaNombre() {
        int n = p; //a: numero de alumnos en el arreglo
        for (int p = 1; p < n; p++) //ciclo para las pasadas, siempre son n-1, que vienen a ser las "Rondas" para ordenar
        {
            for (int i = 0; i < n - p; i++) {
                if (C[i].getNombre().compareTo(C[i + 1].getNombre()) > 0) { //si las dos son iguales, retorna 0, si la segunda es mayor que la primera
                    //retorna menor a 0, si la primera es mayor alfabeticamente, retorna mayor a 0
                    Pago pa = new Pago();
                    pa = P[i];
                    P[i] = P[i + 1];
                    P[i + 1] = pa;
                }
            }
        }
    }    
    
        
    private void guardarArray() {

        try {
            //se abre el flujo y se manda el metodo para guardar
            FileOutputStream flujoBytes = new FileOutputStream("Pagos.obj");
            fcs = new ObjectOutputStream(flujoBytes);
            fcs.writeObject(P);
            fcs.flush();
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        }

    }

    private void leerPagos() {
        try {
            FileInputStream flujoBytes = new FileInputStream("Pagos.obj"); //flujo de Bytes
            fce = new ObjectInputStream(flujoBytes); //flujo de objetos
            P = (Pago[]) fce.readObject();
            Object R[] = new Object[6];
            //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

            
            for (int i = 0; i < P.length; i++) {
                if (P[i] == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                R[0] = P[i].getFecha();
                R[1] = P[i].getMetodo();
                R[2] = P[i].getMotivo();
                R[3] = P[i].getMonto();
                R[4] = P[i].getClienteID();
             
                int clienteEncontradoID = buscaCliente(P[i].getClienteID(),C);
                
                R[5] = C[clienteEncontradoID].getNombre();
                
                
                m.addRow(R);
                p++;
            }

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error el archivo no se encontro");
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(this, "Error");
        }
    }

    public int buscaPago(int ca, Pago P[]) {
        for (int i = 0; i < p; i++) {
            if (ca == C[i].getId()) {
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró
    }
    
    private void leerClientes() {
        try {
            FileInputStream flujoBytes = new FileInputStream("Clientes.obj"); //flujo de Bytes
            fce = new ObjectInputStream(flujoBytes); //flujo de objetos
            C = (Cliente[]) fce.readObject();

            if( C == null){
                return ;
            }
            
            // Agregar los clientes al combo box
            for (Cliente cliente : C) {
                if (cliente == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                String item = cliente.getId() + " - " + cliente.getNombre();
                jcbCliente.addItem(item);
            }

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error el archivo no se encontro");
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(this, "Error");
        }
    }
    
        public int buscaCliente(int ca, Cliente A[]) {
        for (int i = 0; i < A.length; i++) {
            if (ca == C[i].getId()) {
                if (C[i] == null) {
                    return -1; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
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
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPago().setVisible(true);
            }
        });
    }

    private Pago P[] = new Pago[30];
    private float cant;
    private String met, motiv, date, name;
    private int p = 0;
    private int id, idCliente;
    private int pos = -1;
    private DefaultTableModel m;
    private Cliente C[] = new Cliente[30];
    private int c;
    //nuevos agregados con lo de archivos
    private ObjectOutputStream fcs; // flujo de objetos de escritura
    private ObjectInputStream fce; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbMetodo;
    private javax.swing.JComboBox<String> jcbMotivo;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblEdad2;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblSexo2;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
