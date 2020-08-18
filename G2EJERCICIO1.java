/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class G2EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double C, L, P, Y = 0, numero;
        double pulg_pies = 0.0833;
        double pulg_cent = 2.54;
        double leg_pulg = 190080.02;
        double yard_pulg = 36;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("escoge una unidad de medida que quieras convertir: no olvides que C = centimetros, P = Pies, L = Legua, y Y = Yarda");
        System.out.println("1: C");
        System.out.println("2: L");
        System.out.println("3: Y");
        System.out.println("4: P");
        int medidas_unid = teclado.nextInt();
        
        switch (medidas_unid){
        case 1:
                System.out.println("ingrese el valor en Centimetros a convertir");
                numero = teclado .nextDouble();
                C = numero * pulg_cent;
                System.out.println("los " +numero+ " centimetros a pulgadas es "+C);
                break;
         case 2:
                System.out.println("ingrese el valor en leguas a convertir");
                numero = teclado .nextDouble();
                L = numero * leg_pulg;
                System.out.println("los " +numero+ " Leguas a pulgadas es "+L);
                break;     
         case 3:
                System.out.println("ingrese el valor en Yardas a convertir");
                numero = teclado .nextDouble();
                Y = numero * yard_pulg;
                System.out.println("los " +numero+ " Leguas a pulgadas es "+Y);
                break; 
           case 4:
                System.out.println("ingrese el valor en Pies a convertir");
                numero = teclado .nextDouble();
                P = numero * pulg_pies;
                System.out.println("los " +numero+ " Leguas a pulgadas es "+P);
                break; }
}
}
  
