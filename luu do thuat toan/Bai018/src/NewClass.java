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
        
        int x = input.nextInt();
        
        int x2 = x * x;
        
        int x4 = x2 * x2;
        
        int x6 = x4 * x2;
        
        int x12 = x6 * x6;
        
        System.out.println("x12 = " + x12);
        
    }
}
