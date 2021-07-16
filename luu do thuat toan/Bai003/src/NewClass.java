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
        final Double PI = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        
        Double radius = input.nextDouble();
        
        Double c = 2 * PI * radius;
        
        System.out.println("Perimeter of circle is: " + c);
    }
}
