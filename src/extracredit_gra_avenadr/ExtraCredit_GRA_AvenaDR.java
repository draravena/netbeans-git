/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extracredit_gra_avenadr;

/**
 *
 * @author Haisuri
 */
public class ExtraCredit_GRA_AvenaDR {
    
    public static void main(String[] args) {
        // The field 'name' of each class is not necessary but is on the specification
        // Only the 'name' of the Student class is actually used
        
        // Instantiation of each object
        
        // Teachers
        Teacher t1 = new Teacher("Ma'am Kiel", "Math");
        Teacher t2 = new Teacher("Sir Flip", "Computer Science");
        Teacher t3 = new Teacher("Sir Neil", "Physics");
        
        // Students
        Student s1 = new Student("Ranielle");
        Student s2 = new Student("Von");
        Student s3 = new Student("Alex");
        
        // Sections
        Section c1 = new Section("Graviton");
        Section c2 = new Section("Gluon");
        
        // Assignments
        Assignment a1 = new Assignment("FA", 2);
        Assignment a2 = new Assignment("Quiz",3);
        Assignment a3 = new Assignment("AA",5);
        
        // Adds the student 's1' to Graviton/c1
        c1.addStudent(s1);
        // Adds the student 's2' to Graviton/c1
        c1.addStudent(s2);
        // Adds the student 's3' to Gluon/c2
        c2.addStudent(s3);
        
        // Makes t1 handle the sections Gravition & Gluon / c1 & c2
        t1.addSection(c1);
        t1.addSection(c2);
        // Makes t2 handle only Gluon/c2
        t2.addSection(c2);
        // Makes t3 handle only Graviton/c1
        t3.addSection(c1);
        
        // Gives assignments to all students in handled sections
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        // Student 2 finishes assignment removing it from the arrayList before printing
        s2.finishAssignment(a1);
        // The remaining work of s2 if this method wasnt here would be:
        // 7.00 instead of 5.00 
        // 'a1' is an assignment with timeAlloted = 2.00
        System.out.printf("%s's remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s's remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s's remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
    
}
