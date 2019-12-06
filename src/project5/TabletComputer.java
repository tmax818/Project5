/*
 * Project #5
 * Source Code File: TabletComputer.java
 * Programmer: Tyler Maxwell
 * Due: 11/18/19
 * Description: Tablet Computer class per instructions in Project 5.
 */

package project5;

public class TabletComputer {
    String type;
    private int version;
    private boolean isNew;
    
        public static void main(String[] args) {
            TabletComputer myTablet = new TabletComputer("Android", 5, false);
            TabletComputer defTablet = new TabletComputer();
            System.out.println(myTablet.toString());
            System.out.println(defTablet.toString());
            
            Book book = new Book();
            book.setTitle("My Novel");
            book.setPageCount(765);
            book.author = "Joe Author";
            System.out.println(book.toString());
    }
    
    public TabletComputer(){
        this.type = "OS";
        this.version = 1;
        this.isNew = true;
    }
    
    public TabletComputer(String type, int version, boolean isNew){
        setType(type);
        setVersion(version);
        setIsNew(isNew);
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        if(type == "OS" || type == "Android"){
            this.type = type;
        } else {
            System.out.println("Please enter a valid type.");
        }
    }
    
    public int getVersion(){
        return version;
    }
    
    public void setVersion(int version){
        if(version > 0){
            this.version = version;
        }
    }
    
    public boolean getIsNew(){
        return isNew;
    }
    
    public void setIsNew(boolean isNew){
        if(isNew == true || isNew == false){
            this.isNew = isNew;
        } else {
            System.out.println("Please enter true or false");
        }
    }
    
    static String condition(boolean isNew){
        return isNew ? "new" : "used";
    }
   
    public String toString(){
        return "This tablet is an " + type + ", its version is " + version + 
                " and its condition is " + condition(isNew);
    }
    
    
    
}
