package Usuarios.models;

public class Usuario {
    private int userId;
    private String nombre;
    private String correo;
    private String numeroTelefonico;
    private String semestre;

    public Usuario(){}

    public Usuario(int userId, String nombre, String correo, String numeroTelefonico, String semestre){
        this.userId = userId;
        this.nombre = nombre;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
        this.semestre = semestre;
    }

    // Setters
    public void setUserId(int userId){
        this.userId = userId;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    // Getters

    public int getUserId(){
        return this.userId;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getNumeroTelefonico(){
        return this.numeroTelefonico;
    }

    public String getSemestre(){
        return this.semestre;
    }
}