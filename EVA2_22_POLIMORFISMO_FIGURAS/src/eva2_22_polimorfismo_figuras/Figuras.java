package eva2_22_polimorfismo_figuras;

public interface Figuras {
    //no se pueden instansciar las interfaces
    //son como un conterato: estoy obligado a implementar 
    //solo metodos abstractos 
    public abstract double calcularArea();
    double calcularPeri();
}
