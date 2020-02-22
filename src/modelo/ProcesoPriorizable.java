package modelo;

public interface ProcesoPriorizable {
    int getDuracion();
    int getTiempoDeLlegada();
    int getTiempoRestante();
    int getPrioridad();

    void disminuirTiempoRestante();
}
