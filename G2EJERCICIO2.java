/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class G2EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int radio,areacir,areacuadrado,areasomb;
        System.out.println("Ingrese el radio del circulo:");
        radio = teclado.nextInt();
        areacir = (int) (Math.PI/(Math.pow(radio,2)));
        areacuadrado = (int) (2*(Math.pow(radio,2)));
        areasomb = (int) ((Math.PI*(Math.pow(radio, 2))) - (2*(Math.pow(radio, 2))));
        System.out.println("el area de la parte sombreada es: "+areasomb);
    }
    
}
