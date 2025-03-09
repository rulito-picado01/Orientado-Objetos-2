package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;

public class Tiempo {

    private LocalDateTime tiempo;

    public Tiempo() {
        this.tiempo = LocalDateTime.now();
    }

    public LocalDateTime getFechaActual() {
        return tiempo;
    }

}
