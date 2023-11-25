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
public class Lista {
    public NodoL head, tail;
    public int size;
    
    public Lista(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoL getHead() {
        return head;
    }

    public void setHead(NodoL head) {
        this.head = head;
    }

    public NodoL getTail() {
        return tail;
    }

    public void setTail(NodoL tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    

    

    public void insertBegin(Object element) {
        NodoL nodo = new NodoL(element);
        if (isEmpty()){
            setHead(nodo);
            setTail(nodo);
        }   else{
            nodo.setNext(getHead());
            setHead(nodo);
        }
        size ++;
    }


    public void insertFinal(Object element) {
        NodoL nodo = new NodoL(element);
        if (isEmpty()){
            setHead(nodo);
            setTail(nodo);
        }   else{
            getTail().setNext(nodo);
            nodo.setPrevious(getTail());
            setTail(nodo);
        }
        size++;
    }


    public void insertAtIndex(Object element, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Object deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            if (getHead() == getTail()){
                setHead(null);
                setTail(null);
                size--;
            }else{
                NodoL pointer = getHead();
                setHead(pointer.getNext());
                pointer.setNext(null);
                getHead().setPrevious(null);
                size--;
            }
        }
        return null;
    }


    public Object deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            if (getHead() == getTail()){
                setHead(null);
                setTail(null);
                size--;
            }else{
                NodoL pointer = getTail();
                setTail(pointer.getPrevious());
                pointer.setPrevious(null);
                getTail().setNext(null);
                size--;
            }
        }
        return null;
    }
    
    public Object deleteAtIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    public void print(){
        NodoL pointer = getHead();
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
        while (pointer != null) {
            System.out.println(" [ " + pointer.getElement() + " ]   ");
            pointer = pointer.getNext();
        }
        }
    }
}
