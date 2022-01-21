
package ArbolBinario;
import datos.*;

public class Nodo{
    private Ordenar orden;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(Ordenar orden) {
        this.orden = orden;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Ordenar getOrden() {
        return orden;
    }

    public void setOrden(Ordenar orden) {
        this.orden = orden;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }


}