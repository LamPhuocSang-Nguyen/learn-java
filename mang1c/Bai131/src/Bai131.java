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

public class Bai131
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = DemGiaTri(a);
        
        System.out.println("So luong Cac phan tu lon hon cac gia tri dung dang truoc no"
                + "la : " + kq);
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
    public static int DemGiaTri(int[] a)
    {
        int Dem = 0;
        
        for(int i = 1; i < a.length; i++)
        {
            boolean flag = true;
            for(int j = 0; j < i; j++)
            {
                if(a[j] > a[i])
                {
                    flag = false;
                }
            }
            if(flag)
            {
                Dem++;
            }
        }
        return Dem;
    }
}