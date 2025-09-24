import  java.io.*;
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Cliente registroCliente1 = new Cliente("Jose", "Elizondo Romero", 221312198, 'M', "Guadalupe");

        //Logica relacionada con cliente1
        registroCliente1.Suscribirse(new Suscripcion().tipoSuscripcion = "Premium", registroCliente1.getNombreCliente(), registroCliente1.getApellidosCliente());



        Cliente registroCliente2 = new Cliente("Priscilla", "Quiros Sanchez", 324512430, "Guadalupe");
        //Logica relacionada con cliente2
        registroCliente2.Suscribirse("Premium", registroCliente2.getNombreCliente(), registroCliente2.getApellidosCliente());



        Cliente registroCliente3 = new Cliente();
        registroCliente3.setNombreCliente("Samuel");
        registroCliente3.setApellidosCliente("Araya Campos");
        //Logica relacionada con cliente3
        registroCliente3.Suscribirse("Premium", registroCliente3.getNombreCliente(), registroCliente3.getApellidosCliente());
    }
}