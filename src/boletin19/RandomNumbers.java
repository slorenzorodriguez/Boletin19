/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author slorenzorodriguez
 */
public class RandomNumbers {
        int [] numbers = new int [6]; 
     
     public void Random(){
        for (int i = 0; i<6; i++){
       numbers[i] = (int) (Math.random()*50)+1;
            System.out.println(numbers[i]);
    int [] number = new int [6]; 
     }
            
        }
     
     public void RandomUpsideDown(){
         System.out.println("******at the oppositte way******");
      for (int oppo=6-1; oppo>=0; oppo--){
            System.out.println(numbers[oppo]);
             
             
         }
          
     }
}
