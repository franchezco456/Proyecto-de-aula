/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_de_aula_alexi_franky_jericop.datos;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author FRANKY F
 */
public class Persona implements Serializable {

    public Persona(String id1, String nombre1, String sexo1, String estado1, float peso1, float altura1, int edad1, float imc1) {
    }
    public static HashMap <String,Persona> personasBd = new HashMap<>();
    public String id;
    public String nombre;
    public String sexo;
    public String estado;
    public float peso;
    public float altura;
    public int edad;
    public float imc;

}