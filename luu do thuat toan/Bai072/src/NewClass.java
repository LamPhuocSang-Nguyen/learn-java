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
        
        System.out.print("Enter n = ");
        
        int n = input.nextInt();
        
        double s = 0;
        
        int m = 0;
        
        int i = 1;
        
        while(i <= n)
        {
            m = m + i;
            
            s = s + 1.0 / m;
            
            i = i + 1;
        }
        System.out.println("s = " + s);
    }
}
