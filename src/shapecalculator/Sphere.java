/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import javax.swing.JOptionPane;


public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }
    
    public double getSurfaceArea(){
        return 4 * Math.PI * getRadius() * getRadius();
    }
    
    public double getVolume(){
        return (double)4/3 * Math.PI * getRadius() * getRadius() * getRadius(); 
    }
    
    @Override
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "The radius of your sphere is " + getRadius());
        JOptionPane.showMessageDialog(null, "The surface area of your sphere is " + getSurfaceArea());
        JOptionPane.showMessageDialog(null, "The volume of your sphere is " + getVolume());
    }
}
