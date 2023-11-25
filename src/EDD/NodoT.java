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
public class NodoT {
    public NodoT left, right, hizq, hdcha;
    public Object element;
    public int orden;

    public NodoT(Object element, int orden) {
        this.left = null;
        this.right = null;
        this.element = element;
        this.orden = orden;
    }

    public NodoT getLeft() {
        return left;
    }

    public void setLeft(NodoT left) {
        this.left = left;
    }

    public NodoT getRight() {
        return right;
    }

    public void setRight(NodoT right) {
        this.right = right;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public NodoT getHizq() {
        return hizq;
    }

    public void setHizq(NodoT hizq) {
        this.hizq = hizq;
    }

    public NodoT getHdcha() {
        return hdcha;
    }

    public void setHdcha(NodoT hdcha) {
        this.hdcha = hdcha;
    }
    
    
}
    
