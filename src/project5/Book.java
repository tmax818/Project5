/*
 * Project #5
 * Source Code File: Book.java
 * Programmer: Tyler Maxwell
 * Due: 11/18/19
 * Description: Student created class per Project 5 instructions
 */
package project5;


public class Book {
    String author;
    private String title;
    private int pageCount;
    
    public static void main(String[] args) {
        Book defbook = new Book();
        Book newbook = new Book("Parker Cross", "Novel", 567);
        System.out.println(defbook.toString());
        System.out.println(newbook.toString());
        
        VideoGame game = new VideoGame();
        game.player = "Scott Player";
        game.setRating('M');
        game.setScore(10000);
        System.out.println(game.toString());
    }
    
    public Book(){
        this.author = "George Orwell";
        this.title = "1984";
        this.pageCount = 375;
    }
    
    public Book(String author, String title, int pageCount){
        setAuthor(author);
        setTitle(title);
        setPageCount(pageCount);
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        if(author == "Seymour Butts"){
            System.out.println("Very funny!!!");
        } else {
            this.author = author;
        }
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        if(title != "Under the Bleachers"){
            this.title = title;
        }
    }
    
    public int getPageCount(){
        return pageCount;
    }
    
    public void setPageCount(int pageCount){
        if(pageCount > 0 && pageCount <= 1000){
            this.pageCount = pageCount;
        } else {
            System.out.println("Please enter a valid number of pages!");
        }
    }
   
    public String toString(){
        return "title: " + title + ", author: " + author + ", page count: " + pageCount;
    }
}
