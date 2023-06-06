
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
public class VentanaProveedoresCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaProveedores
     */
    public VentanaProveedoresCatalogo() {
        initComponents();
        m = (DefaultTableModel) tblProveedores.getModel();
        leerProveedores();
    }
    
    private void leerProveedores(){
        if (archivo.exists()) {
        try {
            FileInputStream fb= new FileInputStream("PROVEEDORES.VET");//flujo de Bytes
            fce=new ObjectInputStream(fb);//flujo de Objectos
            P=(Proveedores[]) fce.readObject();
            Object R[]=new Object[5];
            for (int i = 0; i < P.length; i++) {
                if(P[i]==null)return;
                R[0]=P[i].getID();
                R[1]=P[i].getNombre();
                R[2]=P[i].getRFC();
                R[3]=P[i].getTelefono();
                R[4]=P[i].getCorreo();
                m.addRow(R); 
                pr++;
            }
        }catch (FileNotFoundException ex){showMessageDialog(this,"ERROR");}
        catch(IOException ex){showMessageDialog(this,"ERROR");}
        catch(ClassNotFoundException ex){showMessageDialog(this,"ERROR");}
        }
    }
    
    public int buscarProveedores(int id,Proveedores E[]){
        for (int i = 0; i < pr; i++) {
            if(id==P[i].getID()){
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

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblCE = new javax.swing.JLabel();
        txtCE = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        lblRFC.setText("RFC:");

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRFCKeyPressed(evt);
            }
        });

        lblTel.setText("Telefono:");

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
        });

        lblCE.setText("Correo Electronico:");

        txtCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCEKeyPressed(evt);
            }
        });

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

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RFC", "Telefono", "Correo Electronico"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        lblID.setText("ID:");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCE, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre)
                        .addComponent(lblRFC)
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTel)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCE)
                        .addComponent(txtCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar))
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
        if(pr!=0){
            for(int i = 0; i < pr; i++) {
                if(ID==P[i].getID()){
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
    
    private void validarProveedores()throws StringException,IntegerException,IDsException{
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
        RFC = txtRFC.getText().trim().toUpperCase();
        if (RFC.length() != 12) {
            throw new StringException("El RFC no tiene 12 digitos"); 
        }
        if (!RFC.matches("[A-Z]{3}[0-9]{6}[A-Z0-9]{3}")) {
            throw new StringException("El formato no es correcto");
        }
        }catch (StringException e){
            lblRFC.setForeground(Color.red);
            txtRFC.requestFocus();
            throw e;
        }
    try{
        tel=txtTel.getText();
        if (tel.length() != 10) {
            throw new IntegerException("La longitud no es correcta"); 
        }
        if (!tel.matches("\\d+")) {
            throw new IntegerException("Debe tener solo numeros");
        }    
        }catch (StringException e){
            lblTel.setForeground(Color.red);
            txtTel.requestFocus();
            throw e;
        }
    try{
        correo=txtCE.getText();
        if (correo.isEmpty()) {
            throw new StringException("Falta ingresar el Correo Electronico");
        }
        if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new StringException("El correo electronico no cumple el formato");
        }    
        }catch (StringException e){
            lblCE.setForeground(Color.red);
            txtCE.requestFocus();
            throw e;
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
            validarID();
            validarProveedores();
            //String Nombre, String RFC, String Correo, String Telefono,int ID
            P[pr++]=new Proveedores(name,RFC,correo,tel,ID);
            Object O[]=new Object[5];
            O[0]=ID;
            O[1]=name;
            O[2]=RFC;
            O[3]=tel;
            O[4]=correo;
            m.addRow(O);
            txtID.setText("");
            txtNombre.setText("");
            txtRFC.setText("");
            txtTel.setText("");
            txtCE.setText("");
            guardarArray();
        }catch (IntegerException | NumberFormatException | IDsException | StringException e){
            showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    private void guardarArray(){
        try {
            FileOutputStream fb= new FileOutputStream("PROVEEDORES.VET");
            fcs=new ObjectOutputStream(fb);//true es para que agregue otra al final
            fcs.writeObject(P);
            fcs.flush();
        } catch (IOException ex) {
            showMessageDialog(this,"ERROR");}
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
            validarProveedores();
            name=txtNombre.getText();
            P[pos].setNombre(name);
            m.setValueAt(name,pos,1);
            RFC = txtRFC.getText();
            P[pos].setRFC(RFC);
            m.setValueAt(RFC,pos,2);
            tel = txtTel.getText();
            P[pos].setTelefono(tel);
            m.setValueAt(tel,pos,3);
            correo = txtCE.getText();
            P[pos].setCorreo(correo);
            m.setValueAt(correo,pos,4);
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
            for(int i=pos;i<pr;i++){
                P[i]=P[i+1];
                pr--;
            }//for
            guardarArray();
            txtID.setText("");
            txtNombre.setText("");
            txtRFC.setText("");
            txtTel.setText("");
            txtCE.setText("");
        }//if
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        OrdenaIDs();
        llenaTabla();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void OrdenaIDs(){
        int n=pr;
        for(int p=1;p<n;p++){//pasadas
            for(int i=0;i<n-p;i++){
                if(P[i].getID()>P[i+1].getID()){
                    Proveedores pro=new Proveedores();
                    pro=P[i];
                    P[i]=P[i+1];
                    P[i+1]=pro;
                }//if
            }//for
        }//for
    }
    public void llenaTabla(){
        for(int i=0;i<pr;i++){
            m.setValueAt(P[i].getID(),i,0);
            m.setValueAt(P[i].getNombre(),i,1);
            m.setValueAt(P[i].getRFC(),i,2);
            m.setValueAt(P[i].getTelefono(),i,3);
            m.setValueAt(P[i].getCorreo(),i,4);
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int id=Integer.parseInt(txtID.getText());
            pos=buscarProveedores(id,P);
            if(pos!=-1){
                txtNombre.setText(P[pos].getNombre());
                txtRFC.setText(P[pos].getRFC());
                txtTel.setText(P[pos].getTelefono());
                txtCE.setText(P[pos].getCorreo());
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
            }else{
                showMessageDialog(this,"Ese empleado no se encuentra registrado");
            }
        }catch(NumberFormatException e){
            showMessageDialog(this,"Falta ingresar el ID");}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        lblID.setForeground(Color.black);
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        lblNombre.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyPressed
       lblRFC.setForeground(Color.black);
    }//GEN-LAST:event_txtRFCKeyPressed

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
        lblTel.setForeground(Color.black);
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtCEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEKeyPressed
        lblCE.setForeground(Color.black);
    }//GEN-LAST:event_txtCEKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedores().setVisible(true);
            }
        });
    }
    private Proveedores P[]=new Proveedores[30];
    private int pr,ID,pos=-1;
    private String name,RFC,correo,tel;
    private DefaultTableModel m;
    private File archivo = new File("PROVEEDORES.VET");
    private ObjectOutputStream fcs;//flujo de objetos de escritura
    private ObjectInputStream fce;//flujo de objetos de lectura
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCE;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCE;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}