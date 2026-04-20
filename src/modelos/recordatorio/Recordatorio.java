package modelos.recordatorio;

import java.util.Date;

//Clase recordatorio
public class Recordatorio {
    private int id;
    private String titulo;
    private Date fechaHora;
    private String tipo;
    //Relacion (N:0..1)
    private Frecuencia frecuencia;

    //Constructor
    public Recordatorio(int id,String titulo,Date fechaHora, String tipo,Frecuencia frecuencia){
        this.id=id;
        this.titulo=titulo;
        this.fechaHora=fechaHora;
        this.tipo=tipo;
        this.frecuencia=frecuencia;
    }
    //Getters
    public int getId(){return id;}
    public String getTitulo(){return titulo;}
    public Date getFechaHora(){return fechaHora;}
    public String getTipo(){return tipo;}
    public Frecuencia getFrecuencia(){return frecuencia;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setFechaHora(Date fechaHora){this.fechaHora=fechaHora;}
    public void setTipo(String tipo){this.tipo=tipo;}
    public void setFrecuencia(Frecuencia frecuencia){this.frecuencia=frecuencia;}
}
