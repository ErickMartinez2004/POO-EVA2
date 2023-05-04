package eva2_24_collections;

import java.util.ArrayList;

public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        //COLLECTIONS --> CONTENEDORES
        ArrayList miArreglo = new ArrayList();
        miArreglo.add(new Persona());
        miArreglo.add(new Perro());
        miArreglo.add(new Automovil());

        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>();
        miArreglo.add(100);
        miArreglo.add(200);
        miArreglo.add(300);
        miArreglo.add(400);
        System.out.println(miArreglo2);

    }

}

class Persona {

}

class Automovil {

}

class Perro {

}
