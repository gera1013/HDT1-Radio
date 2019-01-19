/**
 * Clase myRadio para el radio de carro con los metodos definidos para las funciones de 
 * encendido, apagado, cambio de emisora, cambio de frecuencia y seleccion de frecuencias favoritas.
 * Se le agrega al objeto un array, con la funcionalidad de almacenar las frecuencias favoritas.
 * 17/01/2019
 */
package radio;

/**
 *
 * @author Gerardo Mendez
 * @author Luis Pedro Cuellar
 */
public class myRadio implements iRadio{
    private double amFrecuencia;
    private double fmFrecuencia;
    private String Emisora;
    private boolean OnOff;
    double[] favsFM;
    double[] favsAM;
    
    /** 
     * Se define el valor de los atributos
    */
    public myRadio(){
        Emisora = "FM";
        amFrecuencia = 530;
        fmFrecuencia = 87.9;
        OnOff = false;
        favsFM = new double[]{87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 
            87.9, 87.9, 87.9, 87.9, 87.9, 87.9,};
        favsAM = new double[]{530, 530, 530, 530, 530, 530, 530,
            530, 530, 530, 530, 530};
    }
    
    /**
     * Adelanta la frecuencia, dependiendo si la emisora es AM o FM
     * @return regresa la nueva frecuencia 
     */
    @Override
    public double subirFrecuencia(){
        if(Emisora.equalsIgnoreCase("AM")){
            amFrecuencia = amFrecuencia + 10;
            if(amFrecuencia > 1610){
                amFrecuencia = 530;
            }
            return amFrecuencia;
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            fmFrecuencia = fmFrecuencia + 0.20;
            if(fmFrecuencia > 107.90){
                fmFrecuencia = 87.90;
            }
            return fmFrecuencia;
        }
        return 0;
    }
    
    /**
     * Retrocede la frecuencia, dependiendo si la emisora es AM o FM
     * @return nueva frecuencia
     */
    @Override
    public double bajarFrecuencia(){
        if(Emisora.equalsIgnoreCase("AM")){
            amFrecuencia = amFrecuencia - 10;
            if(amFrecuencia < 530){
                amFrecuencia = 1610;
            }
            return amFrecuencia;
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            fmFrecuencia = fmFrecuencia - 0.2;
            if(fmFrecuencia < 87.9){
                fmFrecuencia = 107.9;
            }
            return fmFrecuencia;
        }
        return 0;
    }
    
    /**
     * Seleccionar una frecuencia almacenada
     * @param posicion numero de boton que el usuario pide
     * @return frecuencia almacenada en posicion requerida
     */
    @Override
    public double getFavorito(int posicion){
        int pos = posicion;
        double frecuencia;
        pos = pos - 1;
        if(Emisora.equalsIgnoreCase("AM")){
            frecuencia = favsAM[pos];
            return frecuencia;
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            frecuencia = favsFM[pos];
            return frecuencia;
        }
        return 0;
    }

    /**
     * Cambia de emisora
     * @return true para FM o false para AM
     */
    @Override
    public boolean cambiarAmFm() {
        boolean emisora = true;
        if(Emisora.equalsIgnoreCase("AM")){
            Emisora = "FM";
            emisora = true;
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            Emisora = "AM";
            emisora = false;
        }
        return emisora;
    }

    /**
     * 
     * @return estado actual del radio
     */
    @Override
    public boolean encendidoRadio() {
        OnOff = !OnOff;
        return OnOff;
    }

    @Override
    public void setFavorito(double frecuencia, int posicion) {
        int pos = posicion;
        pos = pos - 1;
        if(Emisora.equalsIgnoreCase("AM")){
            favsAM[pos] = frecuencia;
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            favsFM[pos] = frecuencia;
        }
    }
}
