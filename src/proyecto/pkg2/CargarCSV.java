/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Arrays;
import javax.swing.*;

public class CargarCSV {
    
    public String csvFile;

    public CargarCSV() {
        this.csvFile = "";
    }

    public String cargarArchivo(File archivo) throws FileNotFoundException, IOException {
        FileReader lector = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(lector);
        String linea;
        String doc="";
        while((linea = buffer.readLine())!= null){
            if (!linea.isEmpty()){
                doc += linea+ "\n";
            } 
        }
        buffer.close();

        return doc;
    }
}