import java.util.*;
import java.io.*;

class Solution {
    
    public static void main(String []args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
              
                        
       // i = Integer.parseInt(console.nextLine());
        
      for(int i = 0; i < t; i++) {
             
                            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int resultado = a;
            int elevado = 1;

            
            for (int j = 1; n != 0; j++) {
            // Com faz a conta
            resultado = resultado + b * elevado;
            elevado = elevado * 2;
            // resultado = a + 1 * b + (resultado * 2);
            //resultado = a + (int) Math.pow(2, j) * b + (int) Math.pow(2, n - 1);
            n = n - 1;
            
            System.out.printf("%d ", resultado);   
            
            }
            System.out.println();
            resultado = 0;
              
    }                 
 }
 
}
    

