
package MisClases;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setAño(int valor){
        año = valor;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    public void ImprimirDatos(){
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("AÑO: " + año);
}
}
