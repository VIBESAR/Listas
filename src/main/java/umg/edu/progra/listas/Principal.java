package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        
        lista.visualizar();        
        
        
        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());
        
        
        
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();

                // Ejercicio 1: Ordernar la lista de forma ascendente

                System.out.println("Lista Ascendente");
                Lista listaOrdenar = new Lista();
                listaOrdenar.insertarCabezaLista(8);
                listaOrdenar.insertarCabezaLista(3);
                listaOrdenar.insertarCabezaLista(1);
                listaOrdenar.insertarCabezaLista(5);
                listaOrdenar.insertarCabezaLista(2);

                System.out.println("Lista original:");
                listaOrdenar.visualizar();

                System.out.println("Lista ordenada:");
                listaOrdenar.visualizar();

         // Ejercicio 2: Unir dos listas enlazadas


         // Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes




    }

}
