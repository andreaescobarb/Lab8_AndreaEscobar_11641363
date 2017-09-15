/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_andreaescobar_p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Admin {
    ArrayList<Hadas> hadas = new ArrayList();
    private File archivo = null;

    public Admin(String path) {
        this.archivo= new File(path);
    }

    public ArrayList<Hadas> getHadas() {
        return hadas;
    }

    public void setHadas(ArrayList<Hadas> hadas) {
        this.hadas = hadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void cargarArchivoBinario() {
        try {
            hadas = new ArrayList();
            Hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hadas) objeto.readObject()) != null) {
                        hadas.add(temp);
                    }
                } catch (EOFException ex) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivoBinario() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas listaPersona : hadas) {
                bw.writeObject(listaPersona);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
