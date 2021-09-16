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

public class Bai142 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        double[] a = new double[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        SapXepDuongTang(a);
    }
    public static void InputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = Math.random() * (100 + 100) - 100;
        }
        System.out.println();
    }
    public static void OutputElement(double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void SapXepDuongTang(double[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            int temp = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > 0 && a[j] > 0)
                {
                    if(a[j] < a[i])
                    {
                        temp = j;
                    }
                }
            }
            if(temp != i)
            {
                double Tam = a[i];
                a[i] = a[temp];
                a[temp] = Tam; 
            }
        }
    }
}
