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
public class Cylinder extends Circle {
    
    private double height;

   
    public Cylinder (Circle base, double height){
        this(base.getRadius(), height);
    }
    
    public Cylinder (double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public void setBase(Circle base){
        this.setRadius(base.getRadius());
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public Circle getBase(){
        return new Circle(this.getRadius());
    }
    
    public double getHeight(){
        return height;
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
        JOptionPane.showMessageDialog(null, "The radius of your cylinder is " + getRadius());
        JOptionPane.showMessageDialog(null, "The height of your cylinder is " + getHeight());
        JOptionPane.showMessageDialog(null, "The volume of your cylinder is " + getVolume());
        JOptionPane.showMessageDialog(null, "The surface area of your cylinder is " + getSurfaceArea());
    }
    
    
    
}
