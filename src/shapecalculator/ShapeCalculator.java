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
        
        int i = 1;
        while (i == 1){
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
                case "end":
                    i = 2;
                    break;
                default:
                    System.out.println("Make sure to enter circle or rectangle!");
                    System.out.println("Or use end if you are finished.");
                    break;
            }
        }
    }
    
    public static void circleCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Circle Calculator.");
        System.out.println("Please enter the radius of your circle.");
        Circle circle = new Circle(sc.nextDouble());
        while (circle.getRadius() < 0){
            System.out.println("Please enter a positive number for the radius.");
            circle.setRadius(sc.nextDouble());
        }
        System.out.println("The diameter of your circle is " + circle.getDiameter());
        System.out.println("The circumference of your circle is " + circle.getCircumference());
        System.out.println("The area of your circle is " + circle.getArea());
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
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("The perimeter of your rectangle is " + rectangle.getPerimeter());
        System.out.println("The area of your rectangle is " + rectangle.getArea());
        System.out.println("Have a nice day!");
    }
    
}
