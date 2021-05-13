package Examen;
import Examen.EcuacionCuadratica;
import Examen.EcuacionLineal;

import java.util.ArrayList;
import java.util.List;

public class Libreta {
  private List<Ecuacion>listaEcuaciones;

    public Libreta() {
       this.listaEcuaciones =new ArrayList<>();
    }



    public void agregar(Ecuacion e) {
        this.listaEcuaciones.add(e);
    }

    public void mostrarEcuaciones() {
        for (Ecuacion e : listaEcuaciones) {
            System.out.println("---------------------------------");
            System.out.print("Forma general: ");
            System.out.println(e.formaEcuacion());
            System.out.print("Solucion: ");
            System.out.println(e.obtenerSolucion() + "\n");
            System.out.println("---------------------------------");
        }
    }


}
