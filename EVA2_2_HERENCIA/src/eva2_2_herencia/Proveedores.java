
package eva2_2_herencia;


public class Proveedores {
    private String nombre;
    private String apellido;
    private int edad;
    private String razonsocial;
    private String rfc;

    public Proveedores(String nombre, String apellido, int edad, String razonsocial, String rfc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.razonsocial = razonsocial;
        this.rfc = rfc;
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

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
   
}
