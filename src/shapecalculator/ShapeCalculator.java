/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import java.util.Scanner;

/**
 *
 * @author 01048750
 */
public class ShapeCalculator {
    
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Shape Calculator.");
        
        while (true){
        System.out.println("Would you like to calculate a circle or a rectangle?");
        String input = sc.next();
        if (null == input){
            System.out.println("Make sure to enter circle or rectangle!");
        }
        else switch (input.toLowerCase()) {
                case "circle":
                    circleCalc();
                    break;
                case "rectangle":
                    rectangleCalc();
                    break;
                default:
                    System.out.println("Make sure to enter circle or rectangle!");
                    break;
            }
        }
    }
    
    public static void circleCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Circle Calculator.");
        System.out.println("Please enter the radius of your circle.");
        double radius = sc.nextDouble();
        while (radius < 0){
            System.out.println("Please enter a positive number for the radius.");
            radius = sc.nextDouble();
        }
        double diameter = radius * 2;
        double circumference = diameter * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.println("The diameter of your circle is " + diameter);
        System.out.println("The circumference of your circle is " + circumference);
        System.out.println("The area of your circle is " + area);
        System.out.println("Have a nice day!");
        
    }
    
    public static void rectangleCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Rectangle Calculator.");
        System.out.println("Please enter the length of your rectangle.");
        double length = sc.nextDouble();
        while (length < 0){
            System.out.println("Please enter a positive number for the length.");
            length = sc.nextDouble();
        }
        System.out.println("Great! Now enter the width of your rectangle.");
        double width = sc.nextDouble();
        while (width < 0){
            System.out.println("Please enter a positive number for the width.");
            width = sc.nextDouble();
        }
        double perimeter = width * 2 + length * 2;
        double area = width * length;
        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The area of your rectangle is " + area);
        System.out.println("Have a nice day!");
        
    }
    
}
