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
        
        double s = 1;
        
        int i = 1;
        
        while(i <= n)
        {
            s = s * (1 + 1.0 / (i * i));
            
            i = i + 1;
        }
        
        System.out.println("s = " + s);
    }
}