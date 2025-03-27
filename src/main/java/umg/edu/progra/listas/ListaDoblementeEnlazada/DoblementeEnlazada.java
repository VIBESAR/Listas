package umg.edu.progra.listas.ListaDoblementeEnlazada;


 //Clase Nodo para la Lista Doblemente Enlazada
 //Representa los elementos individuales en la lista

class Node {
    int data;
    Node next;
    Node prev;


     //Constructor para crear un nuevo Nodo
     //el valor a almacenar en el nodo

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


 //Implementación de Lista Doblemente Enlazada con diversas operaciones

public class DoblementeEnlazada {
    // Variables de instancia privadas
    private Node head;
    private Node tail;
    private int size;

     //Constructor por defecto que inicializa una lista vacía

    public DoblementeEnlazada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

//Verifica si la lista está vacía

    public boolean isEmpty() {
        return size == 0;
    }


     // Inserta un nuevo nodo al final de la lista

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }


    // Inserta un nuevo nodo al inicio de la lista

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }


    //Elimina la primera ocurrencia de un nodo con el dato especificado

    public boolean delete(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                // Si el nodo a eliminar es la cabeza
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                }
                // Si el nodo a eliminar es la cola
                else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                    else head = null;
                }
                // Nodo está en medio de la lista
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }


     //Busca un nodo con el dato especificado

    public boolean search(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }

        return false;
    }


    //Muestra la lista desde la cabeza hasta la cola

    public void displayForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }


    //Muestra la lista desde la cola hasta la cabeza

    public void displayBackward() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }

        System.out.println("null");
    }


     //Cuenta el número de nodos en la lista

    public int countNodes() {
        return size;
    }


     //Inserta un nuevo nodo después de un valor específico

    public boolean insertAfter(int target, int data) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                Node newNode = new Node(data);

                newNode.next = current.next;
                newNode.prev = current;

                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }

                current.next = newNode;
                size++;
                return true;
            }
            current = current.next;
        }

        return false;
    }


      //Invierte la lista doblemente enlazada

    public void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            // Intercambiar punteros next y prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Moverse al siguiente nodo
            current = current.prev;
        }

        // Actualizar cabeza y cola
        if (temp != null) {
            head = temp.prev;
        }
    }


     //Método principal para demostración

    public static void main(String[] args) {
        DoblementeEnlazada list = new DoblementeEnlazada();

        // Demostración de operaciones de la lista
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);

        System.out.println("Mostrar Adelante:");
        list.displayForward();

        System.out.println("Mostrar Atrás:");
        list.displayBackward();

        System.out.println("Número de Nodos: " + list.countNodes());

        list.insertAfter(10, 15);
        list.reverse();

        System.out.println("Después de Invertir:");
        list.displayForward();
    }
}