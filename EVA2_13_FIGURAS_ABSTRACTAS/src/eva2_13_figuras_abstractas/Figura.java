
package eva2_13_figuras_abstractas;


public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPeri();
    @Override
    public String toString(){
      String datos = "Datos: \n"+
              "Area: " + calcularArea() + "\n" +
              "Perimetro: " + calcularPeri();
      return datos;
    }
}
