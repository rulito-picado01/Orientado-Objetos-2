package ar.unrn.tp0.anemico;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        Tiempo fecha = new Tiempo();

        System.out.println(fecha.getFechaActual().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(fecha.getFechaActual().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
//Segun el articulo leido me imagino que los objetos anemicos no tienen funcionalidades
//Como en este caso, la clase Tiempo no tiene mas que un constructor y un get
//Todas las funcionalidades se realizan en el main