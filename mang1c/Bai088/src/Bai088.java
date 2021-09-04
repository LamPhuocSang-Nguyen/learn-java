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

public class Bai088
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = ChinhPhuongDau(a);
        
        if(kq != 0)
        {
            System.out.println("So chinh phuong dau tien trong mang la: " + kq);
        }
        else
        {
            System.out.println("Mang khong co so chinh phuong");
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
    public static boolean KtChinhPhuong(int a)
    {
        for(int i = 1; i < a; i++)
        {
            if(i * i == a)
            {
                return true;
            }
        }
        return false;
    }
    public static int ChinhPhuongDau(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(KtChinhPhuong(a[i]))
            {
                return a[i];
            }
        }
        return 0;
    }
}