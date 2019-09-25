/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 01048750
 */
public class BookReport {
    ArrayList<Biography> bioBooks = new ArrayList<>();
    ArrayList<Novel> novelBooks = new ArrayList<>();
    ArrayList<Textbook> textBooks = new ArrayList<>();
    ArrayList<Book> otherBooks = new ArrayList<>();
    
    public static void main (String[] args ){
        JOptionPane.showMessageDialog(null, "Welcome to the Book Database");
        int i = 1;
        while (i == 1){
            String[] choices = { "Biography", "Novel", "Textbook", "Other"};
            String input = (String) JOptionPane.showInputDialog(null, "What type of book would you like to enter into the database?",
            "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null,
            choices, // Array of choices
            choices[0]); // Initial choice
            if (input == null) break;
            switch (input) {
                case "Biography":
                    circleCalc();
                    break;
                case "Novel":
                    rectangleCalc();
                    break;
                case "Textbook":
                    triangleCalc();
                    break;
                case "Other":
                    cylinderCalc();
                    break;
                default:
                    System.out.println("Error: Booktype not found.");
                    break;
            }
            
            
        }
    }
    
    
    public Author collectAuthorInfo(){
        
    }
}
