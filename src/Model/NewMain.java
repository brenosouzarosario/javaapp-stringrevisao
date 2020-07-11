
package Model;

import static java.lang.System.in;

public class NewMain {
    
public static String transform(String input) {
    String texto = "";

        for (char valor in input)
        {
            
            if (texto.indexOf(valor) == -1)
            {
                texto += valor;
             } 
        }
        
        return texto;

        
        //throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
     
    }
    
}
