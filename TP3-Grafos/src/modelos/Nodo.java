package modelos;

import interfaces.INodo;

import java.util.ArrayList;
import java.util.List;

public class Nodo<T> implements INodo<T> {
    private T dato;
    private List<Nodo<T>> vecinos;
    private boolean visitado;

    //constructor
    public Nodo(T dato,List<Nodo<T>> vecinos,boolean visitado){
        this.dato = dato;
        this.vecinos = new ArrayList<>();
        this.visitado = false;

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T data) {
        this.dato = dato;
    }

    public boolean fueVisitado(){
        return visitado;
    }

    public void marcarVisitado(boolean b){
        this.visitado=b;
    }

    public void agregarVecino(INodo<T> nodo){
        vecinos.add((Nodo<T>) nodo);
    }

    public List<Nodo<T>> getVecinos(){
        return vecinos;
    }

}
