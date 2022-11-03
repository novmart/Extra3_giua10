/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4_guia10;

import java.util.ArrayList;

/**
 *
 * @author novel
 */
public class Extra4_guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList();
        Edificio e1 = new Polideportivo("Si", 2, 4, 6);
        Edificio e2 = new Polideportivo("No", 5, 7, 9);
        Edificio j = new EdificioDeOficinas(9, 8, null, 5, 7, 9);
        Edificio g = new EdificioDeOficinas(3, 4, null, 2, 4, 6);

        listaEdificios.add(e1);
        listaEdificios.add(e2);
        listaEdificios.add(j);
        listaEdificios.add(g);
        int count = 0;
        int abierto = 0;
        for (Edificio aux : listaEdificios) {
            if (aux instanceof Polideportivo) {
                ((Polideportivo) aux).crearPoli();
                if (((Polideportivo) aux).getInstalacion().equals("S")) {
                    count++;
                } else {
                    abierto++;
                }
                aux.calcularSuperficie();
                aux.calcularVolumen();
            }

            if (aux instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux).canPersonas();
                aux.calcularSuperficie();
                aux.calcularVolumen();
            }
        }

        System.out.println("Cantidad polideportivos techados: " + count);
        System.out.println("Cantidad polideportivos abierto: " + abierto);

    }

}
