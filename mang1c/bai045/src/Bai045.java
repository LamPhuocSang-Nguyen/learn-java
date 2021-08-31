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

public class Bai045 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        double kq = TrungBinhCong(a);
        
        System.out.println("Trung binh cong cac so duong: " + kq);
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
    
    public static double TongDuong(int[] a)
    {
        double sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > 0)
            {
                sum = sum + a[i];
            }
        }
        return sum;
    }
    
    public static int DemDuong(int[] a)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > 0)
            {
                Dem++;
            }
        }
        
        return Dem;
    }
    
    
    public static double TrungBinhCong(int[] a)
    {
       int Dem = DemDuong(a);
       double TongDuong = TongDuong(a);
       
       if(Dem == 0)
       {
           return 0;
       }
       return (TongDuong / Dem);
    }
}
