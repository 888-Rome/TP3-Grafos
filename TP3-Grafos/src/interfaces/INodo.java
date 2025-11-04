package interfaces;

import modelos.Nodo;

import java.util.List;

public interface INodo<T> {

    //Getters y setters
    public T getDato();
    public void setDato(T dato);

    public List<Nodo<T>> getVecinos();
    public void agregarVecino(INodo<T> nodo);


    public boolean fueVisitado();
    public void marcarVisitado(boolean b);
}

