/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19_2;

/**
 *
 * @author slorenzorodriguez
 */
public class Main {
  public static void main(String[] args) {
        int [] grades =new int [10]; //creo el array con un tamaño de 10
        Grades damGrades = new Grades(); //creo el objeto damNotes
        damGrades.Array(grades);
        damGrades.givingNotes();
        damGrades.PassAndFail(grades);
        damGrades.AverageNotes(grades);
        damGrades.HighestGrade(grades);
        
        
        
}
}   

