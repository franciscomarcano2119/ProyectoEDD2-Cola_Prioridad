<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoedd_2_colaprioridad;

import InterfacesGraficas.Bienvenida;

/**
 *
 * @author yaxim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bienvenida window = new Bienvenida();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoedd_2_colaprioridad;

import EDD.Usuario;
import Funciones.FunctionTXT;
import Funciones.LeerArchivo;
import InterfacesGraficas.Bienvenida;
import java.util.List;

/**
 *
 * @author francisco
 */
public class Main {
    
    public static List<Usuario> usuarios;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LeerArchivo f = new LeerArchivo();
        FunctionTXT content = new FunctionTXT();
        String listaUsuarios = f.leertxt("src\\Files\\usuarios.csv");
        String listDocumentos = f.leertxt("src\\Files\\documentos.csv");
        usuarios = content.getUsuarios(listaUsuarios);
        usuarios = content.addDocumentosUsuario(usuarios, listDocumentos);
        
        Bienvenida window = new Bienvenida();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
    
}
>>>>>>> Stashed changes
