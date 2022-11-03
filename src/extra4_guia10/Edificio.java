/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4_guia10;

/**
 *
 * @author novel
 */
public class Edificio {
    protected Integer ancho ; 
    protected Integer alto ; 
    protected Integer largo; 

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    public void calcularSuperficie(){
        // int superficie = largo * alto / 2; 
        
        
    }
    
    public void calcularVolumen(){
        //int volumen = largo * ancho * altura; 
    }

    @Override
    public String toString() {
        return "Edifico{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    
    
    
}
