/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extracredit_gra_avenadr;
import java.util.ArrayList;

/**
 *
 * @author Haisuri
 */
public class Student {
    final private String name;
    ArrayList<Assignment> assignmentList = new ArrayList<>();
    public Student(String name) {   
        this.name = name;
    }
    void finishAssignment(Assignment a) {
        // Removes the assignment 'a' from the arrayList
        assignmentList.remove(a);
    }
    
    double getTimeNeeded() {
        double totalTime = 0;
        // Goes through each assignment the student has
        // Gets the timeAlloted of each assignment and adds it to
        // 'totalTime'
        for (Assignment e : assignmentList) {
            totalTime += e.getTimeAlloted();
        }
        
        return totalTime;
    }
    String getName() {
        return this.name;
    }
}
