package modelos;

import interfaces.INodo;

import java.util.*;

public class Grafo<T> {
    private List<Nodo<T>> nodos;

    public Grafo(List<Nodo<T>> nodos) {
        this.nodos = new ArrayList<>();
    }

    public void agregarNodo(INodo<T> nodo) {
        nodos.add((Nodo<T>) nodo);
    }

    private void bfs(INodo<T> nodoInicio) {
        Set<T> visitados = new HashSet<>();
        Queue<INodo<T>> cola = new LinkedList<>();

        cola.add(nodoInicio);
        visitados.add(nodoInicio.getDato());

        System.out.println("Recorrido BFS:");
        while (!cola.isEmpty()) {
            INodo<T> actual = cola.poll();
            System.out.print(actual.getDato() + " ");

            for (INodo<T> vecino : actual.getVecinos()) {
                T val = vecino.getDato();
                if (!visitados.contains(val)) {
                    visitados.add(val);
                    cola.add(vecino);
                }
            }
        }
        System.out.println();
    }



}