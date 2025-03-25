package syahrul2309066.enkapsulasigenap; 

public class LinearEquation {
    
    private double a, b, c, d, e, f;
    
    public LinearEquation() {}

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    public void setD(double d) { this.d = d; }
    public void setE(double e) { this.e = e; }
    public void setF(double f) { this.f = f; }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
