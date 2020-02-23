package simulador;

import algoritmos.Calendarizador;
import modelo.CPU;
import modelo.CPUService;
import modelo.Proceso;
import modelo.ProcesoPriorizable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimuladorCalendarizacion {
    private CPUService cpu;

    public SimuladorCalendarizacion(CPUService cpu){
        this.cpu = cpu;

    }

    public List<Integer> simular(Calendarizador calendarizador, List<Proceso> listaProcesos){
        List<Integer> stats = new ArrayList<>();
        int tiempoDeSimulacion = 0;

        while (listaProcesos.size() > 0) {

            // revisando procesos entrantes.
            Proceso procesoEntrante = getProcesoEntrante(listaProcesos, tiempoDeSimulacion);
            if(procesoEntrante != null) {
                calendarizador.planificar(procesoEntrante);
            }

            // ejecutando procesos
            cpu.ejecutar(calendarizador.getProcesoActual(), 1);
        }

        return stats;
    }

    private Proceso getProcesoEntrante(List<Proceso> listaProcesos, int tiempoDeSimulacion){
        for(Proceso proceso: listaProcesos) {
            if(proceso.getTiempoDeLlegada() == tiempoDeSimulacion){
                return proceso;
            }
        }
        return null;
    }

}
