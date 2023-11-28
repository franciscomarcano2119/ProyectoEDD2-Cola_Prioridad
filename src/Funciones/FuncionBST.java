/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.BTree;
import EDD.Cola;
import EDD.NodoC;
import EDD.NodoT;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

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
    
    public void viewArbol(Graph graph) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout()){
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(640, 480);
            }
        };
        frame.setSize(panel.getWidth(), panel.getHeight());
        frame.setBackground(Color.blue);
        Viewer viewer = new SwingViewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = (ViewPanel)viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  
        
    }
    
    public Graph drawArbolImpresion (BTree arbol){
        Graph graph = new MultiGraph("Relacion");
        System.setProperty("org.graphstream.ui", "swing");
        graph.setAttribute("ui.stylesheet", "node{\n"+ "size:40px,30px;\n"+"fill-color:#9EBCEF; \n"+"text-mode: normal; \n"+"}");
        
        NodoT root = arbol.getRoot();
        preOrden(root, null, graph);
        return graph;
    }
    
    public void preOrden(NodoT nodoActual, NodoT nodoAnterior, Graph graph) {
        if (nodoActual != null) {
            graph.addNode(nodoActual.documento.nombre).setAttribute("ui.label",nodoActual.documento.nombre);
            
            if (nodoAnterior != null) {
               graph.addEdge(nodoActual.documento.nombre, nodoAnterior.documento.nombre, nodoActual.documento.nombre, true); 
            }
            preOrden(nodoActual.getHizq(), nodoActual, graph);
            preOrden(nodoActual.getHdcha(), nodoActual, graph);
        }
    }

}