/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2;

/**
 *
 * @author casti
 */
public class BTree {
    private Object dato;
    private NodoT root;
    private NodoT hijoIzquierdo;
    private NodoT hijoDerecho;

    public BTree(Object dato) {
        this.dato = dato;
        this.root = null;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoT getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoT hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoT getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoT hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoT getRoot() {
        return root;
    }

    public void setRoot(NodoT root) {
        this.root = root;
    }
    
     public boolean esHoja() {
        return hijoIzquierdo == null && hijoDerecho == null;
    }

    public boolean tieneHijoIzquierdo() {
        return hijoIzquierdo != null;
    }

    public boolean tieneHijoDerecho() {
        return hijoDerecho != null;
    }

    public int contarHijos() {
        int contador = 0;

        if (tieneHijoIzquierdo()) {
            contador++;
        }

        if (tieneHijoDerecho()) {
            contador++;
        }

        return contador;
    }
    
    public NodoT buscarNodo(NodoT nodo, int dato) {
        setRoot(nodo);
        if (nodo == null) {
            return null;
        }

        if (nodo.getOrden() == dato) {
            return nodo;
        } else if (dato < nodo.getOrden()) {
            return buscarNodo(nodo.getHizq(), dato);
        } else {
            return buscarNodo(nodo.getHdcha(), dato);
        }
    }
    
}
