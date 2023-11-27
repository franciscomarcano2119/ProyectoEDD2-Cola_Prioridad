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
public class NodoC {
    private Object dato;
    private DocumentoEncolado documento;
    private NodoC siguiente;

    public NodoC(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public NodoC(DocumentoEncolado documento) {
        this.documento = documento;
        this.siguiente = null;
    }

    public Object getDato() {
        return dato;
    }
    
     public DocumentoEncolado getDocumento() {
        return documento;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
     public void setDocumento(DocumentoEncolado documento) {
        this.documento = documento;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }
    
    public NodoC getAnterior(NodoC primero, NodoC nodoSiguiente) {
        NodoC nodoActual = primero;
        NodoC nodoAnterior = null;
        while(nodoActual.getSiguiente() != null) {
        
            if (nodoActual != null && nodoActual.getSiguiente() == nodoSiguiente)  {
                nodoAnterior = nodoActual;
            }          
    
            nodoActual = nodoActual.getSiguiente();
        }       

        return nodoAnterior;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}
