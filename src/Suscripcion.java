public class Suscripcion {

    String tipoSuscripcion = "Gratuita";
    int costoSuscripcion;
    char periodicidadSuscripcion = 'M';

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

}
