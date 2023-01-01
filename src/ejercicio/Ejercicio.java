
package ejercicio;

import java.util.Scanner;


/**
 *
 * @author Cristian omar
 */

public class Ejercicio {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        int a=0, b=0, c=0;

       System.out.println("Dame un Número");
       a = dato.nextInt();
       System.out.println("Dame otro Número");
       b = dato.nextInt();
        System.out.println("Dame otro Número");
       c = dato.nextInt();
       
       suma(a,b,c);
       
       
       
    }
      public static  void suma( int a,int   b,int   c){
          int resultado;
           
          resultado = a + b + c;
          System.out.println("el resultado es : " + resultado);
        
        }
       
    }
    

