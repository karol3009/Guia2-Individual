    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Karoline
 */
public class G2EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner (System.in);
         int precioca1 = 0,precioauto1 = 0,impca1 = 0, impau1,precioneto;
           System.out.println("Ingrese el precio de la camioneta:");
            precioca1 = teclado.nextInt();
            System.out.println("Ingrese el precio del automovil:");
            precioauto1 = teclado.nextInt();
            
            if(precioca1 < 80){
                impca1 = 0;
            System.out.println("el impuesto que debe pagar es de :"+impca1);
            }
            else if (precioca1  >= 80){
                   
                impca1 = precioca1/2;
            
                System.out.println("el impuesto que debe pagar es de :"+impca1);
            }
             if(precioauto1  < 20 ){
                impau1 = 5;    
              System.out.println("el impuesto que debe pagar es de :"+impau1);  
            }
            else if(precioauto1  >=  20 &&  precioauto1 <=  40){
                impau1 = precioauto1/5; 
               System.out.println("el impuesto que debe pagar es de :"+impau1);
             }
 
             if(precioauto1  > 40 ){        
                impau1 = 9;      
                System.out.println("el impuesto que debe pagar es de :"+impau1);
             }
             precioneto = (precioca1 + impca1);
             
               System.out.println("el impuesto que debe pagar es de :"+impca1); 
            }
             
             
           
        
    }
   
