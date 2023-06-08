
import java.util.Date;


public class Tratamiento extends Mascota{
    protected String Medicinas;
    protected Date Fecha, Duracion;
    protected int id;

    public Tratamiento() {
    }
    
    public Tratamiento(String Medicinas, Date Fecha, Date Duracion, int id) {
        this.Medicinas = Medicinas;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
        this.id = id;
    }

    public String getMedicinas() {
        return Medicinas;
    }

    public void setMedicinas(String Medicinas) {
        this.Medicinas = Medicinas;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getDuracion() {
        return Duracion;
    }

    public void setDuracion(Date Duracion) {
        this.Duracion = Duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
