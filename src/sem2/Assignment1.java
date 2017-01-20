/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2;

import java.util.Scanner;

/**
 *
 * @author Rutul
 */
public class Assignment1 {
    public static void main(String[]args)
    {
        String name;
        System.out.println("Hello Github");
        System.out.println("This is my first assignment");
        System.out.print("Enter your name here: ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        System.out.printf("Hii %s  Welcome to Github    ",name);
    }
    
}
