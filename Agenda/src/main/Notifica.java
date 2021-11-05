/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

/**
 *
 * @author Erick
 */
public class Notifica extends TimerTask {

    Menu men = new Menu();
    Formulario xd = new Formulario();

    @Override
    public void run() {
        
        verificaEvento();
        
    }
   
    
    public void verificaEvento()
   {
       
       for(Integer j=0; j < Main.ultimo; j++){
       
            if(Main.agenda.get(j) != null){
                int dia = men.calculaFechaEvento(Main.agenda.get(j).getDia(),Main.agenda.get(j).getMes(),Main.agenda.get(j).getAnio());
                   if(dia==1){
                       men.notificacion(men.getIconImage(),"El Evento de Mañana es:  "+ Main.agenda.get(j).getContenido()+"\nA la Hora:  "+Main.agenda.get(j).getHora()); 
                   }
           }
       }
     
       
       
   }
}
