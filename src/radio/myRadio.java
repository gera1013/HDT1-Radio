/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    double favs[] = new double[12];
    
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
        int nuevaPos = 0;
        nuevaPos = nuevaPos - 1;
        double frecuencia = favs[nuevaPos];
        return frecuencia;
    }

    @Override
    public boolean cambiarAmFm() {
        if(Emisora.equalsIgnoreCase("AM")){
            Emisora = "FM";
        }
        else if(Emisora.equalsIgnoreCase("FM")){
            Emisora = "AM";
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //@Override
    //public void encendidoRadio(boolean onoff) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    @Override
    public void setFavorito(double frecuencia, int posicion) {
        int nuevaPos = 0;
        nuevaPos = nuevaPos - 1;
        favs[nuevaPos] = frecuencia;
    }
}
