/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_de_aula_alexi_franky_jericop.persistencia;

import com.mycompany.proyecto_de_aula_alexi_franky_jericop.datos.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author FRANKY F
 */
public class Almacenamiento {
    public static String rutaBase = System.getProperty("user.home")+File.separator+"misdatos";
    public static String nombreArvhivo= "datos.dat";
    
    public static void guardar (HashMap<String,Persona> bd) throws IOException{
         String rutaCompleta = rutaBase + File.separator + nombreArvhivo;
    File archivo = new File(rutaCompleta);

    if (!archivo.exists()) {
        File carpeta = new File(archivo.getParent());
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        archivo.createNewFile();
    } else {
        // Cargar datos existentes desde el archivo
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo))) {
            HashMap<String, Persona> datosExist = (HashMap<String, Persona>) lector.readObject();
            bd.putAll(datosExist); // Combinar datos existentes con los nuevos
        } catch (ClassNotFoundException e) {
        }
    }

    // Guardar los datos actualizados (incluyendo objetos Persona existentes y nuevos)
    try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(archivo))) {
        escritor.writeObject(bd);
    }
    }
    public static HashMap<String,Persona> recuperar() throws Exception{
         String rutaCompleta= rutaBase+File.separator+nombreArvhivo;
         File archivo = new File(rutaCompleta);
         if(!archivo.exists()){
            archivo.createNewFile();
            throw new Exception("La BD esta vacia");
        }
         ObjectInputStream lector = new ObjectInputStream(new FileInputStream(archivo));
         HashMap<String,Persona> personasBd = (HashMap<String,Persona>) lector.readObject();
       return personasBd;
    }
}
