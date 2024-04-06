package interfaz;

import mundo.A;

public class InterfazApp {
    private final A mia;
    public InterfazApp() {
        mia = new A();
        mia.getMib();
        System.out.println(mia.getMib().get(0).getVar());
        
        mia.getMib().get(0).setVar(2);
        System.out.println(mia.getMib().get(0).getVar());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazApp interfaz = new InterfazApp();
    }
    
}
