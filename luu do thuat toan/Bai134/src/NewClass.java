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
        Scanner input = new Scanner(System.in);
        
        System.out.print("x = ");
        
        double x = input.nextDouble();
        
        System.out.print("y = ");
        
        double y = input.nextDouble();
        
        System.out.print("z = ");
        
        double z = input.nextDouble();
        
        if(x <= y && y <= z)
        {
            System.out.println("bat dang thuc dung");
        }
        else
        {
            System.out.println("Bat dang thuc khong dung");
        }
    }
}
