package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        Automovil auto = new Automovil("Tesla", 0, "x", 2020);
        cambiarVelocidad(auto, 20);

        Bicicleta bici = new Bicicleta("Montaña", "XXX", "RH", 0);
        cambiarVelocidad(bici, 50);

    }

    public static void cambiarVelocidad(DatosVehiculo vehi, int vel) {
        vehi.acelerar(vel);
        vehi.tablero();
    }

}

interface DatosVehiculo {

    public abstract void acelerar(int cambio);

    void tablero();
}

class Vehiculo {

    private String marca;
    protected int velocidad;

    public Vehiculo() {
        this.marca = "-------";
        this.velocidad = 0;
    }

    public Vehiculo(String marca, int velocidad) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //la velocidad se modifica en acelerar 
    public int getVelocidad() {
        return velocidad;
    }

}

class Automovil extends Vehiculo implements DatosVehiculo {

    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "-----";
        this.año = 0;

    }

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if (cambioVel >= 0) {
            velocidad = cambioVel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de automovil: " + getVelocidad());
    }

}

class Bicicleta extends Vehiculo implements DatosVehiculo {

    private String tipo;
    private String rodada;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if (cambioVel >= 0) {
            velocidad = cambioVel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " + getVelocidad());
    }

}
