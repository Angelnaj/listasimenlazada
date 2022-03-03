/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareamenu;

/**
 *
 * @author zoro
 */
public class Lista {
    private Nodo inicio;
    public int tamanio;
    
    public void Lista(){
        inicio = null;
        tamanio=0;
    }
    
    public boolean esVacio(){
        return inicio == null;
 }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        
        if (esVacio()){
            inicio = nuevo;
        }else{
            Nodo aux = inicio;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
             aux.setSiguiente(nuevo);
        }
           tamanio++;
    } 
    public void eliminar(){
            inicio = null;
            tamanio = 0;
}
    public void removerUltimaPosicion(){
        int posicion = tamanio -1;
        
        if(posicion>=0){
             if(posicion==0){
            inicio = inicio.getSiguiente();
        }else{
            Nodo aux = inicio;
            for(int i=0; i<posicion -1; i++){
                aux = aux.getSiguiente();
            }
            Nodo siguiente = aux.getSiguiente();
            aux.setSiguiente(siguiente.getSiguiente());
        }
        tamanio--;
    }
    }
    public void listar(){
        if(!esVacio()){
            Nodo aux = inicio;
            int i=0;
            while(aux != null){
                System.out.println(i+"["+aux.getValor()+"] -> ");
                aux = aux.getSiguiente();
                i++;
            }
        }
}
}
