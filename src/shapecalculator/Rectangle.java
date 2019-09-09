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
public class Rectangle {
    private double length;
    private double width;
    private double perimeter;
    private double area;
    
    public Rectangle (double l, double w){
        setLength(l);
        setWidth(w);
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
    
    public double getPerimeter (){
        perimeter = 2 * length + 2 * width;
        return perimeter;
    }
    
    public double getArea (){
        area = length * width;
        return area;
    }
    
    
    
}
