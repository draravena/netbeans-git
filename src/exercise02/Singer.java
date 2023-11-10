/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author Haisuri
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    public Singer(String singer_name, Song fav) {
        favoriteSong = fav;
        name = singer_name;
        System.out.println("Favorite Song: " + favoriteSong.song_name);
        System.out.println("Singer name: " + name);
    }
    void performForAudience(int people) {
        System.out.println(name + " performed for audience.");
        earnings += people * 100;
        System.out.println("Total Earnings: " + earnings);
        noOfPerformances++;
        System.out.println("Number of performances: " + noOfPerformances);
    }
    void changeFavSong(Song new_song) {
        favoriteSong = new_song;
        System.out.println("New Favorite Song: " + favoriteSong.song_name);
    }
}
