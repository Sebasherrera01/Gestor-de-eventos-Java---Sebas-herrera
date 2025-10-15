package Eventos.models;

public class Evento {
    private int eventoId;
    private String fechaCreacion;
    private String nombre;
    private int cupos;
    private String inscritos;

    public Evento(){}

    public Evento(int eventoId, String fechaCreacion, String nombre, int cupos, String inscritos){
        this.eventoId = eventoId;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.cupos = cupos;
        this.inscritos = inscritos;
    }

    // Setters
    public void setEventoId(int eventoId){
        this.eventoId = eventoId;
    }

    public void setFechaCreacion(String fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCupos(int cupos){
        this.cupos = cupos;
    }

    public void setInscritos(String inscritos){
        this.inscritos = inscritos;
    }

    // Getters

    public int getEventoId(){
        return this.eventoId;
    }
    
    public String getFechaCreacion(){
        return this.fechaCreacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCupos(){
        return this.cupos;
    }

    public String getInscritos(){
        return this.inscritos;
    }
}