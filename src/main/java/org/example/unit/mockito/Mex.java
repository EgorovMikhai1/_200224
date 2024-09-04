package org.example.unit.mockito;

public class Mex {
    public int calc(int a, int b) {
        int x = f1(a);
        int y = f1(b);
        return x + y;
    }

    private int f1(int p) {
        return p*p;
    }
}
