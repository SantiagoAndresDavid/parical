package Examen;

public class EcuacionCuadratica extends Ecuacion implements IecuacionCuadratica {
    private double c;
    public EcuacionCuadratica() {
    }

    public EcuacionCuadratica(double a, double b, double c) {
        super(a, b );
        this.c = c;
    }

    @Override
    public String formaEcuacion() {
        return super.getA()+"x^2"+" + "+super.getB()+"x"+" + "+this.c + " = "+ "0";
    }

    @Override
    public String obtenerSolucion() {
        try {
            return "x = ± " + " "+ calcularSolcion1() + "\n" + "x = ± " +" "+ calcucularSolucion2();
        } catch (Exepciones exepciones) {
            return exepciones.getMessage();

        }

    }

    @Override
    public double calcularSolcion1() throws Exepciones {
        double discriminante= Math.pow(super.getB(), 2) - (4 * super.getA() * this.c);
        if (discriminante == 0) {
            throw new Exepciones("LA ECUACION NO TIENE SOLUCION EN LOS REALES");
        }
        if (super.getA() == 0) {
            throw new Exepciones("LA ECUACION NO SE PUEDE RESOLVER ");
        }
        return ((-super.getB()) + (Math.sqrt(discriminante))) / (2 * super.getA());
    }

    @Override
    public double calcucularSolucion2() throws Exepciones {
        double discriminante = Math.pow(super.getB(), 2) - (4 * super.getA() * this.c);
        if (discriminante == 0) {
            throw new Exepciones("LA ECUACION NO TIENE SOLUCION EN LOS REALES");
        }
        if (super.getA() == 0) {
            throw new Exepciones("LA ECUACION NO SE PUEDE RESOLVER ");
        }
        return ((-super.getB()) - (Math.sqrt(discriminante))) / (2 * super.getA());
    }
}
