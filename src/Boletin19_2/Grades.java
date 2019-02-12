/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Grades {
  public int givingNotes(){ //método para añadir un valor.
     return Integer.parseInt(JOptionPane.showInputDialog("Add a value")); 
        }
 public void Array(int[] grades){ //creo el método para crear el array; el array lo llamo 'notes'.
  
     for (int i=0;i<10;i++){ //contador para variable int i; la inicializo a i, se generará tantas veces como el tamaño del array sea.
     grades[i] = givingNotes(); //le doy a la variable i, el valor que yo añadiré en el método givingNotes.
     
     }
 }
 public void PassAndFail(int[] grades){ 
    int pass=0;//varaibles para aprobados y suspensos
    int fail=0;
    for (int i=0;i<grades.length;i++){
        if (grades[i]>=5.0){ // si lo que yo añado como nota en el array es mayor a 5 se añadirá a la variable pass si es menor, a la variable fail.
            pass++;
        }
        else{
            fail++;
            }
    }
        System.out.println("Pass: " + pass + "\nFails:" + fail);
            
    }
 public void AverageNotes(int[] grades){
     double total = 0;
     for (int i=0;i<grades.length;i++){
         total += grades [i]; //hago que en total se añadan todas las notas sumadas
     }
     System.out.println("Average grades: " + (total / grades.length) );//divido el total de las notas en 'total' entre 10 (grades.length)
     
 }
 
 public void HighestGrade(int [] grades){
     double highest = 0;
     for (int i =0;i<grades.length;i++){
         if ( highest < grades[i]){
             highest = grades[i];
         }
     }
     
        System.out.println("The highest grade is: " + highest); 
   
     
 }
}










    
        
    
       

