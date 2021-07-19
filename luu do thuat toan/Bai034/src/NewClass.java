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
        
        double s = 0;
        
        int i = 1;
        
        while(i <= ((2 * n) + 1))
        {
            s = s + (double)i / (i + 1);
            
            i = i + 2;
        }
        
        System.out.println("s = " + s);
    }
}
