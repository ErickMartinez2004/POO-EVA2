package SuperClases;

public abstract class Producto {

    private String nombre;
    private String unidad;
    private double precio;

    public Producto() {
        this.nombre = "";
        this.unidad = "";
        this.precio = 0;
    }

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double precioVenta(int cant);

    @Override
    public String toString() {
        String datos = "Datos: \n"
                + "Nombre: " + nombre + "\n"
                + "Unidad: " + unidad + "\n"
                + "Precio: " + precio + "\n"
                + "Precio de Venta: " + precioVenta(10);

        return datos;
    }

}
    