
package eva2_20_vehiculo;


public class EVA2_20_VEHICULO {

    
    public static void main(String[] args) {
       Automovil auto = new Automovil("Versa"," Gasolina",75,"Nissan");
       auto.acelerar();
       auto.acelerar();
       auto.acelerar();
       auto.acelerar();
       auto.acelerar();
       auto.acelerar();
       auto.acelerar();
       auto.detener();
       auto.imprimirVel();
        System.out.println(auto);
        
        Bicicleta bici = new Bicicleta("Montaña","Clip",30,"BH");
        bici.acelerar();
        bici.detener();
        bici.imprimirVel();
        System.out.println(bici);    
       
    }
    
}
