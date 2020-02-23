package modelo;

public interface CPUService {
    int ejecutar(Proceso proceso, int tiempoAEjecutar);
    int ejecutar(ProcesoPriorizable proceso, int tiempoAEjecutar);
}
