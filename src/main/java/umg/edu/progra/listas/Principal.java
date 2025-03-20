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

                // Ejercicio 1: Ordernar la lista

                  lista.ordenarAscendente();
                  System.out.println("\nLista ordenada:");
                  lista.visualizar();

         // Ejercicio 2: Unir dos listas enlazadas
                  Lista otraLista = new Lista();
                  otraLista.insertarCabezaLista(7);
                  otraLista.insertarCabezaLista(8);
                  lista.unirListas(otraLista);
                  System.out.println("\nLista unida:");
                  lista.visualizar();

         // Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
                   Lista listaPares = new Lista();
                   Lista listaImpares = new Lista();
                   lista.separarParesImpares(listaPares, listaImpares);

                  System.out.println("\nLista de pares:");
                  listaPares.visualizar();

                  System.out.println("\nLista de impares:");
                  listaImpares.visualizar();

    }

}
