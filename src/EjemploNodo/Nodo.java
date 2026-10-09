package EjemploNodo;

public class Nodo<T> {
    private T valor;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T valor) {
        this.valor = valor;
    }

    public Nodo(T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return valor;
    }

    public void setDato(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", siguiente=" + siguiente +
                '}';
    }
}