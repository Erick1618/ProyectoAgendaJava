
package main;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Erick
 */
class Pendiente {
   
    private String fecha;
    private String hora;
    private String contenido;
    private int id;
    private String dia;
    private String mes;
    private String anio;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
   
    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String toString(){
        return "Contenido: "+ contenido + "\n Fecha: " + fecha + "\n Hora: " + hora+ "\n"+ dia +"\n"+  mes+ "\n"+ anio ;
    }
}
