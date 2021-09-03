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

public class Bai063 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        LietKe(a);
    }
    public static void InputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
    }
    public static void OutputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int TanSuat(int[] a, int b)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(b == a[i])
            {
                Dem++;
            }
        }
        
        return Dem;
    }
    public static void LietKe(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(TanSuat(a, a[i]) == 1)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}