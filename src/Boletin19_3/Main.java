/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19_3;

/**
 *
 * @author slorenzorodriguez
 */
public class Main {
    public static void main(String[] args) {
//        Modifica o programa anterior e engadelle un array cos nomes dos alumnos 
//    • Visualiza a nota dun alumno determinado
//    • Visualiza unha lista co nome dos alumnos aprobados.
//    • Fai unha lista ordenada por orden crecente de notas
//    • Visualiza a nota dun alumno determinado que pides por teclado
        
int size = 3;
int [] grades = new int [size];
String [] student = new String [size];

Grades ogrades = new Grades ();
ogrades.givingNotes();
ogrades.givingStudentName();
ogrades.StudentGrades(grades, student);
ogrades.ShowList(grades, student);
        System.out.println("______________________________________");
ogrades.InOrder(grades, student);
ogrades.ShowList(grades, student);
ogrades.DeterminateStudent(grades, student);

  
    }
    
}


