
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
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

    public Object[] leer2(String tbl) {
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

    public <T> T[] leer(String tbl, Class<T> clase) {
        T[] data = (T[]) Array.newInstance(clase, 30);
        try {
            FileInputStream flujoBytes = new FileInputStream(tbl + ".obj");
            ObjectInputStream fce = new ObjectInputStream(flujoBytes);
            Object[] objData = (Object[]) fce.readObject();

            if (objData != null) {
                for (int i = 0; i < objData.length; i++) {
                    if (clase.isInstance(objData[i])) {
                        data[i] = (T) objData[i];
                    } else {
                        // Si el objeto no es del tipo especificado, puedes manejarlo como desees
                        // Por ejemplo, podrías mostrar un mensaje de error o asignar un valor predeterminado al elemento
                    }
                }
            }

            fce.close();
        } catch (FileNotFoundException ex) {
            showMessageDialog(null, "Error: el archivo no se encontró");
        } catch (IOException ex) {
            showMessageDialog(null, "Error al leer los datos");
        } catch (ClassNotFoundException ex) {
            showMessageDialog(null, "Error: la clase no se encontró");
        }
        return data;
    }


    //nuevos agregados con lo de archivos
    private ObjectOutputStream fcs; // flujo de objetos de escritura
    private ObjectInputStream fce; //flujo de objetos de lectura

}
