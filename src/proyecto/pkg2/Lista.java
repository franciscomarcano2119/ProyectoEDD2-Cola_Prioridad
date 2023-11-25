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

    

    

    public void insertBegin(Object element, int size, String nombre, String type, int hora, int printid) {
        NodoL nodo = new NodoL(element, size, nombre, type, hora, printid);
        if (isEmpty()){
            setHead(nodo);
            setTail(nodo);
        }   else{
            nodo.setNext(getHead());
            setHead(nodo);
        }
        size ++;
    }


    public void insertFinal(Object element, int size, String nombre, String type, int hora, int printid) {
        NodoL nodo = new NodoL(element, size, nombre, type, hora, printid);
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


    public NodoL deleteBegin() {
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


    public NodoL deleteFinal() {
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
    
    public NodoL deleteAtIndex(int index) {
        int cont = 0;
        if(isEmpty()){
            System.out.println("No hay nada en la lista");
        } else{
            if (index == 0){
                return deleteBegin();
            } else {
                if (index < getSize()){
                    NodoL pointer = getHead();
                    while (cont < index - 1){
                        pointer = pointer.getNext();
                        cont++;
                    }
                    NodoL elim = pointer.getNext();
                    pointer.setNext(elim.getNext());
                    elim.setNext(null);
                    elim.setPrevious(null);
                    size--;
                    return elim;
                } else if (index == getSize()){
                    return deleteFinal();
                } else {
                    System.out.println("Índice no válido");
                    return null;
                }
            }
        }
        return null;
    }


    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    /*public void print(){
        NodoL pointer = getHead();
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
        while (pointer != null) {
            System.out.println(" [ " + pointer.getElement() + " ]   ");
            pointer = pointer.getNext();
        }
        }
    }*/
}
