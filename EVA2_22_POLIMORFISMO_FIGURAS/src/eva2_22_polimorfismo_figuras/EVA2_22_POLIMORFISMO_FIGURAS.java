package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        /*Circulo[]circulos =  new Circulo[10];
        //un arreglo en java va de la posición 0 a la N-1
        //N es la cantidad de elementos del arreglo
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo(5);//CREAMOS CADA UNO DE LOS OBJETOS 
            circulos[i].imprimirDatos();
        }*/
        Figuras[] figuras;//declaramos un arreglo, pero no lo hemos creado
        //con el Scanner capturamos por el teclado la cantidad de figuras a utilizar
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantas figuras quieres capturar?");
        int cant = input.nextInt();//nos permite capturar
        figuras = new Figuras[cant];//creamos el arreglo con la cantidad de figuras 
        //que el usuario quiere
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura:");
            System.out.println("1.Circulo, 2:Triángulo");
            int figu = input.nextInt();
            if (figu == 1) {//circulo
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            } else {//triángulo
                Triangulo trian = new Triangulo();
                System.out.println("Introduce el base: ");
                trian.setBase(input.nextDouble());
                System.out.println("Introduce el altura: ");
                trian.setAltura(input.nextDouble());
                figuras[i] = trian;
            }
        }
        //IMPRIMIR RESULTADOS
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo) {
                //System.out.println("Círculo: ");
                Circulo circu = (Circulo) figuras[i];//casting
                circu.imprimirDatos();
            } else {
                //System.out.println("Triángulo:");
                Triangulo trian = (Triangulo) figuras[i];//casting
                trian.imprimirDatos();
            }
            System.out.println("Figuras: " + i);
            System.out.println("Área: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPeri());
        }
    }

}
