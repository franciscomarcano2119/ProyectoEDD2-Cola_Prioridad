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
    public String nombre, type;
    public int size, hora, printid;

    public NodoL(Object element, int size, String nombre, String type, int hora, int printid) {
        this.next = null;
        this.previous = null;
        this.nombre = nombre;
        this.type = type;
        this.size = size;
        this.hora = hora;
        this.printid = printid;
    }

    public NodoL getNext() {
        return next;
    }

    public void setNext(NodoL next) {
        this.next = next;
    }

    public NodoL getPrevious() {
        return previous;
    }

    public void setPrevious(NodoL previous) {
        this.previous = previous;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getPrintid() {
        return printid;
    }

    public void setPrintid(int printid) {
        this.printid = printid;
    }
}
