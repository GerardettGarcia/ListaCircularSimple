
package listacircular;

import javax.swing.JOptionPane;


public class ListaCircular {

    
    public static void main(String[] args) {
        lista listita=new lista();
        int opcion=0;
        String elemento;
        boolean eliminado=false;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        
                        "1. Agregar un nodo a la Lista Circular\n"
                        +"2. Eliminar un nodo de la Lista Circular\n"
                        +"3. Mostrar datos de la Lista Circular\n"
                        +"4. Numero de nodos\n"
                        +"5. \n"       
                        +"6. Salir"       
                        +"Que desea hacer","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1:
                    elemento=(JOptionPane.showInputDialog(null,
                            "Ingrese el elemento del nodo","Agregando nodo a la lista circular",
                            JOptionPane.INFORMATION_MESSAGE));
                    listita.insertar(elemento);
                    
                break;
                case 2:
                    if(!listita.listaVacia()){
                    elemento=(JOptionPane.showInputDialog(null,
                            "Ingrese el elemento del nodo a eliminar","Elimiando nodo de la lista circular",
                            JOptionPane.INFORMATION_MESSAGE));
                    eliminado=listita.eliminar(elemento);
                    if(eliminado){
                        JOptionPane.showMessageDialog(null,
                            "El elemento eliminado es:"+elemento,"Eliminando nodo de la lista circular",
                            JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,
                            "El elemento: "+elemento+" No esta en la lista","Elemento no encontrado",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                   }else{
                        JOptionPane.showMessageDialog(null,
                            "La lista no tiene elementos","Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                break;
                case 3:
                    if(!listita.listaVacia()){
                        listita.mostrarLista();
                    }else{
                        JOptionPane.showMessageDialog(null,"No existen nodos",
                        "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                       
                    
                break;
                case 4:
                  JOptionPane.showMessageDialog(null,
                            "El numero de nodos de la lista es: "+listita.tamaño,"Elimiando nodo de la lista circular",
                            JOptionPane.INFORMATION_MESSAGE);
                 break;  
                
                case 5: JOptionPane.showMessageDialog(null,"Aplicacion finalizada",
                        "Fin",JOptionPane.INFORMATION_MESSAGE);
                break;
                default: JOptionPane.showMessageDialog(null,"La opcion no esta en el menu",
                        "Incorrecto",JOptionPane.INFORMATION_MESSAGE);
            }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error"+n.getMessage());
            }
        }while(opcion!=5);
    }
    
}
