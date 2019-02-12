/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Fichero {
    
    
    public static ArrayList<String> leerPisosTexto(){
        File f = new File("recursos/Pisos.txt");
        ArrayList<String> vPisos= new ArrayList<String>();
        
        Scanner leer = null;
        
        
        if (!f.exists()){
            try {
                f.getParentFile().mkdirs();
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
        }
        
        while(leer.hasNext()){
            
        }
         
        return vPisos;        
    }
    
    
    public static ArrayList<String> leerArmasTexto(){
        ArrayList<String> vArmas= new ArrayList<String>();
        File f = new File("recursos/Pisos.txt");
         if (!f.exists()){
            try {
                f.getParentFile().mkdirs();
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
        }
        
        return vArmas;
    }
    
    public static void encriptar(){
        
    }
    
    
    public static void desencriptar(){
        
    }
    
}
