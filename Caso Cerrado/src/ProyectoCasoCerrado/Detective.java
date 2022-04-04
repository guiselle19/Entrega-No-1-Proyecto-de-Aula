/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCasoCerrado;

/**
 *
 * @author emilse
 */
public class Detective {
    
    private long numID;
    private String nombre;
    private String apellido;
    private int añosExp;
    private Caso casosAsignados;

    public Detective() {
        
    }
    

    public Detective(long numID, String nombre, String apellido, int añosExp) {
        this.numID = numID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añosExp = añosExp;
    }
    
    

    public long getNumID() {
        return numID;
    }

    public void setNumID(long numID) {
        this.numID = numID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public Caso getCasosAsignados() {
        return casosAsignados;
    }

    public void setCasosAsignados(Caso casosAsignados) {
        this.casosAsignados = casosAsignados;
    }
    
    @Override
    public String toString(){
        return "\n\nDatos Detective"+"\nID: "+this.getNumID()+"\nNombre: "+this.getNombre()
                +"\nApellido: "+this.getApellido()+"\nAños de Experiencia: "+this.getAñosExp();
    }
    
}
