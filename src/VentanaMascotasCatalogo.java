
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
public class VentanaMascotasCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMascota
     */
    public VentanaMascotasCatalogo() {
        initComponents();
        m = (DefaultTableModel) tblMascotas.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdMascota", "Nombre", "Especie", "Edad", "Sexo", "IdCliente"
            }
        ));
        jScrollPane1.setViewportView(tblMascotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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


    private void leerMascotas() {

        M = (Mascota[]) controlador.leer("Mascotas", Mascota.class);
        Object R[] = new Object[6];
        m.setRowCount(0);
        //ciclo que si se cumple, manda a agregar a la tabla para cuando inicie el programa de nuevo
        for (int i = 0; i < M.length; i++) {
            if (M[i] == null) {
                return; //si el renglon que quiere agregar está vacío, no lo agregará y no marcará error
            }
            id = M[i].getId();
            R[0] = M[i].getId();
            R[1] = M[i].getNombre();
            R[2] = M[i].getEspecie();
            R[3] = M[i].getEdad();
            R[4] = M[i].getSexo();
            R[5] = M[i].getCliente();

            m.addRow(R);
            a++;

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
            java.util.logging.Logger.getLogger(VentanaMascotasCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMascotasCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMascotasCatalogo().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables
}
