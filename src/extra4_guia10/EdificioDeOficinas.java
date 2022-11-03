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
public class EdificioDeOficinas extends Edificio {

    Scanner read = new Scanner(System.in);
    protected Integer numOfi;
    protected Integer numPersonas;
    protected Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOfi, Integer numPersonas, Integer pisos) {
        this.numOfi = numOfi;
        this.numPersonas = numPersonas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer numOfi, Integer numPersonas, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOfi = numOfi;
        this.numPersonas = numPersonas;
        this.pisos = pisos;
    }

    public Integer getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(Integer numOfi) {
        this.numOfi = numOfi;
    }

    public Integer getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Integer numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = largo * alto / 2;
        System.out.println("Superficie edificio: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        int volumen = largo * ancho * alto;
        System.out.println("Volumen edificio: " + volumen);
    }

    public void canPersonas() {
        System.out.println("Cuantas personas entran en c/u oficina:");
        this.numPersonas = read.nextInt();

        System.out.println("Cuntas oficinas hay?");
        this.numOfi = read.nextInt();
        this.pisos = this.numOfi;

        System.out.println("Entran por oficina:" + this.numPersonas);
        System.out.println("");
        System.out.println("Entran por edificio: " + this.numPersonas * this.pisos);
    }

}
