
package eva2_20_vehiculo;

public  abstract class Vehiculo implements ControlVelocidad{
    private int velocidad;
    private String marca;
    
    public Vehiculo(){
        
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int acelerar() {
        return velocidad = velocidad + 1;

    }

    @Override
    public int detener() {
        if (velocidad > 0){
            velocidad = 0;
        }
        return velocidad;
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad: " + velocidad);
    }
    @Override
    public String toString(){
        String datos =  "DATOS:" + "\n"+
                "Marca: " + marca;
        return datos;
     } 
}
