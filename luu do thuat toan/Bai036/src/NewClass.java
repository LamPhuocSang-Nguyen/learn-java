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
        
        int n = input.nextInt();
        
        double x = input.nextDouble();
        
        double t = 1;
        
        int i = 1;
        
        while(i <= n)
        {
            t = t * x;
            
            i = i + 1;
        }
        
        System.out.println("t = " + t);
    }
}