/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai007;

/**
 *
 * @author LPSang
 */
import java.util.Scanner;

public class Bai007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        float[] a = new float[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        EnumeratePositiveNumber(a);
    }
    
    public static void InputElement(float[] a)
    {
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < a.length; i++)
        {
            //(Math.random() * (max - min)) + min 
            a[i] = (float)(Math.random() * (100 + 100)) - 100;
        }
    }
    
    public static void OutputElement(float[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void EnumeratePositiveNumber(float[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > 0)
            {
                System.out.println(a[i] + " ");
            }
        }
    }
}
