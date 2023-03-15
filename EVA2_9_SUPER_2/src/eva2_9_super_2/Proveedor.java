package eva2_9_super_2;

//Proveedor is a Persona
public class Proveedor extends Persona {

    private String rfc;
    public Proveedor(){
        super();
        this.rfc = "-------";
    }

    public Proveedor( String nombre, String apellido, int edad,String rfc) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("RFC: " + rfc);
}
}
