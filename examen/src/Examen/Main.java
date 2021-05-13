package Examen;

public class Main {
    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        libreta.agregar(new EcuacionLineal(50, 123));
        libreta.agregar(new EcuacionLineal(3, 15));
        libreta.agregar(new EcuacionCuadratica(2,-7,3));
        libreta.agregar(new EcuacionCuadratica(1,-5,6));
        libreta.mostrarEcuaciones();


    }
}
