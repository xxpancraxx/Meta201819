package Practica1;
import Functions.*;

public class main {

    public static void main (String[] args) throws InterruptedException{

        matricesDE matrices = new matricesDE("cnf01.dat");
        busquedaLocal Greedy = new busquedaLocal(matrices.getDimension());

        System.out.print(Greedy.enfriamientoSolucion(matrices.getfluxMatrix(), matrices.getdistMatrix()));

    }

}