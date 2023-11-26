/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author casti
 */
public class Cola {
    private NodoC primero;
    private NodoC ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void encolar(Object dato) {
        NodoC nuevo = new NodoC(dato);

        if (isEmpty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }
    
    public void encolarDocumento(Documento documento) {
        NodoC nuevo = new NodoC(documento);

        if (isEmpty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public Object desencolar() {
        if (isEmpty()) {
            return null;
        }

        Object dato = primero.getDato();

        primero = primero.getSiguiente();

        if (primero == null) {
            ultimo = null;
        }

        return dato;
    }
    
    public Documento desencolarDocumento() {
        if (isEmpty()) {
            return null;
        }

        Documento documento = primero.getDocumento();

        primero = primero.getSiguiente();

        if (primero == null) {
            ultimo = null;
        }

        return documento;
    }
    
    public NodoC obtenerPrimerNodo() {
        if (isEmpty()) {
            return null;
        }

        return primero;
    }
    
    public NodoC obtenerUltimoNodo() {
        if (isEmpty()) {
            return null;
        }

        return ultimo;
    }

    public Object obtenerPrimero() {
        if (isEmpty()) {
            return null;
        }

        return primero.getDato();
    }

    public int size() {
        int size = 0;

        NodoC nodoActual = primero;

        while (nodoActual != null) {
            size++;
            nodoActual = nodoActual.getSiguiente();
        }

        return size;
    }
}
