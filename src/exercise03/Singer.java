/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

/**
 *
 * @author Haisuri
 */
public class Singer {
    public static int totalPerformances = 0;
    private String _name;
    private int _noOfPerformances;
    private double _earnings;
    private Song _favoriteSong;
    public Singer() {}  
    public Singer(String name) {
        init(name, null);
        System.out.println("New Singer: " + _name);
    }
    public Singer(String name, Song fav) {
        init(name, fav);
        System.out.println("Favorite Song: " + _favoriteSong.getName());
        System.out.println("New Singer: " + _name);
    }
    private void init(String name, Song fav) {
        _name = name;
        _favoriteSong = fav;
    }
    public void performForAudience(int people) {
        System.out.println("\n" + _name + " performed for audience. ");
        totalPerformances++;
        _noOfPerformances++;
        _earnings += people * 100;
        System.out.println(_name + "'s earnings: " + _earnings + "\n");
    }
    public void changeFavSong(Song new_song) {
        _favoriteSong = new_song;
        System.out.println(_name + "'s new Favorite Song: " + _favoriteSong.getName() + "\n");
    }
    
    public void performForAudience(Singer singer2, int people) {
        String singer2_name = singer2.getName();
        totalPerformances++;         // Increment total performances
        _noOfPerformances++;         // Increment Singer1's number of performances
        singer2.incrementNoPerformances(); // Increment Singer2's number of performances
        System.out.println(_name + " performed with " + singer2_name + ".\n");
        _earnings += 50 * people;   // Give half the earnings to Singer1
        singer2.addEarnings(50 * people); // Give the other half to Singer2
        System.out.println(_name + "'s earnings: " + _earnings);  // Print out Singer1's earnings
        System.out.println(singer2_name + "'s earnings: " + singer2.getEarnings() + "\n"); // Print out Singer2's earnings
        System.out.println(_name + " number of performances: " + _noOfPerformances);  // Print out Singer1's noOfPerformances
        System.out.println(singer2_name + " number of performances: " + singer2.getNoOfPerformances()); // Print out Singer2's noOfPerformances
        System.out.println("\nTotal number of performances: " + totalPerformances + "\n"); // Print out total number of performances
    }
    
    // Accessor Methods 
    public String getName() {
        return _name;
    }
    public String getFavSong() {
        return _favoriteSong.getName();
    }
    public double getEarnings() {
        return _earnings;
    }
    
    public int getNoOfPerformances() {
        return _noOfPerformances;
    }
    
    // Mutator Methods
    public void addEarnings(double earnings) {
        _earnings += earnings;
    }
    public void incrementNoPerformances() {
        _noOfPerformances++;
    }
}
