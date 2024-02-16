/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computepowerofanumber;

/**
 *
 * @author Sanele
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the base:");
        double base = scanner.nextDouble();
        
        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();
        
        // Calculate the power using Math.pow() method
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        scanner.close();
    }

}
