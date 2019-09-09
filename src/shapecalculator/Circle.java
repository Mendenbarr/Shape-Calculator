/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

/**
 *
 * @author 01048750
 */
public class Circle {
    private double radius;
    private double diameter;
    private double circumference;
    private double area;
    
    public Circle (double r){
        setRadius(r);
    }
    
    public void setRadius(double r){
        radius = r;
        diameter = radius * 2;
        circumference = diameter * Math.PI;
        area = Math.PI * radius * radius;
    }
    
    public double getRadius (){
        return radius;
    }
    
    public double getDiameter (){
        return diameter;
    }
    
    public double getCircumference (){
        return circumference;
    }
    
    public double getArea (){
        return area;
    }
    
    
    
}
