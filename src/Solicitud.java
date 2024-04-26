import java.time.LocalTime;

public class Solicitud {
    public LocalTime hora;
    public String monedaOrigen;
    public String monedaComparar;

    public Solicitud(LocalTime hora, String monedaOrigen, String monedaComparar) {
        this.hora = hora;
        this.monedaOrigen = monedaOrigen;
        this.monedaComparar = monedaComparar;
    }

    public String getMonedaComparar() {
        return monedaComparar;
    }

    public void setMonedaComparar(String monedaComparar) {
        this.monedaComparar = monedaComparar;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
