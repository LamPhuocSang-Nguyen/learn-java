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

public class Bai085
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = ChanCuoi(a);
        
        if(kq != 0)
        {
            System.out.println("So chan cuoi cung trong mang la: " + kq);
        }
        else
        {
            System.out.println("Mang khong co so chan");
        }
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
    public static int ChanCuoi(int[] a)
    {
        for(int i = a.length - 1; i >= 0; i--)
        {
            if(a[i] % 2 == 0)
            {
                return a[i];
            }
        }
        return 0;
    }
}