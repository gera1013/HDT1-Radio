/**
 * Clase myRadio para el radio de carro con los metodos definidos para las funciones de 
 * encendido, apagado, cambio de emisora, cambio de frecuencia y seleccion de frecuencias favoritas.
 * Se le agrega al objeto un array, con la funcionalidad de almacenar las frecuencias favoritas.
 * 17/01/2019
 */
package radio;

/**
 *
 * @author Gerardo
 */
public class myRadio implements iRadio{
    public double amFrecuencia = 530;
    public double fmFrecuencia = 87.90;
    public String Emisora = "FM";
    private double favs[] = new double[12];
    
    public myRadio(){
        favs[2] = 90.5;
        favs[6] = 970;
    }
    
    @Override
    public double subirFrecuencia(){
        double nuevaEmisora = 0;
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
        return nuevaEmisora;
    }
    
    @Override
    public double bajarFrecuencia(){
        double nuevaEmisora = 0;
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
        return nuevaEmisora;
    }
    
    @Override
    public double getFavorito(int posicion){
        int nuevaPos = posicion;
        nuevaPos = nuevaPos - 1;
        double frecuencia = favs[nuevaPos];
        return frecuencia;
    }

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

    //@Override
    //public void encendidoRadio(boolean onoff) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    @Override
    public void setFavorito(double frecuencia, int posicion) {
        int nuevaPos = posicion;
        nuevaPos = nuevaPos - 1;
        favs[nuevaPos] = frecuencia;
    }
}
