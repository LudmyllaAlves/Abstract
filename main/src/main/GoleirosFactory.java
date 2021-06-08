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
public class GoleirosFactory extends TimeFactory{

    
    public TimeTitular CriarTimeTitular() {
    return new GoleiroTitular();
    
    
    
    }

    
    public TimeReserva MontarTimeReserva() {
        return new GoleirosReservas();
        
    }
    
}
