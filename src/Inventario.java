
import java.io.Serializable;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orozc
 */
public class Inventario implements Serializable{
    private int Existencias,ID;
    private String Nombre,Proveedor,Clasificacion;
    public Inventario() {
    }

    public Inventario(int Existencias, int ID, String Nombre, String Proveedor, String Clasificacion) {
        this.Existencias = Existencias;
        this.ID = ID;
        this.Nombre = Nombre;
        this.Proveedor = Proveedor;
        this.Clasificacion = Clasificacion;
    }

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
}
