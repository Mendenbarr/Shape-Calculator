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
public class Prism extends Rectangle {
    
    //private double width;
    //private double length;
    //private double height;
    
    // What is a rectangluar prism if not a set of 3 rectangles?
    private Rectangle side1;
    private Rectangle side2;
    private Rectangle side3;
    
    public Prism (Rectangle side1, Rectangle side2, Rectangle side3){
        super(side1.getLength(), side1.getWidth());
        this.side1 = new Rectangle(side1.getLength(), side1.getWidth());
        this.side2 = new Rectangle(side2.getLength(), side2.getWidth());
        this.side3 = new Rectangle(side3.getLength(), side3.getWidth());
    }
    
    public Prism (double length, double height, double width){
        super(length, width);
        this.side1 = new Rectangle(length, height);
        this.side2 = new Rectangle(height, width);
        this.side3 = new Rectangle(width, length);
    }
    
    public double getLength(){
        return side1.getLength();
    }
    
    public void setLength(double length){
        side1.setLength(length);
        side3.setWidth(length);
    }
    
    public double getHeight(){
        return side2.getLength();
    }
    
    public void setHeight(double height){
        side2.setLength(height);
        side1.setWidth(height);
    }
    
    public double getWidth(){
        return side3.getLength();
    }
    
    public void setWidth(double width){
        side3.setLength(width);
        side2.setWidth(width);
    }
    
    public double getSurfaceArea(){
        return side1.getArea() * 2 + side2.getArea() * 2 + side3.getArea() * 2;
    }
    
    public double getVolume(){
        return side1.getLength() * side2.getLength() * side3.getLength();
    }
    
    public void printInfo(){
        System.out.println("Length: " + getLength());
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("Surface Area " + getSurfaceArea());
        System.out.println("getVolume " + getVolume());
    }
    
}
