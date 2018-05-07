
package listacircular;


public class nodo {
    String dato; //elemento
    nodo siguiente;  //enlace
    public nodo(String d){ //constructo recibe un dato d
        dato= d; //inicializarlo
        siguiente=this; //enlace apunta a si mismo
        
    }
}
