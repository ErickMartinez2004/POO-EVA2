
package eva2_21_polimorfismo;


public class EVA2_21_POLIMORFISMO {

   
    public static void main(String[] args) {
        Estudiantes estu = new Estudiantes("Erick","Martinez",18,"22550311");
        estu.imprimirDatos();
        
        Docentes docente = new Docentes("Martina","Chavez",22,"Tiempo completo");
        docente.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES COMO OBJETOS DE LA SUPERCLASE
        //AL REVÉS NO SE PUEDE
        //ESTOY ASIGNADO UN OBJETO DE TIPO ESTUDIANTE
        //A UNA VARIABLE DE TIPO PERSONA
        Persona perso = estu;
        //ESTOY GENERALIZANDO(SIMPLIFICADO)
        Persona perso2 = docente;
        Persona perso3 = new Persona ();
        //Es imposible convertir una persona en un estudiante 
        //no podemos agregar cosas, simplemente ocultamos propiedades 
        
        //Estudiantes estudiante = perso3;
    }
    
}
