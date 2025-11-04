package interfaces;

import modelos.Persona;
import modelos.Vehiculo;

public interface ILista<T> {

    // Métodos void
    public void eliminarPrimero();
    public void eliminarUltimo();
    public void setPrimero(INodo<T> primero);

    public void insertarPrimero(T dato);
    public void insertarGenerico(T dato, int pos);
    public void insertarUltimo(T dato);

    public void mostrarLista();
    public void ordenar();    // Que reciba comparador para aumentar flexibilidad.

    // Métodos boolean
    public boolean buscar(T dato);
    public boolean esVacia();

    // Métodos int
    public int cantidadElementos();

    // Métodos T
    public T obtenerPrimero();
    public T obtenerGenerico(int pos);
    public T obtenerUltimo();

    // Otros métodos
    public INodo<T> getPrimero();
    public String eliminarGenerico(int pos);


}

