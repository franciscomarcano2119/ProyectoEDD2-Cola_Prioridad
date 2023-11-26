/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.Cola;
import EDD.Documento;
import EDD.NodoC;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author yaxim
 */
public class FuncionCola {
//    Grafo grafoAux = new Grafo();
//    LeerArchivo f = new LeerArchivo();
//    FunctionTXT use = new FunctionTXT();
//    String infoGrafo = f.leertxt("test\\proyecto.txt");
//    String[] users = use.getUsuarios(infoGrafo);
//    String[] relaciones = use.getRelaciones(infoGrafo);
    
//    public Grafo crearGrafo(String[] users, String[] relaciones){
//        for (int i = 1; i < users.length; i++) {
//            String[] info = users[i].trim().split(",");
//            String username = info[1].trim();
//            int id = Integer.parseInt(info[0].trim());
//            Vertice user1 = new Vertice(id, username);
//            grafoAux.agregarUsuario(user1);
//        }
//        for (int j = 1; j < relaciones.length; j++) {
//                String[] relationships = relaciones[j].trim().split(",");
//                int id1 = Integer.parseInt(relationships[0].trim());
//                int id2 = Integer.parseInt(relationships[1].trim());
//                List<Vertice> usersGrafo = grafoAux.getUsuarios();
//                Vertice idName1 = getUsuarioByID(usersGrafo, id1);
//                Vertice idName2 = getUsuarioByID(usersGrafo, id2);
//                if (idName1 != null && idName2 != null){
//                    grafoAux.agregarConexion(idName1, idName2);
//                }else{
//                    JOptionPane.showMessageDialog(null, "error");
//                   }
//                
//        } 
//        return grafoAux;
//        
//        }
//      
//     
//    public Vertice getUsuarioByID(List<Vertice> allUsers, int id){
//        Vertice name = null;
//        for (Vertice user : allUsers) {
//            
//            
//            if(user.id == id){
//                return user;
//            } 
//        } return name;
//    }
    
           
    public void viewCola(Graph graph) {
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
    
    public Graph drawColaImpresion (Cola cola){
        Graph graph = new MultiGraph("Relacion");
        System.setProperty("org.graphstream.ui", "swing");
        graph.setAttribute("ui.stylesheet", "node{\n"+ "size:40px,30px;\n"+"fill-color:#9EBCEF; \n"+"text-mode: normal; \n"+"}");
        
        NodoC primero = cola.obtenerPrimerNodo();
        NodoC ultimo = cola.obtenerUltimoNodo();
        NodoC nodoActual = primero;
       
        while (nodoActual != ultimo) {
             graph.addNode(nodoActual.getDocumento().nombre).setAttribute("ui.label",nodoActual.getDocumento().nombre);
             nodoActual = nodoActual.getSiguiente();
        }
        graph.addNode(nodoActual.getDocumento().nombre).setAttribute("ui.label",nodoActual.getDocumento().nombre); 
        
        nodoActual = ultimo;
        NodoC nodoAnterior;
        while (nodoActual != primero) {
             //graph.addNode(nodoActual.getDocumento().nombre).setAttribute("ui.label",nodoActual.getDocumento().nombre);
             
            nodoAnterior = nodoActual.getAnterior(primero, nodoActual);
            if (nodoActual != null && nodoAnterior != null)
                graph.addEdge(nodoActual.getDocumento().nombre, nodoActual.getDocumento().nombre, nodoAnterior.getDocumento().nombre, true);
            nodoActual = nodoAnterior;
        }
        //graph.addNode(nodoActual.getDocumento().nombre).setAttribute("ui.label",nodoActual.getDocumento().nombre); 
        
//        for (int i=0;i<grafo.getUsuarios().size();i++){
//            Vertice user = grafo.getUsuarios().get(i);
//            String userid = user.getNombre();
//            graph.addNode(userid).setAttribute("ui.label",userid);
//        }
//        // Se recorre la lista de adyacencia de nuestro grafo para añadir los arcos y pesos al grafo de GraphStream
//        for (int i=0; i < grafo.getUsuarios().size(); i++){
//            Vertice friend1 = grafo.getUsuarios().get(i);
//            for (int j=0; j<friend1.getConexions().size(); j++){
//                Arista friend2 = friend1.getConexions().get(j);
//                String id = friend1.getNombre() + friend2.getEnd().getNombre();
//                graph.addEdge(id, friend1.getNombre(), friend2.getEnd().getNombre(), false);
//            }
//        } 
        return graph;
    }
    
    public Cola crearCola() {
        Cola cola = new Cola();
        cola.encolarDocumento(CrearDocumento("Doc1", 1, "Type1"));
        cola.encolarDocumento(CrearDocumento("Doc2", 2, "Type2"));
        cola.encolarDocumento(CrearDocumento("Doc3", 3, "Type3"));
        
        return cola;
    }
    
    private Documento CrearDocumento(String nombre, int size, String type) {
        Documento documento = new Documento();
        documento.nombre = nombre;
        documento.size = size;
        documento.type = type;
        return documento;
    }
}
