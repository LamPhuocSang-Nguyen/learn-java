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
        
        System.out.print("Enter degree F: ");
        
        Double f = input.nextDouble();
        
        Double c = 5.0 / 9 * (f - 32);
        
        System.out.println(f + " degree of f is " + c + " degree of c");
    }
}
