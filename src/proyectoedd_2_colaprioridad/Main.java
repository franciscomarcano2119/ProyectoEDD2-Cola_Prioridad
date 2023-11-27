/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoedd_2_colaprioridad;

import EDD.BTree;
import EDD.DocumentoEncolado;
import EDD.Usuario;
import Funciones.FunctionTXT;
import Funciones.LeerArchivo;
import InterfacesGraficas.Bienvenida;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author francisco
 */
public class Main {
    
    public static List<Usuario> usuarios;
    public static List<DocumentoEncolado> documentoEncolados;
    public static Date tiempoInicioSimulacion;
    public static BTree arbolDocumentoEncolados;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LeerArchivo f = new LeerArchivo();
        FunctionTXT content = new FunctionTXT();
        arbolDocumentoEncolados = new BTree();
        String listaUsuarios = f.leertxt("src\\Files\\usuarios.csv");
        String listDocumentos = f.leertxt("src\\Files\\documentos.csv");
        String listDocumentosEncolados = f.leertxt("src\\Files\\documentosEncolados.csv");
        usuarios = content.getUsuarios(listaUsuarios);
        usuarios = content.addDocumentosUsuario(usuarios, listDocumentos);
        documentoEncolados = content.getDocumentosEncolados(listDocumentosEncolados);
        arbolDocumentoEncolados = content.getArbolDocumentoEncolados(documentoEncolados, arbolDocumentoEncolados);
        
        
        Bienvenida window = new Bienvenida();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
    
}
