package modelos;

import interfaces.ILista;
import interfaces.IPersona;

public class Persona implements IPersona<Vehiculo> {

    private int dni;
    private String nombre;

    // ????? anidado por medio de un array modelos.Vehiculo[3]
    private ILista<Vehiculo> listaVehiculos;

    // Constructores
    public Persona() {
        this.listaVehiculos = new Lista<>();
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaVehiculos = new Lista<>();
    }

    public Persona(int dni, String nombre, ILista<Vehiculo> listaVehiculos) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaVehiculos = listaVehiculos;
    }

    // Getters & Setters

    // Métodos void
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setListaVehiculos(ILista<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    public void mostrarPersona() {

        System.out.println(this);
        listaVehiculos.mostrarLista();

    }

    // Métodos int
    public int getDni() {
        return dni;
    }

    // Métodos String
    public String getNombre() {
        return nombre;
    }

    // Métodos Lista
    public ILista<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    // ToString
    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }
}