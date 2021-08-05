/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai001;

/**
 *
 * @author LPSang
 */

import java.util.Scanner;

public class Bai001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of n: ");
        
        int n = input.nextInt();
        
        double[] a = new double[n];
        
        InputElement(n,a);
        
        OutputElement(n,a);
    }
    
    public static void InputElement(int n, double[] a)
    {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextDouble();
        }
    }
    
    public static void OutputElement(int n, double[] a)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
