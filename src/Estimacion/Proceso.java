package Estimacion;

import java.util.Random;

/**
 * @author Ricardo
 */
public class Proceso extends Thread {

    public Proceso(Random gn, long tp) {
        genera = gn;
        Totalpuntos = tp;
    }

    @Override
    public void run() {
        for (long i = 0; i < Totalpuntos; i++) {
            double x = genera.nextDouble();
            double y = genera.nextDouble();
            if (distancia(x, y) <= 1) {
                puntosDentroc++;
            }
        }
    }

    private double distancia(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public long getPuntosDentroC() {
        return puntosDentroc;
    }

    public void setPuntosDentroC(long puntosDentroc) {
        this.puntosDentroc = puntosDentroc;
    }

    public long getCantidadTotal() {
        return Totalpuntos;
    }

    private long puntosDentroc = 0;
    private long Totalpuntos = 0;
    private Random genera = null;
}
