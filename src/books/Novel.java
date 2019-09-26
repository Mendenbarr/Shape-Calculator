/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;


public class Novel extends Book {
    private String genre;

    public Novel(String title, Author author, int numberOfPages, String genre) {
        super(title, author, numberOfPages);
        this.genre = genre;
    }
    
    public Novel(Book book, String genre) {
        this(book.getTitle(), book.getAuthor(), book.getNumberOfPages(), genre);
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
    
}
