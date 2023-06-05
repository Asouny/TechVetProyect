
import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author gdlup
 */
public class Diagnostico implements Serializable{
  private String descripcion, fecha;
  private int mascotaID;

    public int getMascotaID() {
        return mascotaID;
    }

    public void setMascotaID(int mascotaID) {
        this.mascotaID = mascotaID;
    }
 

    public Diagnostico() {
    }

    public Diagnostico(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
  
  
}
