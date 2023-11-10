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
public class Section {
    // Field not used
    final private String name;
    ArrayList<Student> studentList = new ArrayList<>();
    public Section(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        // Adds the passed argument 'Student' s to the student List of the section
        // Stored as an arrayList.
        studentList.add(s);
    }
    ArrayList<Student> getStudentList() {
        // Returned data type is ArrayList<Student>
        // This means that you return an array instead of single data such as
        // ints, floats, double, etc
        return studentList;
    }
}
