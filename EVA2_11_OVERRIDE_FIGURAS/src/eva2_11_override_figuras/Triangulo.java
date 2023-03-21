
package eva2_11_override_figuras;


public class Triangulo extends Figura{
    private double altura;
    private double base; 
  

    public Triangulo() {
        this.altura = 0;
        this.base = 0;
        
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
       
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

   
    @Override
    public double calcularArea(){
        System.out.println("TRIANGULO");
        return (base * altura)/2;
                
    }
    @Override
    public double calcularPeri(){
        return (base +  altura + Math.sqrt((base * base)+(altura *altura)) );
       
    }
}
