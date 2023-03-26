
package eva2_17_interfaces;


public class EVA2_17_INTERFACES {

   
    public static void main(String[] args) {
        //MostraDatos datos = new MostrarDatos();
       Persona persona = new Persona("Juan Perez", 50);
       persona.imprimirDatos();
       
       Computadora compu = new Computadora("intel i7", 12, 25000,"computadora");
       compu.imprimirDatos();
    }
    
}
