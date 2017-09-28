/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author equipo
 */
public class Semana {
    private int number; 
    private Sala[] salas; 
    private Dia [] diasLaborales; 

    public Semana(int number) {
        this.number = number;
        this.diasLaborales = new Dia [5];
    }
    
}
