/**
 * Encabezado
 */
package radio;

/**
 *
 * @author Gerardo
 */

public interface iRadio {
    /**
     * @param onoff indica si el radio esta encendido o apagado
     */
    void encendidoRadio(boolean onoff);
    
    /**
     * @param frecuencia la frecuencia actual del radio 
     * @param emisora la emisora actual del radio 
     * @return nueva frecuencia a reproducir
     */
    double subirFrecuencia(double frecuencia, String emisora);
    
    /**
     * @param frecuencia la frecuencia actual del radio 
     * @param emisora la emisora actual del radio 
     * @return nueva frecuencia a reproducir
     */
    double bajarFrecuencia(double frecuencia, String emisora);
    
    /**
     * @param frecuencia la frecuencia actual del radio 
     * @param emisora la emisora actual del radio 
     * @param posicion numero del boton en donde se guardara la frecuencia
     */
    void setFavorito(double frecuencia, String emisora, int posicion);
    
    /**
     * @param emisora la frecuencia actual del radio 
     * @param posicion numero del boton en donde se encuentra almacenada la frecuencia 
     * @return frecuencia almacenada
     */
    double getFavorito(String emisora, int posicion);
}
