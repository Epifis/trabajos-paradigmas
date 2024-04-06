package mundo;

import java.util.ArrayList;

public class A {
    private ArrayList<B> mib;
    public A() {
        mib = new ArrayList<>();
        mib.add(new B(1));
    }
    public void setMib(ArrayList<B> mib) {
        this.mib = mib;
    }
    public ArrayList<B> getMib() {
        return mib;
    }
}
