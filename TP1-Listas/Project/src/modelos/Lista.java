package modelos;

import interfaces.ILista;
import interfaces.INodo;

public class Lista<T> implements ILista<T> {
    private INodo<T> primero;

    // Constructores
    public Lista() {
    }

    public Lista(INodo<T> primero) {
        this.primero = primero;
    }

    // Agregar @Overrides

    // Métodos void
    public void eliminarPrimero() {
        if ( esVacia() ) {
            System.out.print("La lista esta vacia.");
        }

        else {
            INodo<T> aux = new Nodo<>();

            primero.setDato(null);
        }
    }
    public void eliminarUltimo() {

    }

    public void insertarPrimero(T dato) {
        INodo<T> nuevo = new Nodo<>(dato);

        if ( !esVacia() ) {

            nuevo.setSiguiente(primero); // apunta al viejo primero.
            primero.setAnterior(nuevo); // hacemos que apunte al nuevo nodo.
            primero = nuevo; // actualizamos la referencia del primero, moviendola atras, al nuevo nodo.

        }

        else {

            nuevo.setSiguiente(primero); // primero es null
            primero = nuevo;

        }
    }
    public void insertarUltimo(T dato) {
        INodo<T> nuevo = new Nodo<>(dato);

        if ( esVacia() ) {

            primero = nuevo;

        }

        else {

            INodo<T> actual = primero;

            while (actual.getSiguiente() != null) {

                actual = actual.getSiguiente();

            }

            actual.setSiguiente(nuevo); // A la posicion final, le agrega el nuevo.
            nuevo.setAnterior(actual); // A la posicion anterior, le asigna el valor del puntero.

        }
    }
    public void insertarGenerico(T dato, int pos) {
        INodo<T> nuevoNodo = new Nodo<>(dato);

        // sino, tiraba error
        if (pos == 0) {
            insertarPrimero(dato);
        }

        else if ( !esVacia() && pos<cantidadElementos() ) {
            int contador = 0;

            // Creamos nuestro puntero y el enlace con el anterior:
            INodo<T> actual = this.primero;
            INodo<T> anterior = actual.getAnterior();

            // Desplazamos:
            while (contador < pos) {
                actual = actual.getSiguiente();
                contador++;
            }

            // Doble enlace:
            nuevoNodo.setAnterior(anterior);
            nuevoNodo.setSiguiente(actual);

            anterior.setSiguiente(nuevoNodo);
            actual.setAnterior(nuevoNodo);

        }

        else {
            // Manejar excepcion:
            System.out.println("Error: ");
        }

    }

    public void ordenar() {
        //completar

        /*
                public void ordenar(Comparator<T> cmp) {
            if (esVacia() || primero.getSiguiente() == null) return; // lista vacía o 1 elemento

            boolean intercambio;
            do {
                intercambio = false;
                INodo<T> actual = primero;
                while (actual.getSiguiente() != null) {
                    INodo<T> sig = actual.getSiguiente();
                    if (cmp.compare(actual.getDato(), sig.getDato()) > 0) {
                        // intercambiamos los datos
                        T temp = actual.getDato();
                        actual.setDato(sig.getDato());
                        sig.setDato(temp);
                        intercambio = true;
                    }
                    actual = sig;
                }
            } while (intercambio);
        }

         */
    }
    public void mostrarLista() {

        INodo<T> actual = primero;

        while (actual != null) {

            System.out.println(actual.getDato());
            actual = actual.getSiguiente();

        }

    } //Hacerla independiente del output.

    // Métodos boolean
    public boolean esVacia() {

        return primero == null;

    }
    public boolean buscar(T dato) {
        
        if ( !esVacia() ) {

            INodo<T> actual = primero;

            while (actual != null) {

                if (actual.getDato().equals(dato)) {

                    return true;

                }

                actual = actual.getSiguiente();

            }

        }

        return false;

    }

    // Métodos int
    public int cantidadElementos() {

        int contador = 0;

        INodo<T> actual = primero;

        while (actual != null) {

            contador++;
            actual = actual.getSiguiente();

        }

        return contador;

    }

    // Métodos T
    public T obtenerPrimero() {

        // Tema no visto en clase:
        if ( esVacia() ) throw new IllegalStateException("modelos.Lista vacía");
        return primero.getDato();

    }
    public T obtenerGenerico(int pos) {
        if ( !esVacia() && pos<cantidadElementos() ) {
            int contador = 0;

            INodo<T> actual = new Nodo<>();


            while (contador<pos) {
                actual.getSiguiente();
                contador++;
            }

            return actual.getDato();
        }

        else {
            System.out.println("No hay un dato en esa posicion.");
            return null;
        }

    }
    public T obtenerUltimo() {

        // Tema no visto en clase:
        if (esVacia()) throw new IllegalStateException("Lista vacia");

        INodo<T> actual = primero;

        while (actual.getSiguiente() != null) {

            actual = actual.getSiguiente();

        }

        return actual.getDato();
    }

    // Otros métodos
    public String eliminarGenerico(int pos) {
        // Ver si cumple encapsulamiento:
        if ( !esVacia() && pos<cantidadElementos()) {
            int contador = 0;

            INodo<T> actual = this.primero;

            while (contador<pos) {

                actual.getSiguiente();

                contador++;
            }

            INodo<T> anterior;
            INodo<T> siguiente;

            // Chusmear
            Vehiculo v1 = (Vehiculo) actual.getDato();
            String Patente = ((Vehiculo) actual.getDato()).getPatente();

            // Guardamos:
            siguiente = actual.getSiguiente();
            anterior = actual.getAnterior();

            // Setteamos:
            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);

            return Patente;
        }

        else {
            return "No hay un elemento en esa posicion.";
        }

    }

    // Getters & Setters
    public INodo<T> getPrimero() {
        return primero;
    }
    public void setPrimero(INodo<T> primero) {
        this.primero = primero;
    }


}