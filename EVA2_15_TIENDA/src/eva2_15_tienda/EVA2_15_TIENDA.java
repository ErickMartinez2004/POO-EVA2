package eva2_15_tienda;

import Productos.Computadora;
import Productos.Playera;


public class EVA2_15_TIENDA {

    
    public static void main(String[] args) {
         Computadora compu = new Computadora (15.0,8,"intel","990 Gb","DELL","hola",1,13500.90,"Computadora", "Pieza");
        System.out.println(compu);
        
       Playera play = new Playera("M","Cuello V","Hugo boss","Azul",1500,"playera","pieza");
        System.out.println(play);
    }
    
}
