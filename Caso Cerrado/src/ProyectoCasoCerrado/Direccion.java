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
public class Direccion {
    
    private int numVivienda;
    private String localidad;
    private String ciudad;
    private String dpto;
    private String pais;

    public Direccion() {
        
    }

    
    public Direccion(int numVivienda, String localidad, String ciudad, String dpto, String pais) {
        this.numVivienda = numVivienda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.dpto = dpto;
        this.pais = pais;
    }

    public int getNumVivienda() {
        return numVivienda;
    }

    public void setNumVivienda(int numVivienda) {
        this.numVivienda = numVivienda;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
        return this.getLocalidad()+", Casa #"+this.getNumVivienda()
                +"\nCiudad: "+this.getCiudad()+"\nDpto: "+this.getDpto()+"\nPaís: "+this.getPais();
    }
}
