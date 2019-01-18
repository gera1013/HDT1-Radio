/**
 * Interfaz iRadio para el radio de carro con metodos sin definir
 * encendido, apagado, cambio de emisora, cambio de frecuencia y seleccion de frecuencias favoritas 
 * 17/01/2019
 */
package radio;

/**
 *
 * @author Gerardo Méndez
 */

public interface iRadio {
    /**
     * @return regresa la nueva frecuencia seleccionada 
     */
    boolean cambiarAmFm();
    
    /**
     * @param onoff indica si el radio esta encendido o apagado
     */
    //booelan encendidoRadio(boolean onoff);
    
    /** 
     * @return nueva frecuencia a reproducir
     */
    double subirFrecuencia();
    
    /**
     * @return nueva frecuencia a reproducir
     */
    double bajarFrecuencia();
    
    /**
     * @param frecuencia la frecuencia actual del radio  
     * @param posicion numero del boton en donde se guardara la frecuencia
     */
    void setFavorito(double frecuencia, int posicion);
    
    /**
     * @param posicion numero del boton en donde se encuentra almacenada la frecuencia 
     * @return frecuencia almacenada
     */
    double getFavorito(int posicion);    
}
