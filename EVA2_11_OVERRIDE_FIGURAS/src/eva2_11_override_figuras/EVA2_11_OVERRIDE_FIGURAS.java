
package eva2_11_override_figuras;


public class EVA2_11_OVERRIDE_FIGURAS {

    
    public static void main(String[] args) {
        Circulo circu = new Circulo ();
        System.out.println( circu.calcularArea());
        System.out.println(circu.calcularPeri());
        
       //---------------------------------------------------
        
        Triangulo trian = new Triangulo(5.0,5.0);
        System.out.println(trian.calcularArea());
        System.out.println(trian.calcularPeri());
        
        
    }
    
}
