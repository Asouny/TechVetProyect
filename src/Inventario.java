
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
    private int Existencias;
    private String Clasificacion;
    public Inventario() {
    }

    public Inventario(int Existencias, String Clasificacion) {
        this.Existencias = Existencias;
        this.Clasificacion = Clasificacion;
    }

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
}
