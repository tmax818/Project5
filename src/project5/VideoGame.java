/*
 * Project #5
 * Source Code File: VideoGame.java
 * Programmer: Tyler Maxwell
 * Due: 11/18/19
 * Description: Video Game class per instructions in Project 5.
 */

package project5;


public class VideoGame {
    String player;
    private int score;
    private char rating;
    
        public static void main(String[] args) {
            VideoGame defgame = new VideoGame();
            VideoGame testgame = new VideoGame("Jeff", 45, 'A');
            System.out.println(defgame.toString());
            System.out.println(testgame.toString());
            
            TabletComputer tablet = new TabletComputer();
            tablet.type = "Android";
            tablet.setIsNew(true);
            tablet.setVersion(4);
            System.out.println(tablet.toString());
    }
    
    public VideoGame(){
        this.player = "Player1";
        this.score = 0;
        this.rating = 'E';
    }
    
    public VideoGame(String player, int score, char rating){
        setPlayer(player);
        setScore(score);
        setRating(rating);
    }
    
    public String getPlayer(){
        return player;
    }
    
    public void setPlayer(String player){
        if(player == "Joe Shmoe"){
            System.out.println("Very funny!!!");
        } else {
            this.player = player;
        }
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        if(score > 0){
            this.score = score;
        } else {
            System.out.println("Please enter a valid score.");
        }
    }
    
    public char getRating(){
        return rating;
    }
    
    public void setRating(char rating){
        if(rating == 'E' || rating == 'A' || rating == 'M'){
            this.rating = rating;
        } else {
            System.out.println("Please enter 'E', 'A' or 'M'.");
        }
    }
    
    public String toString(){
        return "player: " + player + ", score: " + score + ", rating: " + rating;
    }
    
}
