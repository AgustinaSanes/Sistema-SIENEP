package modelos.instancia;
import java.util.Date;
import java.util.List;

public class InstanciaComun extends Instancia {
    private int idComun;
    private Categoria categoria;
    //Constructor
    public InstanciaComun(int id, boolean comConfidencial, String titulo, Date fechaHora, String comentario,int idComun,Categoria categoria){
        super(id,comConfidencial,titulo,fechaHora,comentario);
        this.idComun=idComun;
        this.categoria=categoria;
    }
    //Getters
    public int getIdComun(){return idComun;}
    public Categoria getCategoria(){return categoria;}
    //Setters
    public void setIdComun(int idComun){this.idComun=idComun;}
    public void setCategoria(Categoria categoria){this.categoria=categoria;}
}
