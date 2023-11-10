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
public class Teacher {
    // These fields are not used
    final private String name;
    final private String subject;
    // ArrayList with data type 'Section'
    ArrayList<Section> handledSections = new ArrayList<>();
    
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    void giveAssignment(Assignment a) {
        // Goes through each handled section of the teacher
        for (Section e : handledSections) {
            // e.getStudentList() returns an arrayList from the 'Section' class
            // the arrayList is the studentList of the current section of the outer for loop 'e'
            for (Student s : e.getStudentList()) {
                // Adds the assignment 'a' to the current selected student in the arrayList
                s.assignmentList.add(a);
            }
        }
    }
    
    void addSection(Section s) {
        handledSections.add(s);
    }
    
}
