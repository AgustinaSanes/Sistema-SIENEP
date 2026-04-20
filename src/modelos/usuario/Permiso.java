package modelos.usuario;

import java.util.List;

//Clase Permiso
public class Permiso {
    private int id;
    private String descripcion;

    //Constructor
    public Permiso(int id,String descripcion){
        this.id=id;
        this.descripcion=descripcion;
    }
    //Getters
    public int getId(){return id;}
    public String getDescripcion(){return descripcion;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
}
