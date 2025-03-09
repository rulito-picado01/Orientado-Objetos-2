package ar.unrn.tp0.normal;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        System.out.println("Fecha en formato largo: " + tiempo.obtenerFechaCompleta());
        System.out.println("Fecha en formato corto: " + tiempo.obtenerFechaAcortada());
    }

}
//Segun el articulo aqui cree los objetos con sus funcionalidades
//para que en el main de la orden de que hacer, utilizando las funcionalidades de la clase tiempo