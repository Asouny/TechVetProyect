import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author gdlup
 */
public class Pago  implements Serializable{
    private String fecha;
    private String metodo, motivo;
    private int clienteID;

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    private float monto;

    public Pago() {
    }

    public Pago(String fecha, String metodo, String motivo, float monto, int clienteID) {
        this.fecha = fecha;
        this.metodo = metodo;
        this.monto = monto;
        this.motivo = motivo;
        this.clienteID = clienteID;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}
