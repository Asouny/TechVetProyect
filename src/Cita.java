import java.util.Date;
/**
 *
 * @author gdlup
 */
public class Cita {
    private Date fecha;

    public Cita() {
    }

    public Cita(Date fecha) {
        this.fecha = fecha;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
