
package eva2_20_vehiculo;


public class Automovil extends Vehiculo {
  private String modelo;
  private String motor;
  
public Automovil(){
    this.modelo = "";
    this.motor = "";
}
public Automovil(String modelo, String motor, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    
  @Override
  public String toString (){
    return super.toString() + "\nModelo: " + modelo + "\n" +
            "Motor: " + motor;
}
  
}
