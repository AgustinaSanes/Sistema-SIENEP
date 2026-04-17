package modelos.usuario;

import java.util.List;

//Clase Permiso
public class Permiso {
    private int id;
    private String descripcion;
    //Relaciones(N:N)
    private List<Rol> roles;

    //Constructor
    public Permiso(int id,String descripcion,List<Rol> roles){
        this.id=id;
        this.descripcion=descripcion;
        this.roles=roles;
    }
    //Getters
    public int getId(){return id;}
    public String getDescripcion(){return descripcion;}
    public List<Rol> getRoles(){return roles;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
    public void setRoles(List<Rol> roles){this.roles=roles;}
}
