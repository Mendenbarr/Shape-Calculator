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
public class Circle extends Shape {
    private double radius;
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius (){
        return radius;
    }
    
    public double getDiameter (){
        return radius * 2;
    }
    
    @Override
    public double getPerimeter (){
        return radius * 2 * Math.PI;
    }
    
    public double getCircumference (){
        return getPerimeter();
    }
    
    @Override
    public double getArea (){
        return Math.PI * radius * radius;
    }
    
    
    
}
