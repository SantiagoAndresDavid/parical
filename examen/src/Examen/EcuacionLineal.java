package Examen;

public class EcuacionLineal extends Ecuacion implements IecuacionLineal {

    public EcuacionLineal() {
    }

    public EcuacionLineal(double a, double b) {
        super(a, b);
    }

    @Override
    public String formaEcuacion() {
        return super.getA() + "x =" +" "+ super.getB();
    }

    @Override
    public double CalcularSolucion() throws Exepciones {
        if (super.getA() == 0 && super.getB() == 0) {
            throw new Exepciones("LA ECUACION TIENE INFINITAS SOLUCIONES");
        }
        if (super.getA() == 0 && super.getB() != 0) {
            throw new Exepciones("LA ECUACION NO TIENE SOLUCION");
        }
        return super.getB() / super.getA();
    }

    @Override
    public String obtenerSolucion() {
        try {
            return " x = " + String.valueOf(CalcularSolucion());
        } catch (Exepciones exepciones) {
            return exepciones.getMessage();
        }

    }

}
