
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orozc
 */
public class Articulos implements Serializable{
    private String Nombre,Descripcion,Proveedor;
    private int ID;
    private double precio;

    public Articulos() {
    }

    public Articulos(String Nombre, String Descripcion, String Proveedor, int ID, double precio) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Proveedor = Proveedor;
        this.ID = ID;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
            
}
