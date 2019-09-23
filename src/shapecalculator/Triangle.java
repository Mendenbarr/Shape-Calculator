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
public class Triangle extends Shape {
    
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double Side;
    private double perimeter;
    private double area;
    
    public Triangle (double s1, double s2, double s3){
        sideOne = s1;
        sideTwo = s2;
        sideThree = s3;
        Side = (sideOne + sideTwo + sideThree) /2;
        area = Math.sqrt(Side * (Side - sideOne) * (Side - sideTwo) * (Side - sideThree));
        perimeter = sideOne + sideTwo + sideThree;
    }
    
    @Override
    public double getPerimeter(){
        return perimeter;
    }
    
    @Override
    public double getArea(){
        return area;
    }
    
    
    
}
