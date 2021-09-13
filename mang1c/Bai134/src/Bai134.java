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
        
public class Bai134 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        XayDung(a);
    }
    public static void InputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
        System.out.println();
    }
    public static void OutputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int KtNguyenTo(int a)
    {
        int Dem = 0;
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
            {
                Dem++;
            }
        }
        if(Dem == 2)
        {
            return 1;
        }
        return 0;
    }
    public static int DemNguyenTo(int[] a)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(KtNguyenTo(a[i]) == 1)
            {
                Dem++;
            }
        }
        return Dem;
    }
    public static void XayDung(int[] a)
    {
        int Dem = DemNguyenTo(a);
        int[] b = new int[Dem];
        int  k = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(KtNguyenTo(a[i]) == 1)
            {
                b[k] = a[i];
                k++;
            }
        }
        
        OutputElement(b);
    }
}
