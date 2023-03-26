package eva2_18_interfaces_herencia;


public class EVA2_18_INTERFACES_HERENCIA {

    
    public static void main(String[] args) {
        
    }
    
}
interface intA{
    void A();//implicitamente esta incluido public abstract
}
interface intB{
    void B();
}
interface intC extends intA,intB{
    void C();
}

class prueba implements intC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}