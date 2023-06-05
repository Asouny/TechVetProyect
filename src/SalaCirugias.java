
public class SalaCirugias {
    protected String Equipo;
    protected boolean Disponibilidad;

    public SalaCirugias() {
    }

    public SalaCirugias(String Tamaño, String Equipo, boolean Disponibilidad) {
        this.Equipo = Equipo;
        this.Disponibilidad = Disponibilidad;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    
}
