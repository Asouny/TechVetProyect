
import java.io.Serializable;


/**
 *
 * @author gdlup
 */
public class Consultorio implements Serializable{
    private String equipo, disponibilidad;
    private int capacidad, cons;
    

    public Consultorio() {
    }

    @Override
    public String toString() {
        return "Consultorio{" + "equipo=" + equipo + ", disponibilidad=" + disponibilidad + ", capacidad=" + capacidad + ", cons=" + cons + '}';
    }

    public Consultorio(String equipo, int capacidad,int cons, String disponibilidad) {
        this.equipo = equipo;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.cons = cons;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
