package modelo;

public interface Proceso {
    int getDuracion();
    int getTiempoDeLlegada();
    int getTiempoRestante();

    void disminuirTiempoRestante();
}
