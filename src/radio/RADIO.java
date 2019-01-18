 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.util.Scanner;

/**
 *
 * @author Gerardo Méndez
 */
public class RADIO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double emisoraActual = 87.9;
        Scanner scan = new Scanner(System.in);
        System.out.println("Presiona caulquier tecla para encender el radio");
        String intro = scan.next();
        boolean On = true;
        myRadio Radio = new myRadio();
        while(On){
            System.out.println("Ahora escuchas " + emisoraActual + " " + Radio.Emisora);
            System.out.println("");
            System.out.println("PRESIONA 1 para adelantar frecuencia");
            System.out.println("PRESIONA 2 para retroceder frecuencia");
            System.out.println("PRESIONA 3 para cambiar de emisora");
            System.out.println("PRESIONA 4 para agregar favorito");
            System.out.println("PRESIONA 5 para sintonizar favorito");
            System.out.println("PRESIONA 6 para apagar");
            System.out.println("");
            int eleccion = scan.nextInt();
            while(eleccion > 6 || eleccion < 0){
                System.out.println("Esa tecla no hace nada...");
                System.out.println("");
                System.out.println("PRESIONA 1 para adelantar frecuencia");
                System.out.println("PRESIONA 2 para retroceder frecuencia");
                System.out.println("PRESIONA 3 para cambiar de emisora");
                System.out.println("PRESIONA 4 para agregar favorito");
                System.out.println("PRESIONA 5 para sintonizar favorito");
                System.out.println("PRESIONA 6 para apagar");
                System.out.println("");
                eleccion = scan.nextInt();
            }
            switch(eleccion){
                case 1:
                    emisoraActual = Radio.subirFrecuencia();
                    System.out.println("");
                    System.out.println("Cambiando a nueva emisora...");
                    System.out.println("");
                break;
                
                case 2:
                    emisoraActual = Radio.bajarFrecuencia();
                    System.out.println("");
                    System.out.println("Cambiando a nueva emisora...");
                    System.out.println("");
                break;
                
                case 3:
                    Radio.cambiarAmFm();
                    System.out.println("");
                break;
                
                case 4:
                    System.out.println("");
                    System.out.println("Ingrese el numero en donde archivara la frecuencia");
                    int numero = scan.nextInt();
                    Radio.setFavorito(emisoraActual, numero);
                    System.out.println("");
                    System.out.println("Frecuencia almacenada exitosamente");
                break;
                
                case 5:
                    System.out.println("");
                    System.out.println("Ingrese el numero de favorito deseado");
                    int posicion = scan.nextInt();
                    emisoraActual = Radio.getFavorito(posicion);
                break;
                
                case 6:
                    System.out.println("");
                    System.out.println("Apagando radio...");
                    System.out.println("");
                    System.out.close();
            }
        }
    }
}
