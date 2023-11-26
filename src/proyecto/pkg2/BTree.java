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

    
    public BTree(Object dato) {
        this.dato = dato;
        this.root = null;

    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoT getRoot() {
        return root;
    }

    public void setRoot(NodoT root) {
        this.root = root;
    }
    
    public boolean isEmpty(){
        return getRoot() == null;
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
    
    public void insertarUsuario (int key, int orden, String user, NodoT pointer){
        NodoT nodo = new NodoT(user, orden, key);
        if (isEmpty()) {
            setRoot(nodo);
        } else{
            if(key < pointer.getKey()){
                if(pointer.getHizq() == null){
                    pointer.setHizq(nodo);
                }else{
                    insertarUsuario (key,orden,user, pointer.getHizq());
                }
            }
            if(key > pointer.getKey()){
                if(pointer.getHdcha() == null){
                    pointer.setHdcha(nodo);
                }else{
                    insertarUsuario (key,orden,user, pointer.getHdcha());
                }
            }
        }
    }
    
    public NodoT reemplazarNodo(NodoT nodo){
        NodoT previous = nodo;
        while(nodo.getHdcha() != null){
            previous = nodo;
            nodo = nodo.getHdcha();
        }
        previous.setHdcha(null);
        if (nodo.getHizq() != null){
            previous.setHdcha(nodo.getHizq());
        }
        return nodo;
    }
    
    public NodoT buscarNodo(int key) {
        NodoT pointer = getRoot();
        while (pointer != null && key != pointer.key) {
          if (key < pointer.key) {
            pointer = pointer.getHizq();
          } else {
            pointer = pointer.getHdcha();
          }
        }
        return pointer;
    }
    
    public boolean hijoIzq(NodoT nodo){
        return nodo.getHdcha() != null;
    }
    
    public void eliminarUsuario(int key, NodoT pointer, NodoT previous) {
        if (isEmpty()){
            System.out.println("El árbol está vacío");
        }else{
            if (key < pointer.getKey()){
                eliminarUsuario(key, pointer.getHizq(), pointer);
            } else if (key > pointer.getKey()){
                eliminarUsuario(key, pointer.getHdcha(), pointer);
            }else{
                if (pointer.esHoja()){
                    if(previous == null){
                        setRoot(null);
                    }else{
                        if (key < previous.getKey()){
                            previous.setHizq(null);
                        }else{
                            previous.setHdcha(null);
                        }
                    }
                }else if(pointer.soloHijodcho()){
                    previous.setHdcha(pointer.getHdcha());
                    pointer.setHdcha(null);
                } else if(pointer.soloHijoizq()){
                    previous.setHizq(pointer.getHizq());
                    pointer.setHizq(null);
                }else{
                    boolean hijodcho = hijoIzq(pointer.getHizq());
                    if (hijodcho){
                        NodoT nodo = reemplazarNodo(pointer.getHizq());
                        if(previous == null){
                            nodo.setHizq(pointer.getHizq());
                            nodo.setHdcha(pointer.getHdcha());
                            setRoot(nodo);
                        } else {
                            if (key < previous.getKey()){
                                nodo.setHizq(pointer.getHizq());
                                nodo.setHdcha(pointer.getHdcha());
                                previous.setHizq(nodo);
                            }else{
                                nodo.setHizq(pointer.getHizq());
                                nodo.setHdcha(pointer.getHdcha());
                                previous.setHizq(nodo);
                            }
                        }
                    }else{
                        NodoT nodo = pointer.getHizq();
                        if(key < previous.getKey()){
                            nodo.setHdcha(pointer.getHdcha());
                            previous.setHizq(nodo);
                        }else{
                            nodo.setHizq(pointer.getHizq());
                            previous.setHdcha(nodo);
                        }
                    }
                    
                }
            }
        
        }
    }
}
