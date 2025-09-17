import  java.io.*;
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Cliente registroCliente1 = new Cliente("Jose", "Elizondo Romero", 221312198, 'M', "Guadalupe");

        //Logica relacionada con cliente1
        registroCliente1.Suscribirse(new Suscripcion().tipoSuscripcion = "Premium", registroCliente1.nombreCliente, registroCliente1.apellidosCliente);



        Cliente registroCliente2 = new Cliente("Priscilla", "Quiros Sanchez", 324512430, "Guadalupe");
        //Logica relacionada con cliente2
        registroCliente2.Suscribirse("Premium", registroCliente2.nombreCliente, registroCliente2.apellidosCliente);



        Cliente registroCliente3 = new Cliente();
        registroCliente3.nombreCliente = "Samuel";
        registroCliente3.apellidosCliente = "Araya Campos";
        //Logica relacionada con cliente3
        registroCliente3.Suscribirse("Premium", registroCliente3.nombreCliente, registroCliente3.apellidosCliente);
    }
}