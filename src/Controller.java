
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gdlup
 */
public class Controller {

    public void guardar(String tbl, Object[] data) {
        try {
            FileOutputStream flujoBytes = new FileOutputStream(tbl + ".obj");
            ObjectOutputStream fcs = new ObjectOutputStream(flujoBytes);
            fcs.writeObject(data);
            fcs.flush();
        } catch (IOException ex) {
            showMessageDialog(null, "Error al guardar los datos");
        }
    }

    public Object[] leer(String tbl, Class<?> clazz) {
        Object[] data = null;

        try {
            FileInputStream flujoBytes = new FileInputStream(tbl + ".obj");
            ObjectInputStream fce = new ObjectInputStream(flujoBytes);
            Object obj = fce.readObject();
            data = (Object[]) obj;

        } catch (FileNotFoundException ex) {
            showMessageDialog(null, "Error: el archivo no se encontró");
        } catch (IOException ex) {
            showMessageDialog(null, "Error de lectura del archivo");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(null, "Error: clase no encontrada");
        }
        return data;
    }

    //nuevos agregados con lo de archivos
    private ObjectOutputStream fcs; // flujo de objetos de escritura
    private ObjectInputStream fce; //flujo de objetos de lectura

}
