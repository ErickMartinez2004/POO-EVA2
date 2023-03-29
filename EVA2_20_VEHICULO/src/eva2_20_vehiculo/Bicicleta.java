
package eva2_20_vehiculo;

public class Bicicleta extends Vehiculo {
    private String tipo;
    private String pedales;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, String pedales, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.pedales = pedales;
    }

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo: " + tipo + "\n"+
                "Pedales: " + pedales;
    }
}
