package modelo;

public class ProcesoPriorizado extends ProcesoNormal implements ProcesoPriorizable{
    private int prioridad;

    public ProcesoPriorizado(int duracion, int tiempoDeLlegada, int prioridad){
        super(duracion, tiempoDeLlegada);
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
