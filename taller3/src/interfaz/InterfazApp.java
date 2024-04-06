package interfaz;

import mundo.A;

public class InterfazApp {
    private final A mia;
    public InterfazApp() {
        mia = new A();
        System.out.println(mia.getMib()[0].getVar());
        // Modificar la variable "var" de la clase "B"
        mia.getMib()[0].setVar(20);
        System.out.println(mia.getMib()[0].getVar());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazApp interfaz = new InterfazApp();
    }
    
}
