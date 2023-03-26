
package eva2_19_interfaces_figuras;


public class EVA2_19_INTERFACES_FIGURAS {

    
    public static void main(String[] args) {
        //NO SE PUEDEN INSATANCIAR
        //Figuras figura = new Figura();
        //MoatrarDatos datos = new MoatrarDatos();
        
        Circulo circu = new Circulo(20);
        circu.imprimirDatos();
        Triangulo trian = new Triangulo();
        trian.setAltura(20);
        trian.setBase(20);
        trian.imprimirDatos();
    }
    
}
