///POOA Proyecto final Agenda de eventos
///Integarntes:
///Olachea Ortega Erick Augusto 356020
///Santiago Suenaga Erick Gabriel 357624


package main;

import java.util.HashMap;
import java.util.Timer;

public class Main {

    static int ultimo = 0;
    static int Eliminados = 0;
    static int seleccionado = 0;
    static String fechaTemp;
    static String anio;
    static String dia;
    static String mes;
    static HashMap<Integer,Pendiente> agenda = new HashMap<Integer,Pendiente>();
    
    
    public static void main(String[] args) {
     
     Menu menu = new Menu();
     
     menu.setVisible(true);
     
     
     Archivos cargar = new Archivos();
     
     cargar.cargarEvento("Evento");
     cargar.cargarFecha("Fecha");
     cargar.cargarHora("Hora");
     cargar.cargarDia("Dia");
     cargar.cargarMes("Mes");
     cargar.cargarAnio("Anio");
     menu.caragaAutomatica();
    
       
     Timer timer = new Timer();
     Notifica tarea = new Notifica();
     timer.schedule(tarea, 40000,5000);// 12hrs= 43200000  3hrs=10800000
       
     
    }


    
}
