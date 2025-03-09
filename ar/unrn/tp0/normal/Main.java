package ar.unrn.tp0.normal;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        System.out.println("Fecha en formato largo: " + tiempo.obtenerFechaCompleta());
        System.out.println("Fecha en formato corto: " + tiempo.obtenerFechaAcortada());
    }

}
