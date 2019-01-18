/**
 * Clase RADIO que contiene el main para la simulacion.
 * Se inicia un objecto de tipo myRadio, clase que implementa la interfaz iRadio
 * 17/01/2019
 */
package radio;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Gerardo Méndez
 */
public class RADIO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".##");
        String emisora = "FM";
        double emisoraActual = 0;
        double FM = 87.9;
        double AM = 530;
        Scanner scan = new Scanner(System.in);
        System.out.println("Presiona caulquier tecla para encender el radio");
        String intro = scan.next();
        boolean On = true;
        iRadio Radio = new myRadio();
        while(On){
            if(emisora.equals("FM")){
                emisoraActual = FM;
            }
            else if(emisora.equals("AM")){
                emisoraActual = AM;
            }
            System.out.println("Ahora escuchas " + df2.format(emisoraActual) + " " + emisora);
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
                    if(emisora.equals("FM")){
                        FM = Radio.subirFrecuencia();
                    }
                    else if(emisora.equals("AM")){
                        AM = Radio.subirFrecuencia();
                    }
                    System.out.println("");
                    System.out.println("Cambiando a nueva emisora...");
                    System.out.println("");
                break;
                
                case 2:
                    if(emisora.equals("FM")){
                        FM = Radio.bajarFrecuencia();
                    }
                    else if(emisora.equals("AM")){
                        AM = Radio.bajarFrecuencia();
                    }
                    System.out.println("");
                    System.out.println("Cambiando a nueva emisora...");
                    System.out.println("");
                break;
                
                case 3:
                    if(Radio.cambiarAmFm()){
                        emisora = "FM";
                    } else{
                        emisora = "AM";
                    }
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
                    On = false;
            }
        }
    }
}
