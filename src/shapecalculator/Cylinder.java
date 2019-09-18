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
    
    private Circle base;
    private double height;
    
    public Cylinder (Circle base, double height){
        this(base.getRadius(), height);
    }
    public Cylinder (double radius, double height){
        this.base = new Circle(radius);
        this.height = height;
    }
    
    public Circle getBase(){
        return base;
    }
    
    public void setBase(Circle base){
        this.base = new Circle(base.getRadius());
    }
    
    public double getRadius(){
        return base.getRadius();
    }
    
    public void setRadius(double radius){
        base.setRadius(radius);
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    /**
     *
     * @return double
     */
    public double getVolume(){
        return base.getArea() * height;
    }
    
    public double getSurfaceArea(){
        return base.getArea() * 2 + base.getCircumference() * height;
    }
    
    public void printInfo(){
        System.out.println("Cylinder height: " + this.getHeight());
        System.out.println("Cylinder base radius: " + this.getRadius());
        System.out.println("Cylinder volume: " + this.getVolume());
        System.out.println("Cylinder surface area: " + this.getSurfaceArea());
    }
    
    
    
}
