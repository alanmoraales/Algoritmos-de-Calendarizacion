package algoritmos;

import modelo.Proceso;

import java.util.LinkedList;
import java.util.Queue;

public class FCFS implements Calendarizador{
    private Queue<Proceso> colaListos;

    public FCFS(){
        this.colaListos = new LinkedList();
    }

    @Override
    public void planificar(Proceso proceso) {
        this.colaListos.add(proceso);
    }

    @Override
    public Proceso getProcesoActual() {
        return this.colaListos.poll();
    }
}
