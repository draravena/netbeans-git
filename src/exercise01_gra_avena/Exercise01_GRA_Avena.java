/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01_gra_avena;

/**
 *
 * @author Haisuri
 */
public class Exercise01_GRA_Avena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "David Avena";
        String name2 = "Kyle Felarca";
        String name3 = "Javi Apao";
        String section1 = "Graviton";
        String section2 = "Tau";
        String section3 = "Gluon";
        byte num_discs1 = 2;
        byte num_discs2 = 1;
        byte num_discs3 = 4;
        
        System.out.println("Student 1:");
        System.out.println("Name: " + name1);
        System.out.println("Section: " + section1);
        System.out.println("Number of discs: " + num_discs1);
        System.out.println();
        System.out.println("Student 2:");
        System.out.println("Name: " + name2);
        System.out.println("Section: " + section2);
        System.out.println("Number of discs: " + num_discs2);
        System.out.println();
        System.out.println("Student 3:");
        System.out.println("Name: " + name3);
        System.out.println("Section: " + section3);
        System.out.println("Number of discs: " + num_discs3);
        System.out.println();
        System.out.println("Kyle Felarca has the most number of discs: " + (num_discs2 > num_discs1 && num_discs2 > num_discs3));
        System.out.println("Javi Apao has the most number of discs: " + (num_discs3 > num_discs1 && num_discs3 > num_discs1));
        System.out.println("Total number of discs: " + (num_discs1 + num_discs2 + num_discs3));
    }
    
}

