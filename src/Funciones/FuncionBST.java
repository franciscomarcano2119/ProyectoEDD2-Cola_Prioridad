/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.BTree;
import EDD.NodoT;

/**
 *
 * @author francisco
 */
public class FuncionBST {

//    public void insertNodoRecursive(int element, NodoT pointer) {
////        NodoT nodo = new NodoT(element);
//        if (isEmpty()) {
//            setRoot(nodo);
//        } else {
//            if (element < pointer.getElement()) {
//                if (pointer.getLeftSon() == null) {
//                    pointer.setLeftSon(nodo);
//                } else  {
//                    insertNodoRecursive(element, pointer.getLeftSon());
//                }
//            } else {
//                if (pointer.getRightSon() == null) {
//                    pointer.setRightSon(nodo);
//                } else {
//                    insertNodoRecursive(element, pointer.getRightSon());
//                }
//            }
//        }
//    }
//    
//    public void deleteNodo(int element, Nodo pointer, Nodo previousNodo) {
//        if (isEmpty()) {
//            System.out.println("El arbol esta vacio");
//        } else {
//            if (element < pointer.getElement()) {
//                deleteNodo(element, pointer.getLeftSon(), pointer);
//            } else if (element > pointer.getElement()) {
//                deleteNodo(element, pointer.getRightSon(), pointer);
//            } else {
//                if(pointer.isLeaf()) {
//                    // Cuando es una hoja
//                    if (previousNodo == null) {
//                        setRoot(null);
//                    } else {
//                        if (element < previousNodo.getElement()) {
//                            previousNodo.setLeftSon(null);
//                        } else {
//                            previousNodo.setRightSon(null);
//                        }
//                    }
//                } else if(pointer.hasOnlyRigthSon()) {
//                    // Cuando solo tiene un hijo derecho
//                    previousNodo.setRightSon(pointer.getRightSon());
//                    pointer.setRightSon(null);
//                } else if (pointer.hasOnlyLeftSon()) {
//                    // Cuando solo tiene un hijo izquierdo
//                    previousNodo.setLeftSon(pointer.getLeftSon());
//                    pointer.setLeftSon(null);
//                } else {
//                    // Cuando tiene dos hijos
//                    boolean haveRigthSons = validateLeftSon(pointer.getLeftSon());
//                    if (haveRigthSons) {
//                        Nodo nodo = searchNodoToReplace(pointer.getLeftSon());
//                        if (previousNodo == null) {
//                            nodo.setLeftSon(pointer.getLeftSon());
//                            nodo.setRightSon(pointer.getRightSon());
//                            setRoot(nodo);
//                        } else {
//                            if (element < previousNodo.getElement()){
//                                nodo.setLeftSon(pointer.getLeftSon());
//                                nodo.setRightSon(pointer.getRightSon());
//                                previousNodo.setLeftSon(nodo);
//                            } else {
//                                nodo.setLeftSon(pointer.getLeftSon());
//                                nodo.setRightSon(pointer.getRightSon());
//                                previousNodo.setRightSon(nodo);
//                            }
//                        }
//                    } else {
//                        Nodo nodo = pointer.getLeftSon();
//                        if (element < previousNodo.getElement()){
//                            nodo.setRightSon(pointer.getRightSon());
//                            previousNodo.setLeftSon(nodo);
//                        } else {
//                            nodo.setRightSon(pointer.getRightSon());
//                            previousNodo.setRightSon(nodo);
//                        }
//                    }
//                }
//            }
//        }
//    }
//    
//    public Nodo searchNodoToReplace(Nodo nodo) {
//        Nodo previous = nodo;
//        while (nodo.getRightSon() != null) {
//            previous = nodo;
//            nodo = nodo.getRightSon();
//        } 
//        previous.setRightSon(null);
//        if (nodo.getLeftSon() != null) {
//            previous.setRightSon(nodo.getLeftSon());
//        }
//        return nodo;
//    }
//    
//    public boolean validateLeftSon(Nodo nodo) {
//        return nodo.getRightSon() != null;
//    }
//    
//      public BTree crearBST(  ){
//    
//        }

}