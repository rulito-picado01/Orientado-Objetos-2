package ar.unrn.tp0.normal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {

    public LocalDate fechaActual;

    public Tiempo() {
        this.fechaActual = LocalDate.now();
    }

    public String obtenerFechaCompleta() {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", Locale.of("es", "ES"));
        return fechaActual.format(formatoLargo);
    }

    public String obtenerFechaAcortada() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatoCorto);
    }

}
