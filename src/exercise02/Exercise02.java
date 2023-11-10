/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

/**
 *
 * @author Haisuri
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Players Kyle = new Players("Kyle Felarca", 5, 2026);
        Players Nitsu = new Players("Augustine Serra", 18, 2026);
        Players Alex = new Players("Alex Andal", 15, 2024);
        
        Song Ditto = new Song("Ditto", "NewJeans", "K-Pop", 2022);
        Song Favoritism = new Song("Favoritism", "Shes Only Sixteen", "Alternative/Indie", 2017);
        
        Singer Javi = new Singer("Javi Apao", Ditto);
        Javi.performForAudience(12);
        Javi.changeFavSong(Favoritism);
    }
    
}
