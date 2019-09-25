/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 01048750
 */
public class ShapeCalculator {
    
    public static void main (String[] args ){
        JOptionPane.showMessageDialog(null, "Welcome to the Shape Calculator.");
        int i = 1;
        while (i == 1){
            String[] choices = { "Circle", "Rectangle", "Triangle", "Cylinder", "Rectangular Prism", "Triangular Prism", "Sphere" };
            String input = (String) JOptionPane.showInputDialog(null, "What type of shape would you like to work with?",
            "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null,
            choices, // Array of choices
            choices[0]); // Initial choice
            if (input == null) break;
            switch (input) {
                case "Circle":
                    circleCalc();
                    break;
                case "Rectangle":
                    rectangleCalc();
                    break;
                case "Triangle":
                    triangleCalc();
                    break;
                case "Cylinder":
                    cylinderCalc();
                    break;
                case "Rectangular Prism":
                    rectangularPrismCalc();
                    break;
                case "Triangular Prism":
                    triangularPrismCalc();
                    break;
                case "Sphere":
                    sphereCalc();
                    break;
                default:
                    System.out.println("Error: Shape not found.");
                    break;
            }
            
            
        }
    }
    
    private static void circleCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Circle Calculator.");
        Circle circle = new Circle(doubleMessageHelper("radius", "circle"));
        circle.printInfo();
    }
    
    private static void rectangleCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Rectangle Calculator.");
        double length = doubleMessageHelper("length", "rectangle");
        double width = doubleMessageHelper("width", "rectangle");
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.printInfo();
    }
    
    private static void triangleCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Triangle Calculator.");
        double sideOne = doubleMessageHelper("first side", "triangle");
        double sideTwo = doubleMessageHelper("second side", "triangle");
        double sideThree = doubleMessageHelper("third side", "triangle");
        Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
        triangle.printInfo();
    }

    private static void cylinderCalc() {
        JOptionPane.showMessageDialog(null, "Welcome to the Cylinder Calculator.");
        double radius = doubleMessageHelper("radius", "cylinder");
        double height = doubleMessageHelper("height", "cylinder");
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.printInfo();
    }
    
    private static void rectangularPrismCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Rectangular Prism Calculator.");
        double length = doubleMessageHelper("length", "rectangular prism");
        double width = doubleMessageHelper("width", "rectangular prism");
        double height = doubleMessageHelper("height", "rectangular prism");
        RectangularPrism rectangularPrism = new RectangularPrism(length, width, height);
        rectangularPrism.printInfo();
    }
    
     private static void triangularPrismCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Triangular Prism Calculator.");
        double sideOne = doubleMessageHelper("first side", "triangular prism");
        double sideTwo = doubleMessageHelper("second side", "triangular prism");
        double sideThree = doubleMessageHelper("third side", "triangular prism");
        double height = doubleMessageHelper("height", "triangular prism");
        TriangularPrism triangularPrism = new TriangularPrism(sideOne, sideTwo, sideThree, height);
        triangularPrism.printInfo();
    }
     
     private static void sphereCalc(){
        JOptionPane.showMessageDialog(null, "Welcome to the Sphere Calculator.");
        Sphere sphere = new Sphere(doubleMessageHelper("radius", "sphere"));
        sphere.printInfo();
    }
    
    // Returns a variable for a shape after ensuring that it is positive.
    private static double doubleMessageHelper(String variable, String shape){
        double v = Double.parseDouble(JOptionPane.showInputDialog("Please enter the " + variable + " of your " + shape + "."));
        while (v < 0){
            v = Double.parseDouble(JOptionPane.showInputDialog("Please enter a positive number for the " + variable + " of your " + shape + "."));
        }
        return v;
    }
    
}
