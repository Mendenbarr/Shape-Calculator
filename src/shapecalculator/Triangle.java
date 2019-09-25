/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author 01048750
 */
public class Triangle extends Shape {
    
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    
    public Triangle (double sideOne, double sideTwo, double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }
    
    @Override
    public double getPerimeter(){
        return sideOne + sideTwo + sideThree;
    }
    
    @Override
    public double getArea(){
        double s = (sideOne + sideTwo + sideThree) /2;
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }
    
    @Override
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "The first side of your triangle is " + getSideOne());
        JOptionPane.showMessageDialog(null, "The second side of your triangle is " + getSideTwo());
        JOptionPane.showMessageDialog(null, "The third side of your triangle is " + getSideThree());
        JOptionPane.showMessageDialog(null, "The perimeter of your triangle is " + getPerimeter());
        JOptionPane.showMessageDialog(null, "The area of your triangle is " + getArea());
    }
    
    
}
