/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai004;

/**
 *
 * @author LPSang
 */
import java.util.Scanner;

public class Bai004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Double PI = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        
        Double radius = input.nextDouble();
        
        Double s = 4 * PI * radius * radius;
        
        System.out.println("Surface area of sphere is: " + s);
    }
    
}
