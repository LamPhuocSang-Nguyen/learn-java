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
        
        System.out.print("Enter n: ");
        
        int n = input.nextInt();
        
        System.out.print("Enter r: ");
        
        double r = input.nextDouble();
        
        double s = 1.0 / 2 * n * r * r * Math.sin(2 * Math.PI / n);
        
        System.out.println("s = " + s);
    }
}
