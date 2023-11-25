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
    public String user;
    public int orden;
    public int key;

    public NodoT(String user, int orden, int key) {
        this.left = null;
        this.right = null;
        this.user = user;
        this.orden = orden;
        this.key = key;
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

    public Object getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public boolean esHoja() {
        return hizq == null && hdcha == null;
    }
    
    public boolean soloHijodcho() {
        return hizq == null && hdcha != null;
    }
    public boolean soloHijoizq() {
        return hizq != null && hdcha == null;
    }
    
    public boolean ambosHijos() {
        return hizq != null && hdcha != null;
    }
}
    
