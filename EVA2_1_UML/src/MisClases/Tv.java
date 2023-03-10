
package MisClases;

public class Tv {
    private int canal;
    private int volumen;
    private int power;
    
    public void setCanal( int valor){
        canal = valor;
    }
    public void setVolumen( int valor){
        volumen = valor;
    }
    public void setPower( int valor){
        power = valor;
    }
    public int getCanal(){
        return canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getPower(){
        return power;
    
    }
    public void ImprimirDatos(){
        System.out.println("CANAL: " + canal);
        System.out.println("VOLUMEN: " + volumen);
        System.out.println("POWER: " + power);
    }
}
