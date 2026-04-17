package modelos.instancia;

import modelos.recordatorio.Recordatorio;
import java.util.Date;
import java.util.List;

//Clase Indicencia
public class Incidencia extends Instancia{
    private int idIncidencia;
    private List<String> involucrados;
    private String lugar;

    //Constructor
    public Incidencia(int id, boolean comConfidencial, String titulo, Date fechaHora, String comentario,
                      List<Recordatorio> recordatorios, int idIncidencia, List<String> involucrados, String lugar){
        super(id,comConfidencial,titulo,fechaHora,comentario,recordatorios);
        this.idIncidencia=idIncidencia;
        this.involucrados=involucrados;
        this.lugar=lugar;
    }

    //Getters
    public int getIdIncidencia(){return idIncidencia;}
    public List<String> getInvolucrados(){return involucrados;}
    public String getLugar(){return lugar;}
    //Setters
    public void setIdIncidencia(int idIncidencia){this.idIncidencia=idIncidencia;}
    public void setInvolucrados(List<String> involucrados){this.involucrados=involucrados;}
    public void setLugar(String lugar){this.lugar=lugar;}
}
