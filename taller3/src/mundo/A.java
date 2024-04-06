package mundo;

public class A {
    private B[] mib;

    public A() {
        this.mib = new B[15];
        for (int i = 0; i < 15; i++) {
            this.mib[i] = new B(i); // Inicializar el atributo "var" de la clase "B"
        }
    }

    public B[] getMib() {
        return mib;
    }

    public void setMib(B[] mib) {
        this.mib = mib;
    }
}
