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
        
        double x = input.nextDouble();
        
        double fx;
        
        if(x >= 0)
        {
            if(x <= 1)
            {
                fx = 5 * x - 7;
            }
            else
            {
                fx = 2 * x * x * x + 5 * x * x - 8 * x + 3;
            }
        }
        else
        {
            fx = -2 * x * x * x + 6 * x + 9;
        }
        
        System.out.println("f(x) = " + fx);
    }
}
