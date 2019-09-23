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
public class Cylinder extends Circle {
    
    private double height;

   
    public Cylinder (Circle base, double height){
        this(base.getRadius(), height);

    
    }
    public Cylinder (double radius, double height){
        super(radius);
        this.height = height;
    }

    
    public Circle getBase(){
        return new Circle(this.getRadius());
    }
    
    public void setBase(Circle base){
        this.setRadius(base.getRadius());
    }
    
    public double getHeight(){
        return height;
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
    
    
    public double getSurfaceArea(){
        return super.getArea() * 2 + this.getCircumference() * height;
    }
    
    public void printInfo(){
        System.out.println("Cylinder height: " + this.getHeight());
        System.out.println("Cylinder base radius: " + this.getRadius());
        System.out.println("Cylinder volume: " + this.getVolume());
        System.out.println("Cylinder surface area: " + this.getSurfaceArea());
    }
    
    
    
}
