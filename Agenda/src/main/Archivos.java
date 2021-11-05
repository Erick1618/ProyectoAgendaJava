
package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;


public class Archivos {
    private String nombre;
    private String extension;
    

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void generarArchivo(String contenido){
       try{
              try( FileWriter archivo = new FileWriter(getNombre()+".txt",true);BufferedWriter almacena = new BufferedWriter(archivo)){
              
               almacena.write(contenido+"\n");
               almacena.close();
              }
            }
       catch(IOException e){
           
       }
    }
    
   public void eliminarArchivo(String contenido){
      JFileChooser filechose = new JFileChooser();
       
       File archivo = new File(contenido+".txt");
       
       if(archivo.exists()){
            if(archivo.delete()){
                
            }
            else{
                
            }
       }
       else{
            
       }  
   }
    
 //Carga los datos del archivo de texto en el hashMap agenda
   public void cargarEvento(String evento){ 
        Integer i = 0;
        try{
            FileReader archivo = new FileReader(evento+".txt");
            BufferedReader lectura = new BufferedReader(archivo); 
            String cadena; 
            while((cadena = lectura.readLine()) != null ){
                 Pendiente nuevo = new Pendiente();
                 nuevo.setContenido(cadena);
                 Main.agenda.put(i,nuevo);
                 i++;
            }
            archivo.close();
            
            }
        catch(IOException e){
           
        }
       
    }
   
   public void cargarFecha(String fecha){ 
        Integer i = 0;
        try{
            try (FileReader archivo = new FileReader(fecha+".txt")) {
                BufferedReader lectura = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectura.readLine()) != null ){
                    Pendiente nuevo = new Pendiente();
                    nuevo.setContenido(Main.agenda.get(i).getContenido());
                    nuevo.setFecha(cadena);
                    Main.agenda.put(i,nuevo);
                    i++;
                }
            }
            }
        catch(IOException e){
            
        }
       
    } 
   
   public void cargarHora(String hora){ 
        Integer i = 0;
        try{
            try (FileReader archivo = new FileReader(hora+".txt")) {
                BufferedReader lectura = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectura.readLine()) != null ){
                    Pendiente nuevo = new Pendiente();
                    nuevo.setContenido(Main.agenda.get(i).getContenido());
                    nuevo.setFecha(Main.agenda.get(i).getFecha());
                    nuevo.setHora(cadena);
                    Main.agenda.put(i,nuevo);
                    i++;
                }
                Main.ultimo=i;
            }
            }
        catch(IOException e){
            
        }
       
    } 
   
    public void cargarDia(String dia)
    {
        Integer i = 0;
        try{
            try (FileReader archivo = new FileReader(dia+".txt")) {
                BufferedReader lectura = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectura.readLine()) != null ){
                    Pendiente nuevo = new Pendiente();
                    nuevo.setContenido(Main.agenda.get(i).getContenido());
                    nuevo.setFecha(Main.agenda.get(i).getFecha());
                    nuevo.setHora(Main.agenda.get(i).getHora());
                    nuevo.setDia(cadena);
                    Main.agenda.put(i,nuevo);
                    i++;
                }
                Main.ultimo=i;
            }
            }
        catch(IOException e){
            
        }
    }
    
    public void cargarMes(String mes){
        Integer i = 0;
        try{
            try (FileReader archivo = new FileReader(mes+".txt")) {
                BufferedReader lectura = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectura.readLine()) != null ){
                    Pendiente nuevo = new Pendiente();
                    nuevo.setContenido(Main.agenda.get(i).getContenido());
                    nuevo.setFecha(Main.agenda.get(i).getFecha());
                    nuevo.setHora(Main.agenda.get(i).getHora());
                    nuevo.setDia(Main.agenda.get(i).getDia());
                    nuevo.setMes(cadena);
                    Main.agenda.put(i,nuevo);
                    i++;
                }
                Main.ultimo=i;
            }
            }
        catch(IOException e){
              }
    }
    
    public void cargarAnio(String anio)
    {
        Integer i = 0;
        try{
            try (FileReader archivo = new FileReader(anio+".txt")) {
                BufferedReader lectura = new BufferedReader(archivo);
                String cadena;
                while((cadena = lectura.readLine()) != null ){
                    Pendiente nuevo = new Pendiente();
                    nuevo.setContenido(Main.agenda.get(i).getContenido());
                    nuevo.setFecha(Main.agenda.get(i).getFecha());
                    nuevo.setHora(Main.agenda.get(i).getHora());
                    nuevo.setDia(Main.agenda.get(i).getDia());
                    nuevo.setMes(Main.agenda.get(i).getMes());
                    nuevo.setAnio(cadena);
                    Main.agenda.put(i,nuevo);
                    i++;
                }
                Main.ultimo=i;
            }
            }
        catch(IOException e){
              }
    }
    
}
