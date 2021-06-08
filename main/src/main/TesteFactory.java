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
public class TesteFactory {
    private static TimeDeFutebol criarTime(String tipo){
     TimeFactory tf = null;
     switch(tipo){
         case "Atacantes" :
                 tf = new AtacantesFactory();
                 break;
         case "Goleiro" :
             tf = new GoleirosFactory();
             break;
         
     
     }
    TimeDeFutebol time = new TimeDeFutebol();
    time.setTimeTitular(tf.CriarTimeTitular());
    time.setTimeReserva(tf.MontarTimeReserva());
    
    return time;}
    
    public static void main (String[] args){
    
    TimeDeFutebol T1 = criarTime("Atacantes");
    TimeDeFutebol T2 = criarTime("Goleiro");
        System.out.println("Fim!!!");
    
    
    }
    
    
}
