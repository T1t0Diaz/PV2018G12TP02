package punto2;

public class Cadena {

    public String invertirCadena(String cadena){
        String cadenaInvertida="";
        for(int i=cadena.length()-1; i >= 0 ; i-- ){
           cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
    
    public void mostrarCadenaInvertida(String cadenaInv){
       System.out.println(cadenaInv);
    }
}
