/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCasoCerrado;

import java.util.Arrays;

/**
 *
 * @author emilse
 */
public class Caso {
    private long numCaso;
    private String descri;
    private String codPriori;
    private Detective detectives;
    private String nomClave;
    private Sospechoso[] sospe;
    private Bitacora libreta;

    public Caso() {
        
    }

    public Caso(long numCaso, String descri, String codPriori, Detective detectives, String nomClave, Sospechoso [] sospe, Bitacora libreta) {
        this.numCaso = numCaso;
        this.descri = descri;
        this.codPriori = codPriori;
        this.detectives = detectives;
        this.nomClave = nomClave;
        this.sospe = sospe;
        this.libreta = libreta;
     
    }

    public long getNumCaso() {
        return numCaso;
    }

    public void setNumCaso(long numCaso) {
        this.numCaso = numCaso;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getCodPriori() {
        return codPriori;
    }

    public void setCodPriori(String codPriori) {
        this.codPriori = codPriori;
    }

    public Detective getDetectives() {
        return detectives;
    }

    public void setDetectives(Detective detectives) {
        this.detectives = detectives;
    }

    public String getNomClave() {
        return nomClave;
    }

    public void setNomClave(String nomClave) {
        this.nomClave = nomClave;
    }

    public Sospechoso[] getSospe() {
        return sospe;
    }

    public void setSospe(Sospechoso[] sospe) {
        this.sospe = sospe;
    }

    public Bitacora getLibreta() {
        return libreta;
    }

    public void setLibreta(Bitacora libreta) {
        this.libreta = libreta;
    }

    @Override
   public String toString(){
       return "\nDatos Caso"+"\nNúmero de caso: "+this.getNumCaso()+"\nDescripción: "+this.getDescri()
               +"\nCódigo de prioridad: "+this.getCodPriori()+"\nDetective Asignado: "+this.getDetectives()
               +"\n\nNombre Clave: "+this.getNomClave()+"\n\nLista de Sospechosos: "+Arrays.toString(this.getSospe())
               +this.getLibreta();
   }
     
}


