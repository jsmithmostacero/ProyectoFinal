package ArbolBinario;

import colas.Cola;
import datos.*;

public class ArbolBinario {
    private Cola cola;
    private Nodo raiz;
    private int tamaño;
    
    public ArbolBinario() {
        raiz = null;
        tamaño=0;
    }
    
    public void insertar(Ordenar paciente) {
        int dato = paciente.getPos();
        Nodo nuevo = new Nodo(paciente);
        if(raiz == null) {
            raiz = nuevo;
        } else {
            Nodo aux = raiz;
            Nodo padre = null;
            while(aux != null) {
                padre = aux;
                if(dato < aux.getOrden().getPos()) {
                    aux = aux.getIzquierdo();
                } else {
                    aux = aux.getDerecho();
                }
            }
            if(dato < padre.getOrden().getPos()) {
                padre.setIzquierdo(nuevo);
            } else {
                padre.setDerecho(nuevo);
            }
        }
        tamaño++;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public void preOrden() {
        preOrden(raiz);
    }
    
    private void preOrden(Nodo nodo) {
        if(nodo != null) {
            System.out.print(nodo.getOrden().getPos() + " ");
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }
    
    public void inOrden() {
        cola = new Cola();
        inOrden(raiz);
    }
    
    private void inOrden(Nodo nodo) {
        if(nodo != null) {
            inOrden(nodo.getIzquierdo());
            cola.encolar(nodo.getOrden().getCita());
            //System.out.print(nodo.getOrden().getPos() + " ");
            inOrden(nodo.getDerecho());
        }
    }
    
    public Cola colas(){
        return cola;  
    }
    
}
