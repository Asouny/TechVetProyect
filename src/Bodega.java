
import java.io.Serializable;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orozc
 */
public class Bodega implements Serializable{
    private int ID,Capacidad;
    private String Secciones[]= new String[30];

    public Bodega() {
    }

    public Bodega(int ID, int Capacidad, String Secciones[]) {
        this.ID = ID;
        this.Capacidad = Capacidad;
        this.Secciones = Secciones;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String[] getSecciones() {
        return Secciones;
    }

    public void setSecciones(String[] Secciones) {
        this.Secciones = Secciones;
    }
}
