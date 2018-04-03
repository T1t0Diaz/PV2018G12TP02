/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import dominio.Fecha;
import dominio.Palabra;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException  {
        
        Scanner scan=new Scanner(System.in);
        Palabra pala= new Palabra();
        int dia,mes,anio;
        String fechaInicial,fechaFinal;
        Fecha fe = new Fecha();
        char resp;
        System.out.println("----------------MENU DE OPCIONES----------------");
        System.out.println("OPCION 1 : contar vocales de un String ");
        System.out.println("OPCION 2 : Invertir un String ");
        System.out.println("OPCION 3 : Contar un caracter en un cadena String ");
        System.out.println("OPCION 6 : Calcular diferencia de dias entre fechas ");
        System.out.println("OPCION 7 : Mostrar 100 dias despues de fecha ingresada en formato personalizado");
        
        do{
        System.out.println("ingrese opcion");
        int opcion = scan.nextInt();
        
        
        switch(opcion){
        
            case 1:      
                         pala.contarVocales();
                         break;
                        
            case 2:      
                         pala.invertirCadena();
                         break;
            case 3:     
                        pala.contarCaracter(); 
                        break;
                        
            case 4:
                break;
            case 5:
                
                
                break;
            case 6: 
                    System.out.println("ingrese fecha inicial en modo cadena: ");
                    fechaInicial=scan.next();
                    System.out.println("ingrese fecha final en modo cadena: ");
                    fechaFinal=scan.next();
                    System.out.println("la diferencia de dias entre fechas es: ");
                    fe.restarFecha(fechaInicial, fechaFinal);
            
            break;
                
            case 7: System.out.println("ingrese dia ");
                    dia=scan.nextInt();
                    System.out.println("ingrese mes ");
                    mes=scan.nextInt();
                    System.out.println("ingrese año ");
                    anio=scan.nextInt();
                    Calendar calendario = Calendar.getInstance();
                    calendario.set(anio,mes-1,dia);        
                    System.out.println(calendario.getTime());       
                    fe.mostrarFecha(calendario);
                    break;
            
            default:System.out.println("opcion invalida");
            
            
                   
                       
        }          
                
            System.out.println("desea continuar en el menu");
            resp = scan.next().charAt(0);
                        
                
                
                
            
        
        
        
        
        }while(resp!= 'n');
        
        
            
        
    
    
    
    
    }}
