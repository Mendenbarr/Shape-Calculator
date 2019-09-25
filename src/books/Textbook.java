/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;


public class Textbook extends Book {
    private String gradeLevel;

    public Textbook(String title, Author author, int numberOfPages, String gradeLevel) {
        super(title, author, numberOfPages);
        this.gradeLevel = gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public String getGradeLevel() {
        return gradeLevel;
    }
    
    
    
}
