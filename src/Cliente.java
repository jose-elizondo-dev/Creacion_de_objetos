public class Cliente {

    String nombreCliente;
    String apellidosCliente;
    int numeroCedulaCliente;
    char sexoCliente;
    String ubicacionCliente;

    Cliente(String nombreP,
            String apellidosP,
            int numeroCedulaP,
            char sexoP,
            String ubicacionP){

        nombreCliente = nombreP;
        apellidosCliente = apellidosP;
        numeroCedulaCliente = numeroCedulaP;
        sexoCliente = sexoP;
        ubicacionCliente = ubicacionP;

    }

    Cliente(String nombreP,
            String apellidosP,
            int numeroCedulaP,
            String ubicacionP){

        nombreCliente = nombreP;
        apellidosCliente = apellidosP;
        numeroCedulaCliente = numeroCedulaP;
        ubicacionCliente = ubicacionP;
    }

    Cliente(){}

    Suscripcion suscripcion = new Suscripcion();

    void Suscribirse (String suscripcionP,
                      String nombreP,
                      String apellidosP){

                    suscripcion.tipoSuscripcion = suscripcionP;
                    nombreCliente = nombreP;
                    apellidosCliente = apellidosP;
                    System.out.println(nombreCliente+ " " +apellidosCliente+ " adquirio una suscripcion " +suscripcion.tipoSuscripcion);
    }

}
