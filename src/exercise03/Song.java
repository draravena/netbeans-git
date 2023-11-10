/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

/**
 *
 * @author Haisuri
 */
public class Song {
    private String _name;
    private String _artist;
    private String _genre;
    private int _year_release;
    public Song() {}
    public Song(String name, String artist, String genre, int year_release) {
        _name = name;
        _artist = artist;
        _genre = genre;
        _year_release = year_release;
    }
    
    // Accessor Methods
    
    public String getName() {
        return _name;
    }
    public String getArtistName() {
        return _artist;
    }
    public String getGenre() {
        return _genre;
    }
    public int getYear() {
        return _year_release;
    }
}
