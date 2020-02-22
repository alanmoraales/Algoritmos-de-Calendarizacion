package modelo;

public class ProcesoNormal implements Proceso{

    private int duracion;
    private int tiempoDeLlegada;
    private int tiempoRestante;

    public ProcesoNormal(int duracion, int tiempoDeLlegada) {
        this.duracion = duracion;
        this.tiempoDeLlegada = tiempoDeLlegada;
        this.tiempoRestante = duracion;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public int getTiempoDeLlegada() {
        return tiempoDeLlegada;
    }

    @Override
    public int getTiempoRestante() {
        return tiempoRestante;
    }

    @Override
    public void disminuirTiempoRestante() {
        tiempoRestante--;
    }
}
