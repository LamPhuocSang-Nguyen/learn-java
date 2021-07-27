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

public class NewClass {
    public static void main(String[] args)
    {
        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);
             
        do
        {
            System.out.print("Enter x = ");
            x = input.nextDouble();
            
        }while(x < 0);
        
        do
        {
            System.out.print("Enter y = ");
            y = input.nextDouble();
            
        }while(y < 0);
        
        do
        {
            System.out.print("Enter z = ");
            z = input.nextDouble();
            
        }while(z < 0);
        
        
        if((x + y) > z && (x + z) > y && (y + z) > x)
        {
            System.out.println("tam giac");
        }
        else
        {
            System.out.println("khong phai tam giac");
        }
    }
}