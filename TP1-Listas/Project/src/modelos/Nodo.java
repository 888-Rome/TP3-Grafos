package modelos;

import interfaces.INodo;

// Generic variable T, so that the list can contain any class or type.
public class Nodo<T> implements INodo<T> {

    private T dato;
    private INodo<T> siguiente;
    private INodo<T> anterior;

    // Agregar @Overrides

    // Constructores
    public Nodo() {
        this.anterior = null;
        this.siguiente = null;
    }

    public Nodo(T dato) {
        this.anterior = null;
        this.dato = dato;
        this.siguiente = null;
    }

    // Getters & Setters
    @Override
    public INodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(INodo<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public INodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(INodo<T> siguiente) {
        this.siguiente = siguiente;
    }

}