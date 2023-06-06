
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

    public <T> T[] eliminar(T[] arreglo, int posicion) {
    // Validar la posición
    if (posicion < 0 || posicion >= arreglo.length) {
        System.out.println("Error: posición inválida");
        return arreglo;
    }

    // Crear un nuevo arreglo con una longitud menor
    T[] nuevoArreglo = (T[]) Array.newInstance(arreglo.getClass().getComponentType(), arreglo.length - 1);

    // Copiar los elementos antes de la posición
    System.arraycopy(arreglo, 0, nuevoArreglo, 0, posicion);

    // Copiar los elementos después de la posición
    System.arraycopy(arreglo, posicion + 1, nuevoArreglo, posicion, arreglo.length - posicion - 1);

    return nuevoArreglo;
}


    //nuevos agregados con lo de archivos
    private ObjectOutputStream fcs; // flujo de objetos de escritura
    private ObjectInputStream fce; //flujo de objetos de lectura

}
