package tests;

// TP sin terminar. Agregar más métodos y cambiar la forma del metodo mostrar.

import interfaces.ILista;
import modelos.Persona;
import modelos.Vehiculo;

public class TestPersonaVehiculos {

    public static void main(String[] args) {

        // Personas
        Persona p1 = new Persona(32543568, "Nico Perez");
        Persona p2 = new Persona(449863445,"Ximena Romero");

        // Vehiculos
        Vehiculo v1 = new Vehiculo("11AA222", "Fiat Uno");
        Vehiculo v2 = new Vehiculo("22BB333", "Fiat Pulse");
        Vehiculo v3 = new Vehiculo("33CC4444","Fiat Uno");
        Vehiculo v4 = new Vehiculo("44DD5555","Fiat Pulse");

        // Relaciono las listas de Vehiculos a la persona correspondiente:
        p1.getListaVehiculos().insertarPrimero(v1);
        p1.getListaVehiculos().insertarUltimo(v3);

        p2.getListaVehiculos().insertarUltimo(v2);
        p2.getListaVehiculos().insertarPrimero(v4);

        p1.getListaVehiculos().insertarGenerico(new Vehiculo("55EE6666","Fiat Uno"), 2);

//        ILista<Vehiculo> listaVehiculos = p1.getListaVehiculos();

        System.out.println("Agrego los primeros datos: ");

        // Muestro por pantalla:
        p1.mostrarPersona();
        p2.mostrarPersona();

        // Testeo de métodos eliminar:
        p1.getListaVehiculos().eliminarGenerico(2);
        p1.getListaVehiculos().eliminarUltimo();

        p2.getListaVehiculos().eliminarPrimero();

        // Muestro por pantalla:
        System.out.println("Elimino un vehículo dada una posicion: ");

        p1.mostrarPersona();
        p2.mostrarPersona();

        // Otros métodos:
        p1.getListaVehiculos().buscar(v2);
        p2.getListaVehiculos().buscar(v2);

    }

}