
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
public class VentanaArticulos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBodega
     */
    
    public VentanaArticulos() {
        initComponents();
        m=(DefaultTableModel) tblArticulos.getModel();
        leerProveedores();
    }
    
    private void leerArticulos(){
        if (archivo.exists()) {
        try {
            FileInputStream fb= new FileInputStream("ARTICULOS.VET");//flujo de Bytes
            fce=new ObjectInputStream(fb);//flujo de Objectos
            //String reg=""; TAREA UNA CONDICION PARA QUE NO MARQUE ERROR AL FINALIZAR EL ERROR
            A=(Articulo[]) fce.readObject();
            Object R[]=new Object[10];
            for (int i = 0; i < A.length; i++) {
                if(A[i]==null)return;
                R[0]=A[i].getID();
                R[1]=A[i].getNombre();
                R[2]=A[i].getDescripcion();
                R[3]=A[i].getPrecio();
                R[9]=A[i].getProveedor();
                m.addRow(R); 
                a++;
            }
        }catch (FileNotFoundException ex){showMessageDialog(this,"ERROR");}
        catch(IOException ex){showMessageDialog(this,"ERROR");}
        catch(ClassNotFoundException ex){showMessageDialog(this,"ERROR");}
        }
    }
    
    public int buscarArticulo(int id,Articulo A[]){
        for (int i = 0; i < a; i++) {
            if(id==A[i].getID()){
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
        tblArticulos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tblArticulos);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

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

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblNombre.setText("Nombre:");

        lblPrecio.setText("Precio:");

        lblDescripcion.setText("Descripcion:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblProveedor.setText("Proveedor:");

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedores" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrdenar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio)
                            .addComponent(lblDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAgregar)
                                .addComponent(btnEditar)
                                .addComponent(btnEliminar)
                                .addComponent(btnBuscar)
                                .addComponent(btnOrdenar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblProveedor)
                                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void validarID()throws IntegerException,IDsException{
    try{
        ID = Integer.parseInt(txtID.getText());
        if(ID==0){
            txtID.requestFocus();
            throw new IntegerException("Falta ingresar el ID");
        }
        if(a!=0){
            for(int i = 0; i < a; i++) {
                if(ID==A[i].getID()){
                throw new IDsException("El ID ingresado ya esta en uso");
                }
            }
        }
        }catch (IntegerException | NumberFormatException | IDsException e){
            lblID.setForeground(Color.red);
            txtID.requestFocus();
            throw e;
        }
    }
    
    private void validarArticulos()throws StringException,IntegerException,IDsException{
    try{
        name=txtNombre.getText();
        if(name.equals("")){
            txtNombre.requestFocus(); 
            throw new StringException("Falta ingresar el nombre");  
            }
        }catch (StringException e){
            lblNombre.setForeground(Color.red);
            txtNombre.requestFocus();
            throw e;
        }
    try{
        desc=txtDescripcion.getText();
        if(desc.equals("")){
            txtDescripcion.requestFocus(); 
            throw new StringException("Falta ingresar la descripcion");  
            }
        }catch (StringException e){
            lblDescripcion.setForeground(Color.red);
            txtDescripcion.requestFocus();
            throw e;
        }
    try{
        precio = Double.parseDouble(txtPrecio.getText());
        if(precio==0){
            throw new IntegerException("Falta ingresar el precio");
        }
        }catch (IntegerException | NumberFormatException e){
            lblPrecio.setForeground(Color.red);
            txtPrecio.requestFocus();
            throw e;
        }
        try{
        prov=jcbProveedor.getSelectedItem().toString();
        if(prov.equals("Proveedor")){
            throw new StringException("Falta ingresar el proveedor");
        }
        }catch (StringException e){
            lblProveedor.setForeground(Color.red);
            jcbProveedor.requestFocus();
            throw e;
        }
    }
    
    private void OrdenaIDs(){
        int n=a;
        for(int p=1;p<n;p++){//pasadas
            for(int i=0;i<n-p;i++){
                if(A[i].getID()>A[i+1].getID()){
                    Articulo a=new Articulo();
                    a=A[i];
                    A[i]=A[i+1];
                    A[i+1]=a;
                }//if
            }//for
        }//for
    }
    
    public void llenaTabla(){
        for(int i=0;i<a;i++){
            m.setValueAt(A[i].getID(),i,0);
            m.setValueAt(A[i].getNombre(),i,1);
            m.setValueAt(A[i].getDescripcion(),i,2);
            m.setValueAt(A[i].getPrecio(),i,3);
            m.setValueAt(A[i].getProveedor(),i,4);
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
            validarID();
            validarArticulos();
            //String Nombre, String Descripcion, String Proveedor, int ID, double precio
            A[a++]=new Articulo(name,desc,prov,ID,precio);
            Object O[]=new Object[5];
            O[0]=ID;
            O[1]=name;
            O[2]=desc;
            O[3]=precio;
            O[4]=prov;
            m.addRow(O);
            txtID.setText("");
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtPrecio.setText("");
            jcbProveedor.setSelectedIndex(0);
            guardarArray();
        }catch (IntegerException | NumberFormatException | IDsException | StringException e){
            showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int id=Integer.parseInt(txtID.getText());
        pos=buscarArticulo(id,A);
        if(pos!=-1){
            txtID.setText(A[pos].getID()+"");
            txtDescripcion.setText(A[pos].getDescripcion()+"");
            txtPrecio.setText(A[pos].getPrecio()+"");
            jcbProveedor.setSelectedItem(A[pos].getProveedor()+"");
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }else{
            showMessageDialog(this,"Ese Articulo no se encuentra registrada");
        }
        }catch(NumberFormatException e){
            showMessageDialog(this,"Falta ingresar el ID");
            lblID.setForeground(Color.red);
            txtID.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            validarArticulos();
            name=txtNombre.getText();
            A[pos].setNombre(name);
            m.setValueAt(name,pos,1);
            desc=txtDescripcion.getText();
            A[pos].setDescripcion(desc);
            m.setValueAt(desc,pos,2);
            precio=Double.parseDouble(txtPrecio.getText());
            A[pos].setPrecio(precio);
            m.setValueAt(precio,pos,3);
            prov=jcbProveedor.getSelectedItem().toString();
            A[pos].setProveedor(prov);
            m.setValueAt(prov,pos,4);
            guardarArray();
        }catch(IntegerException | NumberFormatException | IDsException | StringException e){
            showMessageDialog(this,e.getMessage());
        }
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int boton=showConfirmDialog(this,"Seguro que quieres borrar?");
        if(boton==0){
            m.removeRow(pos);
            for(int i=pos;i<a;i++){
                A[i]=A[i+1];
                a--;
            }//for
            guardarArray();
            txtID.setText("");
            txtNombre.setText("");
            txtDescripcion.setText("");
            txtPrecio.setText("");
            jcbProveedor.setSelectedIndex(0);
        }//if
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        OrdenaIDs();
        llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void guardarArray(){
        try {
            FileOutputStream fb= new FileOutputStream("ARTICULOS.VET");
            fcs=new ObjectOutputStream(fb);//true es para que agregue otra al final
            fcs.writeObject(A);
            fcs.flush();
        } catch (IOException ex) {
            showMessageDialog(this,"ERROR");}
    }
    
    private void leerProveedores() {
        try {
            FileInputStream flujoBytes = new FileInputStream("PROVEEDORES.VET"); //flujo de Bytes
            fce = new ObjectInputStream(flujoBytes); //flujo de objetos
            P = (Proveedor[]) fce.readObject();

            // Agregar los clientes al combo box
            for (Proveedor proveedor : P) {
                if (proveedor == null) {
                    return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
                }
                String item = proveedor.getID() + " - " + proveedor.getNombre();
                jcbProveedor.addItem(item);
            }

        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error el archivo no se encontro");
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(this, "Error");
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
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaArticulos().setVisible(true);
            }
        });
    }
    
    private Articulo A[]=new Articulo[30];
    
    private int ID,min,max,pos=-1,a=0,can=0;
    private String name,desc,prov,sec,IDB;
    private double precio;
    private DefaultTableModel m;
    private File archivo = new File("ARTICULOS.VET");
    private ObjectOutputStream fcs;//flujo de objetos de escritura
    private ObjectInputStream fce;//flujo de objetos de lectura
    private Proveedor P[] = new Proveedor[30];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbProveedor;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTable tblArticulos;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
