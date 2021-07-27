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
        
        System.out.print("Enter a = ");
        
        double a = input.nextDouble();
        
        System.out.print("Enter b = ");
        
        double b = input.nextDouble();
        
        double lc = a;
        
        if(lc > b)
        {
            lc = b;
        }
        
        System.out.println("lc = " + lc);
    }
}
