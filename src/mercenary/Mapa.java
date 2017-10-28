/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenary;

import java.util.Random;

/**
 *
 * @author David
 */
public class Mapa {
     static Espacio espacios[][]; 
    int alto=0;
    int ancho=0;
     static jugadores jugadores;
    Random r= new Random();
    private int armas;
    private int curas;
   
    Mapa(int alto, int ancho,jugadores jugador,int armas, int curas, int refugios,int alarga) {
        this.alto=alto+2;
        this.ancho =ancho+2;
        this.curas = curas;
        espacios = new Espacio[alto][ancho];
        this.jugadores=jugador;
        espacios=new Espacio[this.alto][this.ancho];
        for(int i=0;i<this.alto;i++){
            for(int j=0;j<this.ancho;j++){
                if(i==0||j==0||i==this.alto-1||j==this.ancho-1)
                {
                    espacios[i][j]=new EspacioBorde();
                }
                else
                {
                    espacios[i][j]=new EspacioVacio();
                }
                
            }
        }
        
        if(jugador.a<=9)
        {
            int i=r.nextInt(this.alto-1);
            int j=r.nextInt(this.ancho-1);
            if(espacios[i][j].isVacio()){
                espacios[i][j]= new jugadores(jugador.a);
                jugadores.posx=i;
                jugadores.posy=j;
            }
        }
        int a=0;
        while(a<armas)
        {
            int i=r.nextInt(this.alto-1);
            int j=r.nextInt(this.ancho-1);
            if(espacios[i][j].isVacio()){
                espacios[i][j]= new Espacioarmas();
                a++;
            }
        }
  
         int t=0;
        while(t<curas)
        {
            int i=r.nextInt(this.alto-1);
            int j=r.nextInt(this.ancho-1);
            if(espacios[i][j].isVacio()){
                espacios[i][j]= new Espaciocuras();
                t++;
            }
        }
 
     int g =0;
        while(g<refugios)
        {
            int i=r.nextInt(this.alto-1);
            int j=r.nextInt(this.ancho-1);
            if(espacios[i][j].isVacio()){
                espacios[i][j]= new refugios();
                g++;
            }
        }
     int h =0;
        while(h<alarga)
        {
            int i=r.nextInt(this.alto-1);
            int j=r.nextInt(this.ancho-1);
            if(espacios[i][j].isVacio()){
                espacios[i][j]= new alarga();
                h++;
            }
        }   
 }   
    
   

   public void imprimir() {
        for(int i=0;i<alto;i++){
            for(int j=0;j<ancho;j++){
                espacios[i][j].imprima();
            }
            System.out.println(); //ESTO ES UN CAMBIO DE LINEA
        }
    }
       
     public void MoviJugador(char c){
         int xactual=jugadores.posx;
         int yactual=jugadores.posy;
         switch(c){
             case 'd':{
                 int siguienteposicion=yactual+1;
                 if(siguienteposicion<ancho && espacios[xactual][siguienteposicion].isVacio()){
                     espacios[xactual][yactual]=new EspacioVacio();
                     espacios[xactual][siguienteposicion]=jugadores;
                     jugadores.posy=siguienteposicion;
                 }
                 break;
             }
             case 'a': {
                 int siguienteposicion=yactual-1;
                 if(siguienteposicion<ancho && espacios[xactual][siguienteposicion].isVacio()){
                     espacios[xactual][yactual]=new EspacioVacio();
                     espacios[xactual][siguienteposicion]=jugadores;
                     jugadores.posy=siguienteposicion;     
                  }
                 break;
             }
             case 'w': {
                 int siguienteposicion=xactual-1;
                 if(siguienteposicion<alto && espacios[siguienteposicion][yactual].isVacio()){
                     espacios[xactual][yactual]=new EspacioVacio();
                     espacios[siguienteposicion][yactual]=jugadores;
                     jugadores.posx=siguienteposicion;
             }
                 break;
             }
             case 's': {
                 int siguienteposicion=xactual+1;
                 if(siguienteposicion<alto && espacios[siguienteposicion][yactual].isVacio()){
                     espacios[xactual][yactual]=new EspacioVacio();
                     espacios[siguienteposicion][yactual]=jugadores;
                     jugadores.posx=siguienteposicion;
             }
                 break;
             }
         }
     }
}

