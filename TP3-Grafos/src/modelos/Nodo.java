package modelos;

// Importaciones ───────────────────────────────────────────────────────────────────────────────────────────────────────
import interfaces.INodo;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Nodo<T extends Comparable<T>> implements INodo<T> {

    // Atributos ───────────────────────────────────────────────────────────────────────────────────────────────────────
    private T dato;
    private List<INodo<T>> vecinos;
    private boolean visitado;

    // Constructor
    public Nodo(T dato){
        this.dato = dato;
        this.vecinos = new ArrayList<>();
        this.visitado = false;

    }

    // Getters
    @Override
    public T getDato() {
        return dato;
    }

    @Override
    public INodo<T>[] getVecinos() {
        return vecinos.toArray(new INodo[0]);
    }

    // Setters
    @Override
    public void setDato(T data) {
        this.dato = data;
    }

    // Métodos
    @Override
    public boolean fueVisitado(){
        return visitado;
    }

    @Override
    public void marcarVisitado(boolean b){
        this.visitado=b;
    }

    @Override
    public void agregarVecino(INodo<T> nodo){vecinos.add(nodo);}

}