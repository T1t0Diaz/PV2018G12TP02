package punto4;

import java.util.Scanner;
import javax.xml.bind.ParseConversionEvent;

public class Principal {
    
    Scanner sc = new Scanner(System.in);
    SuperCadena cadena = new SuperCadena();
    
    public void iniciar(){
        System.out.println("------------Mostrar Cantidad de Vocales de una Cadena---------------");
        System.out.println("Ingrese Cadena:\n (separe palabras con guion bajo '_' )");
        cadena.mostrarCantidadVocales(sc.next());
        System.out.println("\n------------Invertir Cadena y Mostrar Resultado--------------" );
        System.out.println("Ingrese Cadena:\n (separe palabras con guion bajo '_' )");
        cadena.mostrarCadenaInvertida( cadena.invertirCadena( sc.next() ) );
        System.out.println("\n------------Mostrar Cuantas veces se repite un caracter en una Cadena--------------" );
        System.out.println("Ingrese Cadena:\n (separe palabras con guion bajo '_' )");
        String texto = sc.next();
        System.out.println("Ingrese Caracter:");
        char caracter = sc.next().charAt(0);
        cadena.mostrarCantidadDeRepeticion( cadena.buscarEnCadena(texto, caracter) );
        System.out.println("\n------------Fin--------------" );
        
    }
}
