package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;

    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    /**
     * 1 - Método para ordenar la lista de forma ascendente
     */
    public void ordenarAscendente() {
        if (primero == null || primero.enlace == null) {
            return;
        }
        Nodo actual, indice;
        int temp;
        for (actual = primero; actual != null; actual = actual.enlace) {
            for (indice = actual.enlace; indice != null; indice = indice.enlace) {
                if (actual.dato > indice.dato) {
                    temp = actual.dato;
                    actual.dato = indice.dato;
                    indice.dato = temp;
                }
            }
        }
    }

    /**
     * 2 - Método para unir dos listas enlazadas
     */
    public void unirListas(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.primero;
            return;
        }
        Nodo temp = primero;
        while (temp.enlace != null) {
            temp = temp.enlace;
        }
        temp.enlace = otraLista.primero;
    }

    // 3. Método para separar números pares e impares en dos listas enlazadas diferentes
    public void separarParesImpares(Lista listaPares, Lista listaImpares) {
        Nodo temp = primero;
        while (temp != null) {
            if (temp.dato % 2 == 0) {
                listaPares.insertarCabezaLista(temp.dato);
            } else {
                listaImpares.insertarCabezaLista(temp.dato);
            }
            temp = temp.enlace;
        }
    }
}