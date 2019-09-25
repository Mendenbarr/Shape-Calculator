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
public class RectangularPrism extends Rectangle {
    
    private double height;
    
    public RectangularPrism (Rectangle base, double height){
        this(base.getLength(), base.getWidth(), height);
    }
    
    public RectangularPrism (double length, double height, double width){
        super(length, width);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }
    
    @Override
    public double getArea(){
        return getSurfaceArea();
    }
    
    public double getLateralArea(){
        return super.getPerimeter() * height;
    }
    
    public double getSurfaceArea(){
        return super.getArea() * 2 + getLateralArea();
    }
    
    @Override
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "The length of your rectangular prism is " + getLength());
        JOptionPane.showMessageDialog(null, "The width of your rectangular prism is " + getWidth());
        JOptionPane.showMessageDialog(null, "The height of your rectangular prism is " + getHeight());
        JOptionPane.showMessageDialog(null, "The volume of your rectangular prism is " + getVolume());
        JOptionPane.showMessageDialog(null, "The surface area of your rectangular prism is " + getSurfaceArea());
    }
    
    
}
