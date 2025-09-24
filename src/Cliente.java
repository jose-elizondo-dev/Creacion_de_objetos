public class Cliente {

    private String nombreCliente;
    private String apellidosCliente;
    private int numeroCedulaCliente;
    private char sexoCliente;
    private String ubicacionCliente;

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

                    suscripcion.setTipoSuscripcion(suscripcionP);
                    nombreCliente = nombreP;
                    apellidosCliente = apellidosP;
                    System.out.println(toString());
    }



    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public int getNumeroCedulaCliente() {
        return numeroCedulaCliente;
    }

    public char getSexoCliente() {
        return sexoCliente;
    }

    public String getUbicacionCliente() {
        return ubicacionCliente;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public void setNumeroCedulaCliente(int numeroCedulaCliente) {
        this.numeroCedulaCliente = numeroCedulaCliente;
    }

    public void setSexoCliente(char sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public void setUbicacionCliente(String ubicacionCliente) {
        this.ubicacionCliente = ubicacionCliente;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public boolean equals (Cliente clienteComparar){
        return nombreCliente.equals(clienteComparar.nombreCliente) &&
                apellidosCliente.equals(clienteComparar.apellidosCliente) &&
                numeroCedulaCliente == clienteComparar.numeroCedulaCliente &&
                sexoCliente == clienteComparar.sexoCliente &&
                ubicacionCliente.equals(clienteComparar.ubicacionCliente);
    }

    public String toString(){
        return nombreCliente+ " " +apellidosCliente+ " adquirio una suscripcion " +suscripcion.getTipoSuscripcion();
    }

}
