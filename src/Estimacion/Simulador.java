package Estimacion;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Ricardo
 */
public class Simulador {

    private int cantHil = 0;
    private int Iter = 0;
    private LinkedList<Proceso> Hil;
    private ExecutorService threadPool;

    public Simulador(int cantHil, int I) {
        this.cantHil = cantHil;
        Iter = I;
        Hil = new LinkedList();
        threadPool = Executors.newFixedThreadPool(cantHil);
        Procesos();
    }

    public double PI() {
        iniciar();
        long totalinteriorc = 0;
        long totalPuntos = 0;
        while (!threadPool.isTerminated());///Barrera
        for (Proceso t : Hil) {
            totalinteriorc += t.getPuntosDentroC();
            totalPuntos += t.getCantidadTotal();
        }
        return 4.0 * totalinteriorc / totalPuntos;
    }

    public void iniciar() {
        for (Proceso s : Hil) {
            threadPool.execute(s);
        }
        threadPool.shutdown();
    }

    public void Procesos() {
        Random alea = new Random();
        for (int i = 0; i < cantHil; i++) {
            Hil.add(new Proceso(alea, Iter / cantHil));
        }
    }

}
