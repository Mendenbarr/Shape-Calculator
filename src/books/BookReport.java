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


    private static ArrayList<Object> books = new ArrayList<>();
    private static int bookNumber = 1;
    
    public static void main (String[] args ){
        JOptionPane.showMessageDialog(null, "Welcome to the Book Database");
        int i = 1;
        while (i == 1){
            String[] choices = { "Biography", "Novel", "Textbook", "Other", "I'm finished"};
            String input = (String) JOptionPane.showInputDialog(null, "What type of book would you like to enter into the database?",
            "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null,
            choices, // Array of choices
            choices[0]); // Initial choice
            if (input == null) break;
            switch (input) {
                case "Biography":
                    books.add(collectBiographyInfo());
                    break;
                case "Novel":
                    books.add(collectNovelInfo());
                    break;
                case "Textbook":
                    books.add(collectTextbookInfo());
                    break;
                case "Other":
                    books.add(collectBookInfo());
                    break;
                case "I'm finished":
                    reportAllBooks();
                    i = 2;
                    break;
                default:
                    System.out.println("Error: Booktype not found.");
                    break;
            }
        }
    }

    public static Author collectAuthorInfo(){
        String name = stringMessageHelper("name", "author");
        String email = stringMessageHelper("email", "author");
        String address = stringMessageHelper("address", "author");
        return new Author(name, email, address);
    }
    
    public static Book collectBookInfo(){
        String title = stringMessageHelper("title", "book");
        Author author = collectAuthorInfo();
        int numOfPages = Integer.parseInt(stringMessageHelper("number of pages", "book"));
        return new Book(title, author, numOfPages);
    }
        
    public static Biography collectBiographyInfo(){
        Book book = collectBookInfo();
        String subject = stringMessageHelper("subject", "biography");
        return new Biography(book, subject);
    }
            
    public static Novel collectNovelInfo(){
        Book book = collectBookInfo();
        String genre = stringMessageHelper("genre", "novel");
        return new Novel(book, genre);
    }
                
    public static Textbook collectTextbookInfo(){
        Book book = collectBookInfo();
        String gradeLevel = stringMessageHelper("grade level", "textbook");
        return new Textbook(book, gradeLevel);
    }
    
    
    // Returns a String for for a variable of a subject.
    // Example, the address of the author, or the title of the book
    private static String stringMessageHelper(String variable, String subject){
        return JOptionPane.showInputDialog("Please enter the " + variable + " of your " + subject + ".");
    }
    
    // Currently unnecessary, but opens up the option for multiple book lists. 
    private static void reportAllBooks() {
        reportBookGroup(books);
    }
    
    // Reports on every book added to the book ArrayList. 
    // Extra String defaults to being empty, and adds on addtional information
    // If the class of the current object matches any of the if statements. 
    private static void reportBookGroup(ArrayList a){
        for (int i = a.size(); i > 0; i--){
            String extra = "";
            if (a.get(0) instanceof Biography){
                Biography b = (Biography)a.get(0);
                extra = " This book is a biography that covers " + b.getSubject() + ".";
            }
            else if (a.get(0) instanceof Novel){
                Novel b = (Novel)a.get(0);
                extra = " This book is a Novel with a genre of " + b.getGenre() + ".";
            }
            else if (a.get(0) instanceof Textbook){
                Textbook b = (Textbook)a.get(0);
                extra = " This book is a Textbook for grade level " + b.getGradeLevel() + ".";
            }
            reportBook((Book) a.get(0), extra);
            a.remove(0);
        }
    }
    
    // Crafts a String and displays it with JOptionPane based on a book. 
    // Extra can be used to append addtional information to the end of the book String.
    private static void reportBook(Book book, String extra) {
        JOptionPane.showMessageDialog(null, "Book " + bookNumber++ + ": " + book.getTitle() + 
                ". Written by " + book.getAuthor().getName() + " and " + book.getNumberOfPages() + 
                " pages long. You can reach the author at their email, " + book.getAuthor().getEmail() +
                ", or by sending mail to " + book.getAuthor().getAddress() + "." + extra);
    }
    
}
