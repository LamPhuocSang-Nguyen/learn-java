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
        
        System.out.print("Enter radius of sphere: ");
        
        Double radius = input.nextDouble();
        
        Double v = 4.0/3 * 3.14 * radius * radius * radius;
        
        System.out.println("Volume of sphere is " + v);
    }
    
}
