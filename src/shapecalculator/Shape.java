/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author 01048750
 */
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public void printInfo(){
        JOptionPane.showMessageDialog(null, "Error: This shape is missing it's printInfo method");
    }
    
}
