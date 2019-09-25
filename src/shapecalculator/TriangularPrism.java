/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import javax.swing.JOptionPane;


public class TriangularPrism extends Triangle {
    
    private double height;

    public TriangularPrism(double sideOne, double sideTwo, double sideThree, double height) {
        super(sideOne, sideTwo, sideThree);
        this.height = height;
    }
    
    public TriangularPrism(Triangle base, double height){
        this(base.getSideOne(), base.getSideTwo(), base.getSideThree(), height);
    }
    
     public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
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
        JOptionPane.showMessageDialog(null, "The first side of your triangular prism is " + getSideOne());
        JOptionPane.showMessageDialog(null, "The second side of your triangular prism is " + getSideTwo());
        JOptionPane.showMessageDialog(null, "The third side of your triangular prism is " + getSideThree());
        JOptionPane.showMessageDialog(null, "The volume of your triangular prism is " + getVolume());
        JOptionPane.showMessageDialog(null, "The surface area of your triangular prism is " + getSurfaceArea());
    }
}
