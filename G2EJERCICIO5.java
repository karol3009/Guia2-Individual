/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class G2EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double sopas_veg = 10.000;
        double ensaladas = 25.000;
        double jugos = 5.000;
        double band_carne = 30.000;  
        double band_pollo = 28.000;
        double perro_calient = 5.000;  
        double hambur = 7.000;
        double valortotalveg, valortotalnoveg, valor_totalc_rapidas ;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("que va a ordenar tenemos 3 tipos de comidas: ");
        System.out.println("1: vegetariana");
        System.out.println("2: no vegetariana ");
        System.out.println("3: comidas rapidas");
        int comidasveg = teclado.nextInt();
        
        System.out.println("cuantas unidades desea ordenar: ");
        int cantplatos = teclado.nextInt();
                
        System.out.println("tenemos comidas no vegetarianas para que escojas: ");
        System.out.println("1: bandeja con carne");
        System.out.println("2: bandeja con pollo");
        int comidasnoveg = teclado.nextInt();
        
        System.out.println("cuantas unidades desea ordenar: ");
        int cantplatos2 = teclado.nextInt();
        
        System.out.println("tenemos comidas rapidas para que escojas: ");
        System.out.println("1: perros calientes");
        System.out.println("2: hamburguesas");
        int comidasrap = teclado.nextInt();
        
        System.out.println("cuantas unidades desea ordenar: ");
        int cantplatos3 = teclado.nextInt();
        int cantplatosord = cantplatos3 + cantplatos2 + cantplatos;
        System.out.println("la cantidad de platos ordenados es : "+cantplatosord);
        
        valortotalveg = cantplatos  * 0.19 * (sopas_veg + ensaladas + jugos) - 0.20;
        System.out.println("el valor de los platos vegetarianos con iva incluido es: "+valortotalveg);
        
        valortotalnoveg = comidasnoveg  * 0.19 * (band_carne + band_pollo) - 0.10;
        System.out.println("el valor de los platos no vegetarianos con iva incluido es: "+valortotalnoveg);
        
        valor_totalc_rapidas = comidasrap  * 0.19 * (perro_calient + hambur );
        System.out.println("el valor de las comidas rapidas con iva incluido es: "+valor_totalc_rapidas);
            }
        
    }
    


