package test;

import interfaces.IPersona;
import modelos.Persona;

public class TestPersona {
    public static void main(String[] args) {
        IPersona p = new Persona("Ignacio", "12345678");

        System.out.println("Nombre inicial: " + p.getNombre());
        System.out.println("DNI inicial: " + p.getDNI());

        p.setNombre("Juan");
        p.setDNI("87654321");

        System.out.println("Nombre cambiado: " + p.getNombre());
        System.out.println("DNI cambiado: " + p.getDNI());

        if (p.getNombre().equals("Juan") && p.getDNI().equals("87654321")) {
            System.out.println("Prueba de IPersona exitosa");
        } else {
            System.out.println("Error en IPersona");
        }
    }
}
