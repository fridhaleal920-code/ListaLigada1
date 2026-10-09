package EjemploNodo;

public class ListaLigadaADT<T> {
    private Nodo<T> cabeza;

    public ListaLigadaADT() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamanio() {
        int contador = 0;
        Nodo<T> aux = cabeza;

        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }

        return contador;
    }

    public void agregar(T dato) {
        agregarAlFinal(dato);
    }

    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (estaVacia()) {
            cabeza = nuevoNodo;
            return;
        }

        Nodo<T> aux = cabeza;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        aux.setSiguiente(nuevoNodo);
    }

    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato, cabeza);
        cabeza = nuevoNodo;
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }

        Nodo<T> aux = cabeza;

        while (aux != null && !aux.getDato().equals(referencia)) {
            aux = aux.getSiguiente();
        }

        if (aux == null) {
            System.out.println("Referencia no encontrada.");
            return;
        }

        Nodo<T> nuevoNodo = new Nodo<>(valor, aux.getSiguiente());
        aux.setSiguiente(nuevoNodo);
    }

    public T eliminarElPrimero() {
        if (estaVacia()) {
            return null;
        }

        T elementoEliminado = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return elementoEliminado;
    }

    public T eliminarElFinal() {
        if (estaVacia()) {
            return null;
        }

        if (cabeza.getSiguiente() == null) {
            T elementoEliminado = cabeza.getDato();
            cabeza = null;
            return elementoEliminado;
        }

        Nodo<T> aux = cabeza;

        while (aux.getSiguiente().getSiguiente() != null) {
            aux = aux.getSiguiente();
        }

        T elementoEliminado = aux.getSiguiente().getDato();
        aux.setSiguiente(null);
        return elementoEliminado;
    }

    public int buscar(T valor) {
        int idx = 0;
        Nodo<T> aux = cabeza;

        while (aux != null) {
            if (aux.getDato().equals(valor)) {
                return idx;
            }

            aux = aux.getSiguiente();
            idx++;
        }

        return -1;
    }

    public void actualizar(T aBuscar, T nuevoValor) {
        if (estaVacia()) {
            System.out.println("La lista se encuentra vacía.");
            return;
        }

        Nodo<T> aux = cabeza;

        while (aux != null) {
            if (aux.getDato().equals(aBuscar)) {
                aux.setDato(nuevoValor);
                return;
            }

            aux = aux.getSiguiente();
        }

        System.out.println("Elemento no encontrado para actualizar.");
    }

    public void transversal() {
        if (estaVacia()) {
            System.out.println("Lista Vacía");
            return;
        }

        Nodo<T> aux = cabeza;

        while (aux != null) {
            System.out.print("[ " + aux.getDato() + " ] -> ");
            aux = aux.getSiguiente();
        }

        System.out.println("null");
    }
}