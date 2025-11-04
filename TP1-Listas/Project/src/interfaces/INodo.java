package interfaces;

import modelos.Nodo;

public interface INodo<T> {

    public T getDato();
    public void setDato(T dato);

    public INodo<T> getSiguiente();
    public void setSiguiente(INodo<T> siguiente);

    public INodo<T> getAnterior();
    public void setAnterior(INodo<T> anterior);

}

