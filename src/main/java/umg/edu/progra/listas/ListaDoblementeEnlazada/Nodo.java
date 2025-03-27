package umg.edu.progra.listas.ListaDoblementeEnlazada;

public class Nodo {

    int data;
    Nodo prev;
    Nodo next;

    public Nodo(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}