import java.util.Date;
/**
 *
 * @author gdlup
 */
public class Cita {
    private String mascota;
    private int consultorio,ID;
    private Date fecha;

    public Cita() {
    }

    public Cita(String mascota, int consultorio, int ID, Date fecha) {
        this.mascota = mascota;
        this.consultorio = consultorio;
        this.ID = ID;
        this.fecha = fecha;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    
    
    
}
