package punto3;

public class Cadena {
   
    public int buscarEnCadena(String cadena, char caracter){
       int cont=0;
       for(int i=0; i< cadena.length(); i++){
           if(cadena.charAt(i) == caracter){
            cont += 1;
           }
       }
       return cont;    
    }
    
    public void mostrar(int cantidad){
        System.out.println("El caracter se repite " + cantidad + " veces");
    }
}
