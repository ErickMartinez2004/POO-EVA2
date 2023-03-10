
package MisClases;


public class Persona {
    private String id;
    private String nombre;
    private int edad;
    
    public void setID(String valor){
     id = valor;
}
    public void setNombre(String valor){
     nombre = valor;
}
    public void setEdad(int valor){
     edad = valor;
}
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void ImprimirDatos(){
        System.out.println("ID: " + id);
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
}
}
