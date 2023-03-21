package Productos;

import SuperClases.Ropa;

public class Playera extends Ropa {

    private String talla;
    private String tipo;

    public Playera() {
        super();
        this.talla = "";
        this.tipo = "";

    }

    public Playera(String talla, String tipo, String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double precioVenta(int cant) {
        if (cant < 30) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * .8 * cant);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTalla: " + talla + "\n"
                + "Tipo: " + tipo;
    }
}
