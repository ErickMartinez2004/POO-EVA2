package eva2_3_extends;

public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiantes estu = new Estudiantes();
        estu.setNombre("Juan");
        estu.setApellido("Perez");
        estu.setEdad(20);
        estu.setNoControl("22550311");

        System.out.println("IMPRIMIR DATOS: ");
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("Numero de Control: " + estu.getNoControl());

        //----------------------------------------------------------------
        Proveedor prove = new Proveedor();
        prove.setNombre("Erick");
        prove.setApellido("Martinez");
        prove.setEdad(30);
        prove.setRfc("gagafag");

        System.out.println("IMPRIMIR DATOS: ");
        System.out.println("Nombre: " + prove.getNombre());
        System.out.println("Apellido: " + prove.getApellido());
        System.out.println("Edad: " + prove.getEdad());
        System.out.println("RFC: " + prove.getRfc());
    }

}
