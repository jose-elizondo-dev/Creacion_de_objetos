public class Suscripcion {

    String tipoSuscripcion = "Gratuita";
    private int costoSuscripcion;
    private char periodicidadSuscripcion = 'M';

    Suscripcion (String tipoP,
                 int costoP,
                 char periodicidadP){
                tipoSuscripcion = tipoP;
                costoSuscripcion = costoP;
                periodicidadSuscripcion = periodicidadP;
    }

    Suscripcion (String tipoP,
                 int costoP){
                tipoSuscripcion = tipoP;
                costoSuscripcion = costoP;
    }

    Suscripcion(){}

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public int getCostoSuscripcion() {
        return costoSuscripcion;
    }

    public char getPeriodicidadSuscripcion() {
        return periodicidadSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public void setCostoSuscripcion(int costoSuscripcion) {
        this.costoSuscripcion = costoSuscripcion;
    }

    public void setPeriodicidadSuscripcion(char periodicidadSuscripcion) {
        this.periodicidadSuscripcion = periodicidadSuscripcion;
    }

    public boolean equals (Suscripcion suscripcionComparar){
        return tipoSuscripcion.equals(suscripcionComparar.tipoSuscripcion) &&
                costoSuscripcion == suscripcionComparar.costoSuscripcion &&
                periodicidadSuscripcion == suscripcionComparar.periodicidadSuscripcion;

    }


}
