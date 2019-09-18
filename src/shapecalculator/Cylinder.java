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
public class Cylinder {
    
    private double radius;
    private double height;
    
    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getArea(){
        return Math.PI * radius * radius * height;
    }
    
    public double getSurfaceArea(){
        return Math.PI * radius * radius * 2 + 2 * Math.PI * radius * height;
    }
    
}
