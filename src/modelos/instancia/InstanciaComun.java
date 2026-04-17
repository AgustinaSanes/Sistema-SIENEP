package modelos.instancia;
import modelos.recordatorio.Recordatorio;
import java.util.Date;
import java.util.List;

public class InstanciaComun extends Instancia {
    private int idComun;
    //Constructor
    public InstanciaComun(int id, boolean comConfidencial, String titulo, Date fechaHora, String comentario, List<Recordatorio> recordatorios,int idComun){
        super(id,comConfidencial,titulo,fechaHora,comentario,recordatorios);
        this.idComun=idComun;
    }
    //Getters
    public int getIdComun(){return idComun;}
    //Setters
    public void setIdComun(int idComun){this.idComun=idComun;}
}
