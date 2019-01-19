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
    private double amFrecuencia;
    private double fmFrecuencia;
    private String Emisora;
    private boolean OnOff;
    double[] favsFM;
    double[] favsAM;
    
    public myRadio(){
        Emisora = "FM";
        amFrecuencia = 510;
        fmFrecuencia = 87.9;
        OnOff = false;
        favsFM = new double[]{87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 
            87.9, 87.9, 87.9, 87.9, 87.9, 87.9,};
        favsAM = new double[]{510, 510, 510, 510, 510, 510, 510,
            510, 510, 510, 510, 510,};
    }
    
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
