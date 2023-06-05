
import java.util.Date;


public class Tratamiento extends Mascota{
    protected String Medicinas;
    protected Date Fecha,Duracion;

    public Tratamiento() {
    }
    
    public Tratamiento(String Medicinas, Date Fecha, Date Duracion) {
        this.Medicinas = Medicinas;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
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
    
    
}
