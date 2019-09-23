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
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle (double l, double w){
        length = l;
        width = w;
    }
    
    public void setLength(double l){
        length = l;
    }
    
    public double getLength (){
        return length;
    }
    
    public void setWidth(double w){
        width = w;
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
    
    
    
}
