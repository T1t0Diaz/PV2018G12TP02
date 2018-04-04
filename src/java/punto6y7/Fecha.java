/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6y7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alfred
 */
public class Fecha {
    
   public void mostrarFecha(Calendar cal){
       cal.add(Calendar.DAY_OF_MONTH,100);
       DateFormat dateFormatter;
       dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
       SimpleDateFormat sdf =new SimpleDateFormat("EEEE"+","+"dd MMMM yyyy");
       System.out.println("la fecha 100 dias despues es : "+ sdf.format(cal.getTime()));
       System.out.println("La fecha 100 dias despues es: "+ dateFormatter.format(cal.getTime()));
       
   
   
   }
   public void restarFecha(String fechaInicial, String fechaFinal) throws ParseException{
      
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
       
       Date fInicial= sdf.parse(fechaInicial);
       Date fFinal = sdf.parse(fechaFinal);
       Calendar feInicial= Calendar.getInstance();
       Calendar feFinal= Calendar.getInstance();
       feInicial.setTime(fInicial);
       feFinal.setTime(fFinal);
       
       
       long milisec=feFinal.getTimeInMillis() - feInicial.getTimeInMillis();
       long days =milisec/1000/60/60/24;
       
       int dias =-1;
       while (feInicial.before(feFinal) || feInicial.equals(feFinal)){
       
       dias++;
       feInicial.add(Calendar.DATE, 1);
       
       }
       System.out.println("La cantidad de dias entre las dos fechas es: " +dias +" dias");
       System.out.println("La cantidad de dias entre las dos fechas es: "+ days +" dias");
      
       
   
   }
    
}
