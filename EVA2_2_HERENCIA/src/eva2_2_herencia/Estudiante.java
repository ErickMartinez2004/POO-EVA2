
package eva2_2_herencia;


public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String noControl;

    public Estudiante() {
        
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.noControl = noControl;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
}
