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
public class NodoL {
    public NodoL next, previous;
    public Object element;

    public NodoL(Object element) {
        this.next = null;
        this.previous = null;
        this.element = element;
    }

    public NodoL getNext() {
        return next;
    }

    public void setNext(NodoL next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public NodoL getPrevious() {
        return previous;
    }

    public void setPrevious(NodoL previous) {
        this.previous = previous;
    }
    
    
}
