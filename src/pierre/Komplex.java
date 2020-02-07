package pierre;

public class Komplex {
    double real; //real är riktiga delen av ett komplex tal
    double imag; //imag är imaginary delen av ett komplex tal
    public Komplex(double real, double imag) {
        this.real = real; //Initierar klass variabler
        this.imag = imag;
    }
    public static void main(String[] args) {
        Komplex a = new Komplex(3.0, 2.0);
        Komplex b = new Komplex(4.0, 1.0);

        Komplex c = a.multiply(b);
        Komplex d = new Komplex(7,3);

        Komplex e = a.add(b);
        Komplex f = new Komplex(7,3);

        System.out.println("a = " + a);
        System.out.println("Talet borde vara 3 + 2i:\n" + a);
        double adderad = 3.0 + 7.0 + 4.0 + 1.0;
        String adderadstr = String.valueOf(adderad) + "i";
        if (e.equals(f)) { //Måste ändras
            System.out.println("Addera fungerar");
        }
        if (c.equals(d)) { //Fungerar ej
            System.out.println("Multiply fungerar");
        }
        System.out.println("b = " + b);
        System.out.println("Re(a) = " + a.real);
        System.out.println("Im(a) = " + a.imag);
        System.out.println("a + b = " + a.add(b));
        System.out.println("a * b = "+ a.multiply(b));
        System.out.println("a to String: " + a.toString());
        System.out.println("Talet a to String borde vara: " + "3 + 2i:\n" + a.toString());
        System.out.println("Argumentet till 3+2i är " + arg(3.0, 2.0));
        if (arg(3.0, 2.0) == Math.atan(2.0/3.0)) {
            System.out.println("arg() fungerar!");
        }

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

    public static Double arg(double a1, double a2) {
        return Math.atan(a2 / a1);
    }

}