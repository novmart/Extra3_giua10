/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4_guia10;

import java.util.Scanner;

/**
 *
 * @author novel
 */
public class Polideportivo extends Edificio{
    Scanner read = new Scanner(System.in); 
    protected String instalacion; 
     

    public Polideportivo() {
    }

    public Polideportivo(String instalacion) {
        this.instalacion = instalacion;
    }

    public Polideportivo(String instalacion, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.instalacion = instalacion;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

  
    
    
    @Override
    public void calcularSuperficie(){
         int superficie = largo * alto / 2;
         System.out.println("Superficie polideportivo: " + superficie);
    }
    
    @Override
    public void calcularVolumen(){
        int volumen = largo * ancho * alto; 
        System.out.println("Volumen polideportivo : " + volumen);
    }
    
    public String crearPoli(){
        
        System.out.println("Es techado? S/N");
       instalacion = read.next(); 
        
        return instalacion; 
        
    }
    
    
}
