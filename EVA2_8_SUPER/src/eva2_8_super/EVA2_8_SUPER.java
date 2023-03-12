package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {

        Animal animal = new Animal("nano", 3);

        Mamifero mamifero = new Mamifero("negro", "nano", 3);

        Canes can = new Canes();

    }

}

class Animal {

    private String nombre;
    private int peso;

    public Animal() {
        System.out.println("ITS ALIVE!!");

    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE constructor 2!!");
    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

class Mamifero extends Animal {

    private String colorPelo;

    public Mamifero() {
        //super --> apunta a la superclase
        //lo primero a llamar en un coonstructor es llamar
        //al constructor de superclase
        super(); //llamada al constructor default
        System.out.println("Soy un mamifero!!");

    }

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero constructor 2!!");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}

class Canes extends Mamifero {

    public Canes() {
        super();
        System.out.println("Soy un can");
    }

}
