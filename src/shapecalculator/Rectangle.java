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
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength (){
        return length;
    }
    
    public double getWidth (){
        return width;
    }
    
    @Override
    public double getPerimeter (){
        return 2 * length + 2 * width;
    }
    
    @Override
    public double getArea (){
        return length * width;
    }
    
    @Override
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "The length of your rectangle is " + getLength());
        JOptionPane.showMessageDialog(null, "The width of your rectangle is " + getWidth());
        JOptionPane.showMessageDialog(null, "The perimeter of your rectangle is " + getPerimeter());
        JOptionPane.showMessageDialog(null, "The area of your rectangle is " + getArea());
    }
}
