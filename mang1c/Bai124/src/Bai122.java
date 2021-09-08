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

public class Bai122
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        boolean kq = KtChanLe(a);
        if(kq)
        {
            System.out.println("mang co tinh chan le");
        }
        else
        {
            System.out.println("mang khong co tinh chan le");
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
    public static boolean KtChanLe(int[] a)
    {
        boolean flag = true;
        
        for(int i = 0; i < a.length - 1; i++)
        {
            if((a[i] + a[i + 1]) % 2 == 0)
            {
                flag = false;
            }
        }
        return flag;
    }
}
