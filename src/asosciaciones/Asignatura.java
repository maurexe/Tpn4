/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosciaciones;

/**
 *
 * @author maurososa
 */
public class Asignatura {
    public String nombre;
    public String aula;
    public float hora;
    
    
    public Asignatura(){}
    public Asignatura(String nombre,String aula, float hora){
    this.nombre=nombre;
    this.aula=aula;
    this.hora=hora;
    }
    public Asignatura(String nombre,String aula){
    this.nombre=nombre;
    this.aula=aula;
    }
    public Asignatura(String nombre){
    this.nombre=nombre;
    }
    
}
