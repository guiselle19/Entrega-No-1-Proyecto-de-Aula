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
public class Bitacora {
    private Fecha fechaRegistro;
    private String observacion;

    public Bitacora() {
        
    }

    public Bitacora(Fecha fechaRegistro, String observacion) {
        this.fechaRegistro = fechaRegistro;
        this.observacion = observacion;
    }

    public Fecha getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Fecha fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    @Override
    public String toString(){
        return "\n\nBitácora de Investigación: "+this.getFechaRegistro()+"\nObservaciones: "+this.getObservacion();
    }
}
