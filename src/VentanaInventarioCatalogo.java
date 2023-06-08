
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
public class VentanaInventarioCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProveedores
     */
    public VentanaInventarioCatalogo() {
        initComponents();
        m=(DefaultTableModel) tblInventario.getModel();
        leerInventario();
        leerArticulos();
    }

    private void leerInventario(){
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
    private void leerArticulos() {
        try {
            FileInputStream flujoBytes = new FileInputStream("ARTICULOS.VET"); //flujo de Bytes
            ObjectInputStream fce = new ObjectInputStream(flujoBytes); //flujo de objetos
            A = (Articulo[]) fce.readObject();

            // Agregar los clientes al combo box
            for (Articulo articulos : A) {
                if (articulos == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                name=articulos.getNombre();
                prov=articulos.getProveedor();
            }

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error el archivo no se encontro");
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(this, "Error");
        }
    }
    public int buscaInventario(int inv, Inventario I[]) {
        for (int i = 0; i < I.length; i++) {
            if (I[i] == null) {
                return -1;
            }
            if (inv == this.I[i].getID()) {
                if (this.I[i] == null) {
                    return -1;
                }
                return i; //Return el arreglo en esa posición
            }//Para que compare id (parámetro) con id del arreglo
        }
        return -1; //Por si no los encontró
    }
    
    public int buscarInventarios(int id,Inventario I[]){
        for (int i = 0; i < in; i++) {
            if(id==I[i].getID()){
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Inventario");

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

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Proveedor", "Existencias", "Clasificacion"
            }
        ));
        jScrollPane2.setViewportView(tblInventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int inventarioEDITPOS = buscaInventario(inventarioSelectedID, I);

        VentanaInventarioActualizar frame1 = new VentanaInventarioActualizar(I[inventarioEDITPOS]);

        frame1.setVisible(true);

        // Agregar un WindowListener a la ventana de actualización
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Código a ejecutar después de que se cierre la ventana
                System.out.println("La ventana se cerró. Ejecutando código...");
                // Aquí puedes colocar el código que deseas ejecutar

                I[inventarioEDITPOS] = frame1.I;
                controlador.guardar("Inventario", I);
                leerInventario();
            }
        });
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int clienteEDITPOS = buscaInventario(inventarioSelectedID, I);

        if (showConfirmDialog(this, "Se borrará el renglón, ¿proceder?") == 0) {
            m.removeRow(clienteEDITPOS); // pos, pues es la posicion de la que se habla, se borra en la tabla
            eliminar(clienteEDITPOS);
            controlador.guardar("Inventario", I); //para guardarlo en el archivo
            //txtID.setText("");
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void eliminar(int posicion) {

        // Copiar los elementos antes de la posición
        System.arraycopy(I, 0, I, 0, posicion);

        // Copiar los elementos después de la posición
        System.arraycopy(I, posicion + 1, I, posicion, I.length - posicion - 1);

        // Asignar null al último elemento
        I[I.length - 1] = null;

    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtSearch.getText().equals("")) {
            leerInventario();
            return;
        } else {
            int id = Integer.parseInt(txtSearch.getText());

            int inventarioPOS = buscaInventario(id, I);

            if (inventarioPOS == -1) {
                showMessageDialog(this, "producto no encontrado");

            } else {
                Inventario InventarioEncontrado = I[inventarioPOS];
                m.setRowCount(0);

                Object R[] = new Object[5];
                //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo

                R[0] = InventarioEncontrado.getID();
                R[1] = InventarioEncontrado.getNombre();
                R[2] = InventarioEncontrado.getProveedor();
                R[3] = InventarioEncontrado.getExistencias();
                R[4] = InventarioEncontrado.getClasificacion();
                m.addRow(R);
                in++;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

        if (txtSearch.getText().equals("")) {
            leerInventario();
            return;
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private int obtenerIdInventarioSeleccionado() {
        // Obtener el índice de la fila seleccionada en la tabla
        int rowIndex = tblInventario.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (rowIndex != -1) {
            // Obtener el valor del ID del cliente en la columna 0 (primera columna)
            int idConsultorio = (int) tblInventario.getValueAt(rowIndex, 0);

            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            // retornar el ID del cliente en un mensaje
            return idConsultorio;
        } else {
            return -1;
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
    private Inventario I[] = new Inventario[30];
    private Articulo A[] = new Articulo[30];
    private int ID,min,max,pos=-1,in=0,ex=0;
    private String name,prov,cla;
    private DefaultTableModel m;
    int inventarioSelectedID;
    Controller controlador = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
