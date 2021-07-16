/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LPSang
 */

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Program convert degree C to degree F");
        
        System.out.print("Enter degree c: ");
        
        Double c = input.nextDouble();
        
        Double f = 9.0 / 5 * c + 32;
        
        System.out.println("Degree F is: " + f);
    }
    
}
