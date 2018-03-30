package punto4;

public class SuperCadena {
    
    public void mostrarCantidadVocales(String cadena){
      
        int cont = 0;
        String vocales="";
        
        for(int i = 0; i < cadena.length(); i++ ){                        
                    
            if(cadena.toUpperCase().charAt(i)== 'A' || cadena.toUpperCase().charAt(i)== 'Á'){
                vocales += cadena.charAt(i) + ", ";
                cont += 1; 
            }
            
            if(cadena.toUpperCase().charAt(i)== 'E' || cadena.toUpperCase().charAt(i)== 'É'){
                vocales += cadena.charAt(i) + ", ";
                cont += 1; 
            }
            
            if(cadena.toUpperCase().charAt(i)== 'I' || cadena.toUpperCase().charAt(i)== 'Í'){
                vocales += cadena.charAt(i) + ", ";
                cont += 1; 
            }
            
            if(cadena.toUpperCase().charAt(i)== 'O' || cadena.toUpperCase().charAt(i)== 'Ó'){
                vocales += cadena.charAt(i) + ", ";
                cont += 1; 
            }
            
            if(cadena.toUpperCase().charAt(i)== 'U' || cadena.toUpperCase().charAt(i)== 'Ú'){
                vocales += cadena.charAt(i) + ", ";
                cont += 1; 
            }
        }
        
        System.out.println("En la cadena '"+ cadena+ "' hay "+ cont + " vocales\n" + vocales.toUpperCase());
    }
    
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
    
    public int buscarEnCadena(String cadena, char caracter){
       int cont=0;
       for(int i=0; i< cadena.length(); i++){
           if(cadena.charAt(i) == caracter){
            cont += 1;
           }
       }
       return cont;    
    }
    
    public void mostrarCantidadDeRepeticion(int cantidad){
        System.out.println("El caracter se repite " + cantidad + " veces");
    }
    
}
