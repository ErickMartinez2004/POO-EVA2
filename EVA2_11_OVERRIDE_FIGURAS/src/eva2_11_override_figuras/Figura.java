
package eva2_11_override_figuras;


public class Figura {
    public double calcularArea(){
        return -1;
    }
    public double calcularPeri(){
        return -1;
    }
    @Override
    public String toString(){
      String datos = "Datos: \n"+
              "Area: " + calcularArea() + "\n" +
              "Perimetro: " + calcularPeri();
      return datos;
    }
}
