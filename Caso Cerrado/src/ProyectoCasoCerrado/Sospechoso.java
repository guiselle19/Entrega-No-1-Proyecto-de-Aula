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
public class Sospechoso {
    
    private long noID;
    private String nombre;
    private String alias;
    private int edad;
    private Direccion dirConocida;
    private String contextura;
    private double altura;

    public Sospechoso() {
        
    }
    

    public Sospechoso(long noID, String nombre, String alias, int edad, Direccion dirConocida, String contextura, double altura) {
        this.noID = noID;
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.dirConocida = dirConocida;
        this.contextura = contextura;
        this.altura = altura;
    }

    public long getNoID() {
        return noID;
    }

    public void setNoID(long noID) {
        this.noID = noID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirConocida() {
        return dirConocida;
    }

    public void setDirConocida(Direccion dirConocida) {
        this.dirConocida = dirConocida;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return "\n\nDatos Sospechoso:"+"\nID: "+this.getNoID()+"\nNombre: "+this.getNombre()
                +"\nAlias: "+this.getAlias()+"\nedad: "+this.getEdad()+"\nUltima Dirección Conocida: "+this.getDirConocida()
                +"\nContextura: "+this.getContextura()+"\nAltura: "+this.getAltura()+" Metros";
    }
}
