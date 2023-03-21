
package eva2_16_protected;


public class EVA2_16_PROTECTED {

    
    
    public static void main(String[] args) {
       SuperClase objsuper = new SuperClase();
       objsuper.dato = 100;
    }
}
    class SuperClase{
        protected int dato;

    }
    class SubClase extends SuperClase{
        public void imprimirDato(){
            System.out.println("El valor del dato es: " + dato );
        }
    }

