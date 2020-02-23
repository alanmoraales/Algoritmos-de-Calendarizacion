package algoritmos;

import modelo.Proceso;

public interface Calendarizador {
    void planificar(Proceso proceso);
    Proceso getProcesoActual();
}
