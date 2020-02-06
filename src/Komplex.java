import java.util.Objects;

public class Komplex {
    double real; //real är riktiga delen av ett komplex tal
    double imag; //imag är imaginary delen av ett komplex tal
    public Komplex(double real, double imag) {
        this.real = real; //Initierar klass variabler
        this.imag = imag;
    }
    public static void main(String[] args) {
        Komplex a = new Komplex(2.3, 4.5);
        Komplex b = new Komplex(3.4, 5.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Re(a) = " + a.real);
        System.out.println("Im(a) = " + a.imag);
        System.out.println("a + b = " + a.add(b));
        System.out.println("a * b = "+ a.multiply(b));
        System.out.println("a to String: " + a.toString());

    }

    public Komplex add(Komplex b) {
        Komplex a = this;
        double real = a.real + b.real;
        double imag = a.imag + b.imag;
        return new Komplex(real, imag);
    }

    public Komplex multiply(Komplex b) {
        Komplex a = this;
        double real = a.real * b.real - a.imag * b.imag;
        double imag = a.real * b.imag + a.imag * b.real;
        return new Komplex(real, imag);
    }

    public String toString() {
        if (imag == 0) return real + "";
        if (real == 0) return imag + "i";
        if (imag <  0) return real + " - " + (-imag) + "i";
        return real + " + " + imag + "i";
    }

    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Komplex that = (Komplex) x;
        return (this.real == that.real) && (this.imag == that.imag);
    }


}