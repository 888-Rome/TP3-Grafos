package interfaces;

import modelos.Lista;

// Declaro como generica para mas flexibilidad.
public interface IPersona<T> {

    // Métodos void
    public void setDni(int dni);
    public void setNombre(String nombre);
    public void setListaVehiculos(ILista<T> listaVehiculos);
    public void mostrarPersona();

    // Métodos int
    public int getDni();

    // Métodos String
    public String getNombre();

    // Métodos Lista
    public ILista<T> getListaVehiculos();

}
