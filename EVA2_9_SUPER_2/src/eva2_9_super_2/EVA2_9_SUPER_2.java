package eva2_9_super_2;


public class EVA2_9_SUPER_2 {

    
    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes("Erick","Martinez",18, "22550311");
        estudiante.imprimirDatos();
     
        
        Docentes docente = new Docentes("Erick","Martinez",18,"Chihuahua");
        docente.imprimirDatos();
       
        
        
        Proveedor proveedor = new Proveedor("Juan","Soto",45,"GGTB123");
        proveedor.imprimirDatos();
       
    }
    
}
