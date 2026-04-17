package modelos.instancia;
import modelos.recordatorio.Recordatorio;
import java.util.Date;
import java.util.List;

public abstract class Instancia {
    protected int id;
    protected boolean comConfidencial;
    protected String titulo;
    protected Date fechaHora;
    protected String comentario;
    //Relaciones (1:N)
    List<Recordatorio> recordatorios;

    public Instancia(int id,boolean comConfidencial,String titulo, Date fechaHora,String comentario, List<Recordatorio> recordatorios){
        this.id=id;
        this.comConfidencial=comConfidencial;
        this.titulo=titulo;
        this.fechaHora=fechaHora;
        this.comentario=comentario;
        this.recordatorios=recordatorios;
    }
    //Getters
    public int getId(){return id;}
    public boolean getComConfidencial(){return comConfidencial;}
    public String getTitulo(){return titulo;}
    public Date getFechaHora(){return fechaHora;}
    public String getComentario(){return comentario;}
    public List<Recordatorio> getRecordatorios(){return recordatorios;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setComConfidencial(boolean comConfidencial){this.comConfidencial=comConfidencial;}
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setFechaHora(Date fechaHora){this.fechaHora=fechaHora;}
    public void setComentario(String comentario){this.comentario=comentario;}
    public void setRecordatorios(List<Recordatorio> recordatorios){this.recordatorios=recordatorios;}
}
