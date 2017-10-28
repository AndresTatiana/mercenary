/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenary;

/**
 *
 * @author Labing I5
 */
public class EspacioBorde extends Espacio {

    public EspacioBorde() {
    }

    @Override
    public void imprima() {
        System.out.print("x");
    }

    @Override
    public boolean isVacio() {
        return false;
    }
    
}
