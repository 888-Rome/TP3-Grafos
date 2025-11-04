package interfaces;

public interface IGrafo<T> {
    public void agregarNodo(INodo<T> nodo);
    public void conectarNodos(INodo<T> nodo1, INodo<T> nodo2);
    public void recorridoDFS(INodo<T> inicio);
    public void recorridoBFS(INodo<T> inicio);
}
