/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenary;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Mercenary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int A,B,armas,curas,refugios,alarga;
         Scanner Sc= new Scanner (System.in);
         System.out.println("ingrese el ancho del mapa");
         A = Sc.nextInt();
         System.out.println("ingrese el alto del mapa");
         B = Sc.nextInt();
         System.out.println("ingrese el numero de jugadores");
         jugadores jugador= new jugadores(scan.nextInt());
         if(jugador.a%2==0){
             System.out.println("su jugador pertenece al equipo 1");
         }else{
             System.out.println("su jugador pertenece al equipo 2");
         }
         System.out.println("ingrese el numero de Arma Corta");
         armas = Sc.nextInt();
         System.out.println("ingrese numero de curas");
         curas = Sc.nextInt();
         System.out.println("ingrese numero de refugios");
          refugios = Sc.nextInt();
          System.out.println("ingrese numero de Arma Larga");
          alarga = Sc.nextInt();
        Mapa m = new Mapa(A,B, jugador, armas, curas,refugios,alarga);
        m.imprimir();
        int n=100;
    while(n>=0){
        System.out.println("       ||MENU DE OPCIONES||     \n"
                + "Hacia dÃ³nde desea mover su jugador?\n"
                + "        W(arriba)\n"
                + "A(izq)            S(der)\n"
                + "        S(abajo)  ");
        System.out.println("");
        System.out.println("1. Salir del menu.");
        char c = scan.next().charAt(0);
        m.MoviJugador(c);
        m.imprimir();
        System.out.println("");
        if (c=='1'){
            break;
        }
    }
      
// TODO code application logic here

}
}    