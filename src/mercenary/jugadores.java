/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenary;

/**
 *
 * @author PERSONAL
 */
public class jugadores extends Espacio {
     int a;
     int posx;
     int posy;
    public jugadores(int j) {
        
        a=j;
    }

    
 public void imprima() {       
 System.out.print(a);
        
    }
 
    @Override
     public boolean isVacio() {
        return false;
      } 
}