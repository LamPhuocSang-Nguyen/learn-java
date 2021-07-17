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
        
        int x3 = x2 * x;
        
        int x6 = x3 * x3;
        
        System.out.println("x6 = " + x6);
    }
}
