package UsXEvenRelaciones.models;

public class UsXEvenRelacion {
    private String userId;
    private String eventId;

    public UsXEvenRelacion(){}

    public UsXEvenRelacion(String userId, String eventId){
        this.userId = userId;
        this.eventId = eventId;
    }

    // Setters
    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setEventId(String eventId){
        this.eventId = eventId;
    }

    // Getters
    public String getUserId(){
        return this.userId;
    }

    public String getEventId(){
        return this.eventId;
    }
}