/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Grades {
    public int givingNotes(){ 
     return Integer.parseInt(JOptionPane.showInputDialog("Add a value")); 
        }
    
    public String givingStudentName(){
        return JOptionPane.showInputDialog("Add student name: ");
    }
    
    public void StudentGrades (int []grades, String [] student){
        for (int i=0;i<grades.length;i++){
            grades[i]=givingNotes();
            student[i]=givingStudentName();
            
            
        }
        
    }
    public void PassStudents(int [] grades,String[] student){
        for (int i=0;i<grades.length;i++){
        if (grades[i]>=5.0){
            System.out.println("Pass student : " + student[i]);
        }
        else 
                System.out.println("Fail student : " + student[i]);
        
       }
    }
    
    public void ShowList (int [] grades, String [] student){
        for (int i=0;i<grades.length;i++){
            System.out.println("Student: " + student[i] + "\nGrade:" + grades[i]);
        }
    }
    
    public void InOrder (int[] grades, String[] student) {

        int aux;
        String aux2;
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[i] > grades[j]) {
                    aux = grades[i];
                    grades[i] = grades[j];
                    grades[j] = aux;
                    aux2 = student[i];
                    student[i] = student[j];
                    student[j] = aux2;
                }
            }
        }
    }
    public void DeterminateStudent (int [] grades, String [] student){
        String istudent = givingStudentName();
        for (int i=0;i<grades.length;i++){
            if (istudent == student[i]){
                System.out.println("Grades :" + grades[i]);        
            }
            }
            
        }
        
    }

        
    
    
        
        
        
        
        
        
        
     

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
// public void Array(int[] grades){ 
//  
//     for (int i=0;i<10;i++){ 
//     grades[i] = givingNotes(); 
//     
//     }
// }
// public void PassAndFail(int[] grades){ 
//    int pass=0;
//    int fail=0;
//    for (int i=0;i<grades.length;i++){
//        if (grades[i]>=5.0){ 
//            pass++;
//        }
//        else{
//            fail++;
//            }
//    }
//        System.out.println("Pass: " + pass + "\nFails:" + fail);
//            
//    }
// public void AverageNotes(int[] grades){
//     double total = 0;
//     for (int i=0;i<grades.length;i++){
//         total += grades [i]; 
//     }
//     System.out.println("Average grades: " + (total / grades.length) );
//     
// }
// 
// public void HighestGrade(int [] grades){
//     double highest = 0;
//     for (int i =0;i<grades.length;i++){
//         if ( highest < grades[i]){
//             highest = grades[i];
//         }
//     }
//     
//        System.out.println("The highest grade is: " + highest); 
   
     

