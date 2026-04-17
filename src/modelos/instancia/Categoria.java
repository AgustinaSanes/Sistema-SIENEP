package modelos.instancia;
import java.util.List;

public class Categoria {
    private int id;
    private String nombre;
    //Relacion(1:N)
    List<InstanciaComun> instanciasComunes;
    public Categoria(int id,String nombre,List<InstanciaComun> instanciasComunes){
        this.id=id;
        this.nombre=nombre;
        this.instanciasComunes=instanciasComunes;
    }
    //Getters
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public List<InstanciaComun> getInstanciasComunes(){return instanciasComunes;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setInstanciasComunes(List<InstanciaComun> instanciasComunes){this.instanciasComunes=instanciasComunes;}
}
