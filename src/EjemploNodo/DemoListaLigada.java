package EjemploNodo;

public class DemoListaLigada {
    public static void main(String[] args) {

        ListaLigadaADT<Perro> listaPerros = new ListaLigadaADT<>();

        Perro max = new Perro("Max", "Labrador", 3);
        Perro luna = new Perro("Luna", "Husky", 2);
        Perro rocky = new Perro("Rocky", "Chihuahua", 5);
        Perro bella = new Perro("Bella", "Poodle", 4);
        Perro coco = new Perro("Coco", "Beagle", 1);

        System.out.println("=== PRUEBAS DE LA LISTA ENLAZADA ===");

        System.out.println("\n1. ¿Está vacía la lista?");
        System.out.println(listaPerros.estaVacia());

        System.out.println("\n2. Insertar elementos al final:");
        listaPerros.agregar(max);
        listaPerros.agregarAlFinal(luna);
        listaPerros.agregarAlFinal(rocky);
        listaPerros.transversal();

        System.out.println("\n3. Insertar al inicio:");
        listaPerros.agregarAlInicio(bella);
        listaPerros.transversal();

        System.out.println("\n4. Insertar después de referencia:");
        listaPerros.agregarDespuesDe(luna, coco);
        listaPerros.transversal();

        System.out.println("\n5. Tamaño actual:");
        System.out.println("Total elementos: " + listaPerros.getTamanio());

        System.out.println("\n6. Búsqueda de elementos:");
        System.out.println("Posición de Rocky: " + listaPerros.buscar(rocky));
        System.out.println("Posición de Coco: " + listaPerros.buscar(coco));

        System.out.println("\n7. Actualizar un registro:");
        Perro rockyNuevo = new Perro("Rocky", "Pastor", 6);
        listaPerros.actualizar(rocky, rockyNuevo);
        listaPerros.transversal();

        System.out.println("\n8. Eliminar primer nodo:");
        System.out.println("Eliminado: " + listaPerros.eliminarElPrimero());
        listaPerros.transversal();

        System.out.println("\n9. Eliminar último nodo:");
        System.out.println("Eliminado: " + listaPerros.eliminarElFinal());
        listaPerros.transversal();

        System.out.println("\n10. Estado final de la lista:");
        System.out.println("Tamaño final: " + listaPerros.getTamanio());
        System.out.println("¿Vacía?: " + listaPerros.estaVacia());
        listaPerros.transversal();
    }
}