package modelo;

public class CPU implements CPUService {
    @Override
    public int ejecutar(Proceso proceso, int tiempoAEjecutar) {
        int tiempoEjecutado = 0;
        for(int i=0; i<tiempoAEjecutar; i++){
            proceso.disminuirTiempoRestante();
            tiempoEjecutado ++;

            if(proceso.getTiempoRestante() == 0){
                break;
            }

        }
        return tiempoEjecutado;
    }

    @Override
    public int ejecutar(ProcesoPriorizable proceso, int tiempoAEjecutar) {
        int tiempoEjecutado = 0;
        for(int i=0; i<tiempoAEjecutar; i++){
            proceso.disminuirTiempoRestante();
            tiempoEjecutado ++;

            if(proceso.getTiempoRestante() == 0){
                break;
            }

        }
        return tiempoEjecutado;
    }
}
