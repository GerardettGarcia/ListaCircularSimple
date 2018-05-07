
package listacircular;

import javax.swing.JOptionPane;


public class lista {
    nodo ultimo; //nodo auxiliar apuntador
    int tamaño;
    public lista(){ // constructor 
        ultimo= null; //puntero inicializado en null, o que al inicio no se tiene ningun valor
        
    }
    //metodo para saber cuando la lista esta vacia
    public boolean listaVacia(){
        return ultimo==null; //retorna verdadero si esta vacia y falso si esta llena
    }
    //metodo para insertar nodos
    public lista insertar(String elemento){ //recibe un elemento
        nodo nuevo= new nodo(elemento); //se crea un nuevo nodo y se le pasa elemento
        if(ultimo!=null){ //verifica si ya existe un nodo
            //en caso de ya que exista un nodo;
            nuevo.siguiente=ultimo.siguiente; //se apunta el nodo que ya se tenia al nuevo nodo
            ultimo.siguiente=nuevo;//se apunta el nuevo nodo alnodo que ya existia
        }
        //en caso de que no exista nodo;
        ultimo=nuevo; //simplemente se asigna el nuevo nodo al apuntador haciedo que se apunte a si mismo
        tamaño=tamaño+1;
        return this; //retorna un objeto de tipo lista
        //metodo para mostrar la lista
    }
    public int tamaño(){
        return tamaño;
    }
     public void mostrarLista(){
       nodo auxiliar=ultimo.siguiente; //nodo auxiliar que apunta al primer nodo ya que estaremos
                                       //en el ultimo nodo creado
       String cadena=""; //variable temporal para mostrar los elementos de la lista
       do{   //ciclo que se repite mientras llegue al primer nodo de la cadena
           cadena=cadena+"["+auxiliar.dato+"]->"; //concatena los datos de la lista
           auxiliar=auxiliar.siguiente;//mueve hacia atras   
       }while(auxiliar!=ultimo.siguiente);//condicion
        JOptionPane.showMessageDialog(null,cadena,"mostrando lista circular",
                JOptionPane.INFORMATION_MESSAGE);  
    }
     //metodo para eliminar un nodo de la lista circular
     public boolean eliminar(String elemento){
         nodo actual; //nodo temportal
         boolean encontrado=false; //variable para buscar el nodo
         actual=ultimo; //ultimo elemento ingresado
         while(actual.siguiente!=ultimo && !encontrado) { //mienrtas el puntero que esta despues del ultimo
             encontrado=(actual.siguiente.dato==elemento); //cuando encontro el dato
             if(!encontrado){//si no lo encontro
                 actual=actual.siguiente;//recorre la lista 
             }
         }
         encontrado=(actual.siguiente.dato==elemento); //cuando encontro el dato
         if(encontrado){
             nodo auxiliar=actual.siguiente; //nodo para reacomodar los elementos de la lista
                 if(ultimo==ultimo.siguiente){//si solo existe un nodo y se quiere eliminar
                     ultimo=null; //la lista esta vacia
                 }else{//si hay mas nodo
                     if(auxiliar==ultimo){
                         ultimo=actual;
                     }
                     actual.siguiente=auxiliar.siguiente; //reacomoda la lista
                 } 
                 auxiliar=null; //borra l dato
         }
         return encontrado==true;// si lo encontro y lo elimino
     }
     
    
}

