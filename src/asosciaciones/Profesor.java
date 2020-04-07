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
public class Profesor {
    public String nombre;
    public int dni;
    public String departamento;
    private Asignatura [] imparte = new Asignatura[3];

    
    public Profesor(String nombre, int dni, String departamento){
        this.nombre=nombre;
        this.dni = dni;
        this.departamento = departamento;
    }
    public Profesor(){}

    public Asignatura[] getImparte() {
        return imparte;
    }

    public void setImparte(Asignatura[] imparte) {
        this.imparte = imparte;
    }
    
    
}
