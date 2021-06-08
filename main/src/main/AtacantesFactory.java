/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author tatia
 */
public class AtacantesFactory extends TimeFactory {

   
    public TimeTitular CriarTimeTitular() {
        return new AtacantesTitular();
    }

   
    public TimeReserva MontarTimeReserva() {
        return new AtacantesReserva();
    
    }
    
}
