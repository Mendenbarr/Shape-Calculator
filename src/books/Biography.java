/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;


public class Biography extends Book {
    private String subject;

    public Biography(String title, Author author, int numberOfPages, String subject) {
        super(title, author, numberOfPages);
        this.subject = subject;
    }
    
    public Biography(Book book, String subject) {
        this(book.getTitle(), book.getAuthor(), book.getNumberOfPages(), subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    
    
    
}
