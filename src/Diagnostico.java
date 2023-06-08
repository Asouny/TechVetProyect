
import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author gdlup
 */
public class Diagnostico implements Serializable{
  private String descripcion, mascota;
  private Date fecha;
  private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascotaID(String mascota) {
        this.mascota = mascota;
    }
 

    public Diagnostico() {
    }

    public Diagnostico(String descripcion, Date fecha, String mascota) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
  
  
}
