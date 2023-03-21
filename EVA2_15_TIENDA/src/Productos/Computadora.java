package Productos;

import SuperClases.Electronica;

public final class Computadora extends Electronica {

    private double tamaño;
    private int memoria;
    private String procesador;
    private String disco;

    public Computadora() {
        super();
        this.tamaño = 0.0;
        this.memoria = 0;
        this.procesador = "";
        this.disco = "";
    }

    public Computadora(double tamaño, int memoria, String procesador, String disco, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public double precioVenta(int cant) {
        //10 unidades --> el precio es de el 80%
        if (cant < 10) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * .8) * cant;
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nTamaño: " + tamaño + "\n"
                + "Memoria: " + memoria + "\n"
                + "Procesador: " + procesador + "\n"
                + "Disco: " + disco;
    }
}
//computadora es una clase final
//ya no se puede heredar de una clase final 
/*class Laptop extends Computadora{
    
}*/
