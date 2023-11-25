/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CargarCSV {
    private String csvFile;

    public void CargarCSV(String csvFile) {
        this.csvFile = csvFile;
    }

    public void load() {
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                System.out.println("Data [column-1= " + data[0] + " , column-2=" + data[1] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
